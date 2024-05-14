
Requisições

1- Ter o docker instalado seuindo as requisições
2- Para testar o projeto utilize o Postman (https://www.postman.com/downloads/)

Configuração e execução:

1- Utilizar o comando compose-up para inicializar o container rabbitmq
2- Buildar o arquivo demo-backend-api
3- Buildar o arquivo demo-pagamentos-worker
(não consegui incluir todos no docker-compose)
4- Utilizar o caminho http://localhost:8081/pagar para testar a 
comunicação do microsserviço 1 com o microsserviço 2 
5- Utilizar o caminho http://localhost:8080/notificar para testar a comunicação do microsserviço 2 com o rabbitmq
(Não consegui fazer o envio da mensagem).