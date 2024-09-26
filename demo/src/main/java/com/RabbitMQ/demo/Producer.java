package com.RabbitMQ.demo;

import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.Channel;

public class Producer {

    private final static String QUEUE_NAME = "hello_queue"; // Altere para o mesmo nome da fila

    public static void main(String[] argv) throws Exception {

        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost"); // Host do RabbitMQ (localhost se estiver rodando localmente)
        factory.setPort(5672); // Porta padrão para comunicação AMQP
        factory.setUsername("guest"); // Usuário padrão
        factory.setPassword("guest"); // Senha padrão

        // Estabelece a conexão e o canal
        try (Connection connection = factory.newConnection();
             Channel channel = connection.createChannel()) {

            // Declara uma fila
            channel.queueDeclare(QUEUE_NAME, false, false, false, null);
            String message = "New Test!";

            // Publica uma mensagem na fila
            channel.basicPublish("", QUEUE_NAME, null, message.getBytes());
            System.out.println(" [x] Sent '" + message + "'");
        }
    }
}
