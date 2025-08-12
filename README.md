# poc-activemq
A proof-of-concept on the basic usage of ActiveMQ in Java Spring Boot applications

The project contains 2 modules:
* poc-activemq-sender    => contains classes that sends messages to ActiveMQ broker
* poc-activemq-receiver  => contains classes that receives messages from ActiveMQ broker

Both modules are set up as Spring Boot projects. The modules mimick real-world microservices scenario where each microservice can use ActiveMQ to communicate asynchronously.
