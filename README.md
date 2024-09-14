<h1 style="color: #007bff; text-align: center;">Instalação do Docker Desktop e RabbitMQ</h1>

<h2 style="color: #0056b3;">Instalação do Docker Desktop</h2>
<p>Para instalar o Docker Desktop no Windows, siga os passos abaixo:</p>
<ol>
    <li><strong>Acesse o site oficial do Docker Desktop:</strong>
        <a href="https://docs.docker.com/desktop/install/windows-install/">Link para instalação do Docker Desktop</a>.
    </li>
    <li><strong>Baixe o instalador:</strong> Escolha a versão compatível com o seu sistema operacional e inicie o download.</li>
    <li><strong>Execute o instalador:</strong> Clique duas vezes no arquivo baixado para iniciar o processo de instalação. Siga as instruções do assistente de instalação.</li>
    <li><strong>Conclua a instalação:</strong> Após finalizar a instalação, o Docker Desktop será iniciado automaticamente. Verifique se o Docker está rodando corretamente abrindo o <em>Prompt de Comando</em> e digitando <code>docker --version</code> para confirmar se a instalação foi bem-sucedida.</li>
</ol>

<h2 style="color: #0056b3;">Instalação do RabbitMQ no Windows</h2>
<p>Para instalar o RabbitMQ no Windows 11, siga os passos:</p>
<ol>
    <li><strong>Baixar o instalador do RabbitMQ:</strong> Acesse o site oficial do RabbitMQ:
        <a href="https://www.rabbitmq.com/">www.rabbitmq.com</a>. Baixe o instalador compatível com a arquitetura do seu sistema (32 bits ou 64 bits).
    </li>
    <li><strong>Executar o instalador:</strong> Após o download, clique duas vezes no instalador para abrir o assistente de instalação.</li>
    <li><strong>Instalar RabbitMQ:</strong> Siga as instruções do assistente, escolhendo o diretório de instalação e outras configurações. Instale também o <strong>Erlang</strong>, que é um requisito para o funcionamento do RabbitMQ.</li>
    <li><strong>Iniciar o serviço RabbitMQ:</strong> Abra o <em>Gerenciador de Serviços do Windows</em> (procure por "Serviços" no menu Iniciar). Localize o serviço "RabbitMQ" na lista, clique com o botão direito nele e selecione "Iniciar".</li>
    <li><strong>Acessar a interface de gerenciamento:</strong> Abra o navegador e acesse:
        <a href="http://localhost:15672/">http://localhost:15672/</a>. Isso abrirá a Interface de Gerenciamento do RabbitMQ.
    </li>
    <li><strong>Fazer login:</strong> Use as credenciais padrão para login:
        <ul>
            <li><strong>Usuário:</strong> <code>guest</code></li>
            <li><strong>Senha:</strong> <code>guest</code></li>
        </ul>
        Por questões de segurança, é altamente recomendado alterar a senha padrão.
    </li>
    <li><strong>Configurar filas e exchanges:</strong> Através da Interface de Gerenciamento, você pode criar filas, exchanges e outras configurações necessárias para a comunicação entre sistemas.</li>
</ol>

<h2 style="color: #0056b3;">Criar uma Imagem Docker para RabbitMQ</h2>
<p>Agora que o Docker está instalado, podemos criar uma imagem Docker do RabbitMQ com as seguintes etapas:</p>
<ol>
    <li><strong>Acessar o Docker Hub:</strong> Visite o <a href="https://hub.docker.com/">Docker Hub</a> e pesquise pela imagem do RabbitMQ no campo de busca.</li>
    <li><strong>Selecionar a versão correta:</strong> Ao encontrar a imagem oficial do RabbitMQ, selecione a versão mais recente com suporte a <strong>management</strong> (interface de gerenciamento via navegador). Normalmente, a versão é identificada como <code>rabbitmq:&lt;versão&gt;-management</code>, por exemplo, <code>rabbitmq:3.13.7-management</code>.</li>
    <li><strong>Baixar a imagem do RabbitMQ:</strong> Abra o <em>Prompt de Comando</em> e execute o seguinte comando (substituindo pela versão mais recente encontrada no Docker Hub):</li>
</ol>
<pre><code>docker pull rabbitmq:3.13.7-management</code></pre>
<ol start="4">
    <li><strong>Executar o RabbitMQ em um contêiner Docker:</strong> Após o download da imagem, você pode executar o RabbitMQ em um contêiner com o comando:</li>
