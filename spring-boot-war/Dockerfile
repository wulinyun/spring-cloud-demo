#FROM tomcat:latest
FROM 10.128.1.201/system_containers/tomcat:8
MAINTAINER wulinyun "lin.wu@landasoft.com"
WORKDIR /usr/local
ENV TZ=Asia/Shanghai
#设置中文字符集
ENV LANG=C.UTF-8
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone
#下面增加的是tc的APM要求CMD java $JAVA_OPTS -Dpinpoint.agentId=${POD_IP} -jar /app/app.jar
#-javaagent:/tenxcloud/pinpoint-agent/pinpoint-bootstrap-1.7.3.jar -Dpinpoint.applicationName=spring-boot-demo-jar -Dpinpoint.agentId=${POD_IP}
ENV CATALINA_OPTS='-Dpinpoint.agentId=${POD_IP}'
ENV JAVA_OPTS=''
RUN rm -rf /usr/local/tomcat/webapps/*
ADD target/spring-boot-demo.war /usr/local/tomcat/webapps/ROOT.war
#RUN yes|unzip /usr/local/tomcat/webapps/ROOT.war -d /usr/local/tomcat/webapps/ROOT/
#RUN chmod 777 -Rf /usr/local/tomcat/webapps/*
