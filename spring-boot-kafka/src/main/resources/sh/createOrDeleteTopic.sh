#!/bin/bash
#test是topic名字 在kafka 目录下bin目录下执行：
./kafka-topics.sh --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic test

#在kafka目录下bin目录下执行查询创建的topic
./kafka-topics.sh --list --zookeeper localhost:2181

#在kafka目录下bin目录下执行删除创建的topic
./kafka-topics.sh --delete --zookeeper localhost:2181 --topic   要删除的topic名称