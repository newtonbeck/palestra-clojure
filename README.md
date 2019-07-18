# Clojure: do zero ao deploy de uma API REST

## Descrição da palestra
Você programa ou já programou em Java? Você tentou aprender Clojure mas nunca conseguiu ir muito longe? Sempre que você vê um exemplo de programação funcional ele parece muito distante do que você faz no dia a dia? Se você respondeu sim para essas perguntas então essa palestra é pra você!

Nesta palestra começaremos do básico de Clojure e iremos evoluindo, passo a passo, até criar um endpoint HTTP que busca dados num banco de dados MySQL e retorna esses dados em formato JSON para seus clientes. Por fim iremos empacotar e fazer o deploy da nossa aplicação no cloud.

# Como rodar o projeto?

## Requisitos

- JDK 8 ou mais recente
- Leiningen (https://leiningen.org/)
- Docker

## Rodando o projeto

Para subir o banco de dados MySQL execute o comando abaixo dentro do diretório do projeto:
```
docker-compose up -d
```

Conecte-se ao banco de dados e execute os comandos que estão no arquivo `run-this.sql` para criar o banco de dados e os produtos usados no projeto de exemplo.

Para subir a API em Clojure execute o comando abaixo dentro do diretório do projeto:
```
lein run
```

Para gerar o `jar` do projeto execute o comando abaixo dentro do diretório do projeto:
```
lein uberjar
```
O arquivo `jar` será gerado dentro do diretório `target` e terá o nome `palestra-clojure-0.1.0-SNAPSHOT-standalone.jar`.

Para rodar o arquivo `jar` gerado execute o comando abaixo:
```
java -jar target/palestra-clojure-0.1.0-SNAPSHOT-standalone.jar
```
