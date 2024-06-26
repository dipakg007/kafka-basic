## Tutorial
Open a terminal in the directory where the docker-compose.yml file is located and run the following command to start the Kafka and Zookeeper containers:

```bash
docker-compose up -d
```

This command will download the required Docker images and start the Kafka and Zookeeper services in detached mode (-d).


#### Create a Kafka topic using the following command:
```bash
docker exec -it <kafka-container-id> /opt/kafka/bin/kafka-topics.sh --create --zookeeper zookeeper:2181 --replication-factor 1 --partitions 1 --topic my-topic
```
Replace <kafka-container-id> with the actual container ID of the Kafka container (you can find it using docker ps).


Use the Kafka console producer and consumer to test your Kafka setup:

#### Produce messages:
```bash
docker exec -it <kafka-container-id> /opt/kafka/bin/kafka-console-producer.sh --broker-list localhost:9092 --topic my-topic
```
#### Consume messages:
```bash
docker exec -it <kafka-container-id> /opt/kafka/bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic my-topic --from-beginning
```
Replace <kafka-container-id> with the actual container ID of the Kafka container.

