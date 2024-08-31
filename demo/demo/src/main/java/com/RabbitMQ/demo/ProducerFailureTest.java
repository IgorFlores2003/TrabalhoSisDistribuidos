package com.RabbitMQ.demo;

import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.Channel;

public class ProducerFailureTest {
    private final static String QUEUE_NAME = "failure_test_queue";

    public static void main(String[] argv) {
        // Configurando a fábrica de conexões
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");
        factory.setPort(5672);
        factory.setUsername("guest");
        factory.setPassword("gu2est");

        Connection connection = null;
        Channel channel = null;

        try {
            // Tentando estabelecer a conexão
            connection = factory.newConnection();
            channel = connection.createChannel();

            // Declarando a fila como durável para garantir a persistência das mensagens
            channel.queueDeclare(QUEUE_NAME, true, false, false, null);

            String message = "Testando falhas - Mensagem persistente!";
            channel.basicPublish("", QUEUE_NAME, null, message.getBytes());
            System.out.println(" [x] Enviou: '" + message + "'");


        } catch (Exception e) {
            // Tratamento de exceções
            System.err.println(" [!] Ocorreu uma falha: " + e.getMessage());

            // Exemplo de ação: Tentativa de reconexão
            for (int i = 1; i <= 3; i++) {
                try {
                    System.out.println(" [] Tentando reconectar... Tentativa " + i);
                    connection = factory.newConnection();
                    channel = connection.createChannel();
                    channel.queueDeclare(QUEUE_NAME, true, false, false, null);
                    channel.basicPublish("", QUEUE_NAME, null, "Reconexão bem-sucedida!".getBytes());
                    System.out.println(" [x] Reconexão bem-sucedida e mensagem enviada!");
                    break;
                } catch (Exception retryException) {
                    System.err.println(" [!] Falha na reconexão: " + retryException.getMessage());
                    if (i == 3) {
                        System.err.println(" [!] Não foi possível reconectar após 3 tentativas. Encerrando...");
                    }
                }
            }

        } finally {
            try {
                if (channel != null) channel.close();
                if (connection != null) connection.close();
            } catch (Exception closeException) {
                System.err.println(" [!] Erro ao fechar recursos: " + closeException.getMessage());
            }
        }
    }
}