</ol>
<pre><code>docker run -d --name rabbitmq -p 5672:5672 -p 15672:15672 rabbitmq:3.13.7-management</code></pre>
<ol start="5">
    <li><strong>Acessar o RabbitMQ no Docker:</strong> Acesse a interface de gerenciamento do RabbitMQ pelo navegador, indo até:
        <a href="http://localhost:15672/">http://localhost:15672/</a>. Use as mesmas credenciais padrão para fazer o login:
        <ul>
            <li><strong>Usuário:</strong> <code>guest</code></li>
            <li><strong>Senha:</strong> <code>guest</code></li>
        </ul>
    </li>
</ol>


Instalar o RabbitMQ:

Baixar o instalador do RabbitMQ: Acesse o site oficial do RabbitMQ (www.rabbitmq.com) e baixe o instalador para Windows compatível com a arquitetura do seu sistema (32 bits ou 64 bits).

Executar o instalador: Depois de baixar o instalador, clique duas vezes nele para iniciar o assistente de instalação.

Instalar RabbitMQ: Siga os passos do assistente de instalação para instalar o RabbitMQ no seu sistema Windows 11. Você pode escolher o diretório de instalação e outras configurações durante o processo.

Iniciar o serviço RabbitMQ: Após a instalação estar completa, abra o Gerenciador de Serviços do Windows procurando por "Serviços" no menu Iniciar. Encontre o serviço "RabbitMQ" na lista, clique com o botão direito nele e selecione "Iniciar" para iniciar o serviço RabbitMQ.

Acessar a interface de gerenciamento do RabbitMQ: Abra o seu navegador e vá para http://localhost:15672/. Isso levará você à Interface de Gerenciamento do RabbitMQ.

Fazer login: Faça login na Interface de Gerenciamento do RabbitMQ usando as credenciais padrão (usuário: "guest" e senha: "guest"). É essencial alterar a senha padrão por motivos de segurança.

Criar filas e exchanges: Na Interface de Gerenciamento do RabbitMQ, você pode criar filas, exchanges e associações para facilitar a comunicação entre aplicativos.


