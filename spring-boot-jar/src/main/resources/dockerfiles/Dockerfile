FROM centos:latest
MAINTAINER wulinyun
# now add java and tomcat support in the container
ADD jdk-11.0.5_linux-x64_bin.tar.gz  /
#启动脚本
COPY ./run-java.sh /run-java.sh
#授予执行权限
RUN chmod +x /run-java.sh
COPY ./error.log /error.log
#设置容器环境变量
ENV JAVA_HOME /jdk-11.0.5
ENV CLASSPATH $JAVA_HOME/lib/dt.jar:$JAVA_HOME/lib/tools.jar
ENV PATH $PATH:$JAVA_HOME/bin
ENV TZ=Asia/Shanghai
#java设置中文字符集
ENV LANG=C.UTF-8
ENV JAVA_VERSION=11
#增加通过使用环境变量的方式对项目配置文件运行时参数进行修改，从而达到一份镜像多份部署的作用
ENV JAVA_OPTS="-server -Xms100m"
#暴露端口自
EXPOSE 8080/tcp
#启动程序
CMD ["/bin/sh","-c","/run-java.sh"]

