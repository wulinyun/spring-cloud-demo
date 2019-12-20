#!/bin/bash


if [ -d /app-dir ]; then
  jarCount=$(ls /app-dir | grep jar -c)
  if [ $jarCount != 0 ]; then
    jarName=$(ls /app-dir | head -1)
	mkdir /app-run
	cp "/app-dir/$jarName" "/app-run/$jarName"
  fi
fi

if [ -d /app-run ]; then
  jarCount=$(ls /app-run | grep jar -c)
  if [ $jarCount != 0 ]; then
    jarName=$(ls /app-run | head -1)
    chmod a+x "/app-run/$jarName"
    java ${JAVA_OPTS} -jar "/app-run/$jarName" $@
  fi
fi

tail -f -n 20  /error.log
