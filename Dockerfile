FROM openjdk:8
RUN mkdir -p /app
COPY target/sample-container-todo-app-java-maven-1.0.0.jar /app/sample-container-todo-app-java-maven.jar
WORKDIR /app
EXPOSE 8080
ENTRYPOINT [ "java", "-jar", "sample-container-todo-app-java-maven.jar" ]
