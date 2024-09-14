Neste tutorial, você aprenderá como instalar o RabbitMQ no Windows 11 e começar a usá-lo para filas de mensagens e comunicação entre aplicativos.

Baixar o instalador do RabbitMQ: Acesse o site oficial do RabbitMQ (www.rabbitmq.com) e baixe o instalador para Windows compatível com a arquitetura do seu sistema (32 bits ou 64 bits).

Executar o instalador: Depois de baixar o instalador, clique duas vezes nele para iniciar o assistente de instalação.

Instalar RabbitMQ: Siga os passos do assistente de instalação para instalar o RabbitMQ no seu sistema Windows 11. Você pode escolher o diretório de instalação e outras configurações durante o processo.

Iniciar o serviço RabbitMQ: Após a instalação estar completa, abra o Gerenciador de Serviços do Windows procurando por "Serviços" no menu Iniciar. Encontre o serviço "RabbitMQ" na lista, clique com o botão direito nele e selecione "Iniciar" para iniciar o serviço RabbitMQ.

Acessar a interface de gerenciamento do RabbitMQ: Abra o seu navegador e vá para http://localhost:15672/. Isso levará você à Interface de Gerenciamento do RabbitMQ.

Fazer login: Faça login na Interface de Gerenciamento do RabbitMQ usando as credenciais padrão (usuário: "guest" e senha: "guest"). É essencial alterar a senha padrão por motivos de segurança.

Criar filas e exchanges: Na Interface de Gerenciamento do RabbitMQ, você pode criar filas, exchanges e associações para facilitar a comunicação entre aplicativos.



![image](https://github.com/user-attachments/assets/e05a927b-10ae-4463-a937-c0740023b64e)

![image](https://github.com/user-attachments/assets/2cd0a659-cd6d-4475-8964-86fbb899a029)

![image](https://github.com/user-attachments/assets/29818ac3-b204-4539-8b72-b7a383197a5d)

![image](https://github.com/user-attachments/assets/7621ccd7-6010-4076-a443-a989985e7204)

![image](https://github.com/user-attachments/assets/70c73061-0364-4bbd-b715-4c11e50e5402)

![image](https://github.com/user-attachments/assets/bcd1b0c1-ecb8-4b8e-8a39-381f51c0ccfd)

![image](https://github.com/user-attachments/assets/94cf7dfc-9156-4f19-b12a-9ae88d425d90)

![image](https://github.com/user-attachments/assets/2cb65f4f-efbd-4433-9eb0-68d557337ee0)

![image](https://github.com/user-attachments/assets/cdd0f205-6155-4a26-8333-5907f2a6979d)

![image](https://github.com/user-attachments/assets/4e3b7fa5-ecdd-4a74-9c6e-c32ab4910d63)

![image](https://github.com/user-attachments/assets/59d09fff-fb9c-4a10-b333-c21d88ca5f94)

<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Explicação do Código - RabbitMQ Java</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            line-height: 1.6;
            margin: 20px;
            background-color: #f9f9f9;
        }
        h2, h3, h4 {
            color: #2c3e50;
        }
        table {
            width: 100%;
            border-collapse: collapse;
            margin: 25px 0;
            background-color: #fff;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
        table th, table td {
            padding: 12px;
            border: 1px solid #ddd;
            text-align: left;
        }
        table th {
            background-color: #34495e;
            color: white;
        }
        code {
            background-color: #e8e8e8;
            padding: 2px 6px;
            border-radius: 4px;
            font-size: 0.95em;
        }
        pre {
            background-color: #34495e;
            color: white;
            padding: 10px;
            border-radius: 4px;
            overflow-x: auto;
        }
        ul {
            list-style-type: disc;
            margin-left: 20px;
        }
    </style>

<h2>Explicação do Código</h2>

<p>O projeto consiste em quatro componentes Java principais que interagem com o RabbitMQ para enviar e receber mensagens. A tabela abaixo resume a função de cada componente, seguida de detalhes sobre os trechos de código mais relevantes.</p>

<table>
  <thead>
    <tr>
      <th>Componente</th>
      <th>Descrição</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td><code>Producer.java</code></td>
      <td>Envia mensagens para a fila <code>hello_queue</code>.</td>
    </tr>
    <tr>
      <td><code>Consumer.java</code></td>
      <td>Consome mensagens da fila <code>hello_queue</code>.</td>
    </tr>
    <tr>
      <td><code>ProducerFailureTest.java</code></td>
      <td>Testa a resiliência do sistema simulando falhas de conexão.</td>
    </tr>
    <tr>
      <td><code>ProducerLoadTest.java</code></td>
      <td>Testa a capacidade do sistema sob carga enviando 10.000 mensagens para a fila <code>load_test_queue</code>.</td>
    </tr>
  </tbody>
</table>

<h3>Detalhes dos Componentes</h3>

<h4><code>Producer.java</code></h4>
<ul>
  <li><strong>Conexão com RabbitMQ:</strong> Configura e estabelece conexão usando <code>ConnectionFactory</code>.</li>
  <li><strong>Declaração da Fila:</strong> Assegura que a fila <code>hello_queue</code> exista.</li>
  <li><strong>Envio de Mensagem:</strong> Publica uma mensagem simples na fila.</li>
</ul>

<h4><code>Consumer.java</code></h4>
<ul>
  <li><strong>Conexão com RabbitMQ:</strong> Semelhante ao produtor para garantir consistência na conexão.</li>
  <li><strong>Declaração da Fila:</strong> Confirma a existência da fila <code>hello_queue</code>.</li>
  <li><strong>Recebimento de Mensagem:</strong> Utiliza <code>DeliverCallback</code> para processar mensagens recebidas.</li>
</ul>

<h4><code>ProducerFailureTest.java</code></h4>
<ul>
  <li><strong>Simulação de Falha:</strong> Intencionalmente usa credenciais erradas para falhar na autenticação.</li>
  <li><strong>Tratamento de Falha:</strong> Captura exceções e tenta reconectar, registrando o sucesso ou falha do processo.</li>
</ul>

<h4><code>ProducerLoadTest.java</code></h4>
<ul>
  <li><strong>Teste de Carga:</strong> Envia uma grande quantidade de mensagens, verificando a performance e robustez do sistema.</li>
</ul>

<h3>Código Relevante</h3>

<h4>Conexão e Configuração Básica</h4>
<pre><code>
ConnectionFactory factory = new ConnectionFactory();
factory.setHost("localhost");
factory.setUsername("guest");
factory.setPassword("guest");
Connection connection = factory.newConnection();
Channel channel = connection.createChannel();
</code></pre>

<h4>Manipulação de Fila</h4>
<pre><code>
channel.queueDeclare(QUEUE_NAME, false, false, false, null);
</code></pre>

<h4>Envio e Recebimento de Mensagem</h4>
<p><strong>Envio</strong></p>
<pre><code>
channel.basicPublish("", QUEUE_NAME, null, message.getBytes());
</code></pre>

<p><strong>Recebimento</strong></p>
<pre><code>
DeliverCallback deliverCallback = (consumerTag, delivery) -> {
    String message = new String(delivery.getBody(), "UTF-8");
    System.out.println(" [x] Recebeu: '" + message + "'");
};
channel.basicConsume(QUEUE_NAME, true, deliverCallback, consumerTag -> {});
</code></pre>

<h4>Tratamento de Falhas</h4>
<pre><code>
try {
    // tenta reconectar
} catch (Exception e) {
    // log de erro e tentativas de reconexão
}
</code></pre>

</body>
</html>








