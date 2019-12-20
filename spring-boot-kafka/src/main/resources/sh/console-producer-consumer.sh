#!/bin/bash
#test为要启动生成者的topic名称
./kafka-console-producer.sh --broker-list localhost:9092 --topic test

#test为要消费者的topic名称
./kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic test --from-beginning