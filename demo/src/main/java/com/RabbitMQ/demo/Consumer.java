package com.RabbitMQ.demo;

import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.DeliverCallback;

public class Consumer {
    private final static String QUEUE_NAME = "hello_queue"; // Verifique o nome da fila

    public static void main(String[] argv) throws Exception {
        // Configurando a fábrica de conexões
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");
        factory.setUsername("guest"); // Use o usuário padrão guest
        factory.setPassword("guest"); // Use a senha padrão guest

        // Criando conexão e canal
        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();

        // Declarando a fila
        channel.queueDeclare(QUEUE_NAME, false, false, false, null);
        System.out.println(" [*] Aguardando mensagens. Para sair pressione CTRL+C");

        // Callback para receber mensagens
        DeliverCallback deliverCallback = (consumerTag, delivery) -> {
            String message = new String(delivery.getBody(), "UTF-8");
            System.out.println(" [x] Recebeu: '" + message + "'");
        };

        // Consumindo mensagens da fila
        channel.basicConsume(QUEUE_NAME, true, deliverCallback, consumerTag -> { });
    }
}
