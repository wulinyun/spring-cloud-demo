FROM CentOS:latest
CMD ["bash"]
MAINTAINER wulinyun
# now add java and tomcat support in the container
ADD jdk-11.0.5_linux-x64_bin.tar.gz  /usr/local/
# configuration of java and tomcat ENV
ENV JAVA_HOME /usr/local/jdk-11.0.5
ENV CLASSPATH $JAVA_HOME/lib/dt.jar:$JAVA_HOME/lib/tools.jar
ENV PATH $PATH:$JAVA_HOME/bin
ENV TZ=Asia/Shanghai
#java设置中文字符集
ENV LANG=en_US.UTF-8
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone
#增加通过使用环境变量的方式对项目配置文件运行时参数进行修改，从而达到一份镜像多份部署的作用
ENV JAVA_OPTS="-server -Xms100m"

EXPOSE 8080/tcp

CMD ["/bin/sh","-c","/run-java.sh"]

