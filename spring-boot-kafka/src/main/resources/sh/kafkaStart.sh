#!/bin/bash
#启动zookeeper
/home/data/kafka/kafka_2.13-2.4.0/bin/zookeeper-server-start.sh /home/data/kafka/kafka_2.13-2.4.0/config/zookeeper.properties &
sleep 3  #默默等3秒后执行
#启动kafka
/home/data/kafka/kafka_2.13-2.4.0/bin/kafka-server-start.sh /home/data/kafka/kafka_2.13-2.4.0/config/server.properties &