Para instalar o Docker Desktop acesse o site: https://docs.docker.com/desktop/install/windows-install/
e siga as seguintes instruções:
![image](https://github.com/user-attachments/assets/e05a927b-10ae-4463-a937-c0740023b64e)

![image](https://github.com/user-attachments/assets/2cd0a659-cd6d-4475-8964-86fbb899a029)

![image](https://github.com/user-attachments/assets/29818ac3-b204-4539-8b72-b7a383197a5d)

![image](https://github.com/user-attachments/assets/7621ccd7-6010-4076-a443-a989985e7204)

![image](https://github.com/user-attachments/assets/70c73061-0364-4bbd-b715-4c11e50e5402)

![image](https://github.com/user-attachments/assets/bcd1b0c1-ecb8-4b8e-8a39-381f51c0ccfd)

Após e instalação do Docker acesse ao site: https://hub.docker.com/
onde você irá pesquisar pela imagem docker rabbitMQ:

![image](https://github.com/user-attachments/assets/94cf7dfc-9156-4f19-b12a-9ae88d425d90)

Acesse a imagem:

![image](https://github.com/user-attachments/assets/2cb65f4f-efbd-4433-9eb0-68d557337ee0)

Copie onde está informado a <versão>-management mais atual do rabbitMQ

![image](https://github.com/user-attachments/assets/cdd0f205-6155-4a26-8333-5907f2a6979d)

![image](https://github.com/user-attachments/assets/4e3b7fa5-ecdd-4a74-9c6e-c32ab4910d63)

Após acessar o Prompt de comando insira este comando seguindo a versão vista no site da imagem anterior:
docker pull rabbitmq:3.13.7-management

![image](https://github.com/user-attachments/assets/59d09fff-fb9c-4a10-b333-c21d88ca5f94)

<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
   
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
</head>
<body>

<h2>Explicação do Código</h2>

<p>O projeto é composto por quatro arquivos principais em Java que se comunicam com o RabbitMQ. A seguir, é apresentado um resumo das funcionalidades de cada arquivo, seguido por uma explicação detalhada dos códigos e exemplos característicos.</p>

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
      <td>Simula falhas de conexão e tenta realizar reconexões automáticas.</td>
    </tr>
    <tr>
      <td><code>ProducerLoadTest.java</code></td>
      <td>Testa a capacidade do sistema enviando 10.000 mensagens para a fila <code>load_test_queue</code>.</td>
    </tr>
  </tbody>
</table>

<h3>Detalhes dos Componentes</h3>

<h4><code>Producer.java</code></h4>
<p>O <code>Producer.java</code> é responsável por enviar mensagens para a fila RabbitMQ. Aqui está o que ele faz:</p>
<ul>
  <li><strong>Conexão com RabbitMQ:</strong> Usa a classe <code>ConnectionFactory</code> para estabelecer uma conexão com o servidor RabbitMQ.</li>
  <li><strong>Declaração da Fila:</strong> O produtor garante que a fila chamada <code>hello_queue</code> exista usando o método <code>queueDeclare</code>. Se a fila ainda não existir, ela será criada.</li>
  <li><strong>Envio de Mensagem:</strong> A mensagem "New Test!" é enviada à fila com o método <code>basicPublish</code>.</li>
</ul>

<pre><code>
// Código relevante: Conexão e envio de mensagem
ConnectionFactory factory = new ConnectionFactory();
factory.setHost("localhost");
factory.setPort(5672);  // Porta padrão do RabbitMQ
factory.setUsername("guest");
factory.setPassword("guest");

try (Connection connection = factory.newConnection();
     Channel channel = connection.createChannel()) {

    channel.queueDeclare(QUEUE_NAME, false, false, false, null);
    String message = "New Test!";
    channel.basicPublish("", QUEUE_NAME, null, message.getBytes());
    System.out.println(" [x] Sent '" + message + "'");
}
</code></pre>

<h4><code>Consumer.java</code></h4>
<p>O <code>Consumer.java</code> é responsável por consumir as mensagens da fila <code>hello_queue</code>. Ele realiza as seguintes tarefas:</p>
<ul>
  <li><strong>Conexão com RabbitMQ:</strong> Configura uma conexão semelhante ao <code>Producer</code>.</li>
  <li><strong>Declaração da Fila:</strong> Assegura que o consumidor esteja conectado à mesma fila <code>hello_queue</code>.</li>
  <li><strong>Recebimento de Mensagem:</strong> Utiliza <code>DeliverCallback</code> para processar mensagens quando elas chegam.</li>
</ul>

<pre><code>
// Código relevante: Consumo de mensagens
DeliverCallback deliverCallback = (consumerTag, delivery) -> {
    String message = new String(delivery.getBody(), "UTF-8");
    System.out.println(" [x] Recebeu: '" + message + "'");
};

channel.basicConsume(QUEUE_NAME, true, deliverCallback, consumerTag -> { });
</code></pre>

<h4><code>ProducerFailureTest.java</code></h4>
<p>O <code>ProducerFailureTest.java</code> simula falhas de conexão ao RabbitMQ. A senha configurada incorretamente é usada para disparar erros, e o sistema tenta reconectar automaticamente.</p>
<ul>
  <li><strong>Simulação de Falha:</strong> O código usa credenciais incorretas para forçar um erro de autenticação.</li>
  <li><strong>Tentativa de Reconexão:</strong> Quando uma falha ocorre, o código tenta reconectar três vezes.</li>
</ul>

<pre><code>
// Código relevante: Tentativa de reconexão
for (int i = 1; i <= 3; i++) {
    try {
        connection = factory.newConnection();
        channel = connection.createChannel();
        channel.queueDeclare(QUEUE_NAME, true, false, false, null);
        channel.basicPublish("", QUEUE_NAME, null, "Reconexão bem-sucedida!".getBytes());
        System.out.println(" [x] Reconexão bem-sucedida e mensagem enviada!");
        break;
    } catch (Exception retryException) {
        System.err.println(" [!] Falha na reconexão: " + retryException.getMessage());
        if (i == 3) {
            System.err.println(" [!] Não foi possível reconectar após 3 tentativas.");
        }
    }
}
</code></pre>

<h4><code>ProducerLoadTest.java</code></h4>
<p>O <code>ProducerLoadTest.java</code> é utilizado para realizar testes de carga, enviando 10.000 mensagens para a fila <code>load_test_queue</code>. Ele é útil para avaliar o desempenho do sistema sob alta demanda.</p>
<ul>
  <li><strong>Teste de Carga:</strong> Um laço <code>for</code> é utilizado para enviar 10.000 mensagens em sequência.</li>
</ul>

<pre><code>
// Código relevante: Teste de carga
for (int i = 0; i < 10000; i++) {
    String message = "Mensagem de carga número " + i;
    channel.basicPublish("", QUEUE_NAME, null, message.getBytes());
    System.out.println(" [x] Enviou: '" + message + "'");
}
</code></pre>

</body>
</html>









