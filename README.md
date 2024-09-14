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
        h2, h3 {
            color: #2c3e50;
        }
        ul {
            list-style-type: disc;
            margin-left: 20px;
        }
        p {
            color: #333;
        }
    </style>
</head>
<body>

<h2>O que é o RabbitMQ?</h2>

<p>O <strong>RabbitMQ</strong> é uma ferramenta de mensageria baseada no protocolo AMQP (Advanced Message Queuing Protocol). Ele permite que aplicações se comuniquem através do envio e recebimento de mensagens, garantindo que as mensagens sejam entregues de forma confiável entre diferentes sistemas, mesmo que eles não estejam diretamente conectados ou funcionando ao mesmo tempo.</p>

<p>O RabbitMQ é uma das soluções de mensageria mais populares, utilizada em diversos tipos de sistemas distribuídos e aplicações orientadas a eventos. Sua principal função é atuar como um intermediário que gerencia filas de mensagens, permitindo a comunicação assíncrona entre produtores (enviam mensagens) e consumidores (recebem mensagens).</p>

<h2>Funcionamento Básico do RabbitMQ</h2>

<p>O funcionamento do RabbitMQ segue o conceito de <strong>produtores</strong> e <strong>consumidores</strong>, que interagem através de filas. Veja como o processo básico acontece:</p>

<ul>
    <li><strong>Produtor (Producer):</strong> O produtor é responsável por criar e enviar mensagens. Ele publica mensagens para o RabbitMQ, que por sua vez, as coloca em uma ou mais filas.</li>
    <li><strong>Fila (Queue):</strong> A fila é onde as mensagens ficam armazenadas até que sejam consumidas. O RabbitMQ gerencia essas filas e garante que as mensagens não sejam perdidas.</li>
    <li><strong>Consumidor (Consumer):</strong> O consumidor recebe mensagens da fila. Ele pode processar essas mensagens e realizar operações com base nelas, como atualizar um banco de dados ou disparar outros eventos.</li>
    <li><strong>Exchanges:</strong> Exchanges são roteadores de mensagens no RabbitMQ. Elas determinam para qual fila a mensagem será enviada, com base em regras de roteamento. Existem diferentes tipos de exchanges, como direct, topic e fanout.</li>
</ul>

<p>Abaixo está uma visão simplificada de como o RabbitMQ funciona:</p>

<ul>
    <li>O produtor publica mensagens em uma exchange.</li>
    <li>A exchange direciona essas mensagens para uma ou mais filas, de acordo com as regras de roteamento.</li>
    <li>Os consumidores conectados às filas recuperam e processam as mensagens conforme necessário.</li>
</ul>

<h2>Vantagens do RabbitMQ</h2>

<ul>
    <li><strong>Confiabilidade:</strong> O RabbitMQ garante a entrega de mensagens mesmo em situações de falhas de rede ou se um consumidor estiver temporariamente indisponível.</li>
    <li><strong>Escalabilidade:</strong> Ele suporta a distribuição de mensagens entre várias filas e consumidores, o que facilita a escalabilidade horizontal, distribuindo a carga de trabalho.</li>
    <li><strong>Mensagens Persistentes:</strong> As mensagens podem ser persistentes, garantindo que elas não sejam perdidas caso o servidor RabbitMQ falhe.</li>
    <li><strong>Suporte a Protocolos Múltiplos:</strong> Além do AMQP, o RabbitMQ oferece suporte a outros protocolos como MQTT e STOMP, permitindo integração com uma ampla gama de sistemas.</li>
    <li><strong>Alta Flexibilidade:</strong> Com várias opções de roteamento (direct, topic, fanout), ele oferece flexibilidade para diferentes cenários de distribuição de mensagens.</li>
</ul>

<h2>Desvantagens do RabbitMQ</h2>

<ul>
    <li><strong>Curva de Aprendizado:</strong> Para iniciantes, a configuração e compreensão de conceitos como exchanges, bindings e roteamento pode ser complexa.</li>
    <li><strong>Desempenho:</strong> Em comparação com outras soluções de mensageria como o Kafka, o RabbitMQ pode ter um desempenho inferior em termos de throughput, especialmente em grandes volumes de mensagens.</li>
    <li><strong>Dependência de Configuração Manual:</strong> Embora altamente configurável, essa flexibilidade pode exigir muitas configurações manuais, o que pode ser trabalhoso para novos usuários.</li>
    <li><strong>Manutenção:</strong> A manutenção de grandes instâncias do RabbitMQ, especialmente em ambientes de alta demanda, pode ser complexa e exigir monitoramento contínuo.</li>
</ul>

<h2>Conclusão</h2>

<p>O RabbitMQ é uma solução confiável e flexível para a comunicação assíncrona em sistemas distribuídos. Ele oferece uma maneira robusta de gerenciar filas e distribuir mensagens entre diferentes partes de uma aplicação, garantindo que as mensagens sejam entregues corretamente, mesmo em situações de falhas temporárias. No entanto, dependendo do cenário, pode não ser a melhor escolha em termos de desempenho em relação a outras soluções de mensageria, especialmente quando há uma necessidade de lidar com grandes volumes de dados em tempo real.</p>

</body>
</html>

<h1 style="color: #007bff; text-align: center;">Instalação do Docker Desktop e RabbitMQ</h1>

<h2 style="color: #0056b3;">Instalação do Docker Desktop</h2>
<p>Para instalar o Docker Desktop no Windows, siga os passos abaixo:</p>
<ol>
    <li><strong>Acesse o site oficial do Docker Desktop:</strong>
        <a href="https://docs.docker.com/desktop/install/windows-install/">Link para instalação do Docker Desktop</a>.
    </li>
    <li><strong>Baixe o instalador:</strong> Escolha a versão compatível com o seu sistema operacional e inicie o download.</li>
    <img src="https://github.com/user-attachments/assets/e05a927b-10ae-4463-a937-c0740023b64e" alt="Docker Desktop Step 1" width="400">
    <li><strong>Execute o instalador:</strong> Clique duas vezes no arquivo baixado para iniciar o processo de instalação. Siga as instruções do assistente de instalação.</li>
    <img src="https://github.com/user-attachments/assets/2cd0a659-cd6d-4475-8964-86fbb899a029" width="400">
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
    <img src="https://github.com/user-attachments/assets/94cf7dfc-9156-4f19-b12a-9ae88d425d90" width="400">
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









