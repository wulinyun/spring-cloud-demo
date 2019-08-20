FROM java:8
#拷贝中文字体到系统
#COPY  ./chinese /usr/local/share/fonts/
VOLUME /tmp
ENV TZ=Asia/Shanghai
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone
#spring-boot-docker-0.0.1-SNAPSHOT.jar 请确认构建的jar包名称
ADD spring-cloud-config.jar app.jar
#为了简化程序pom.xml对于镜像构建的配置，使用哪个jar包来构建镜像通过参数传入的方式传入
#ARG JAR_FILE
#COPY ${JAR_FILE} app.jar
RUN bash -c 'touch /app.jar'
#增加通过使用环境变量的方式对项目配置文件运行时参数进行修改，从而达到一份镜像多份部署的作用
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]