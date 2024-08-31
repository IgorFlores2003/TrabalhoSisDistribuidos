package com.RabbitMQ.demo;

import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.Channel;

public class ProducerLoadTest {
    private final static String QUEUE_NAME = "load_test_queue";

    public static void main(String[] argv) throws Exception {
        // Configurando a fábrica de conexões
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");
        factory.setPort(5672);
        factory.setUsername("guest");
        factory.setPassword("guest");

        try (Connection connection = factory.newConnection();
             Channel channel = connection.createChannel()) {

            // Declarando a fila
            channel.queueDeclare(QUEUE_NAME, true, false, false, null);

            for (int i = 0; i < 10000; i++) {
                String message = "Mensagem de carga número " + i;
                channel.basicPublish("", QUEUE_NAME, null, message.getBytes());
                System.out.println(" [x] Enviou: '" + message + "'");
            }
        }
    }
}