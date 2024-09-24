FROM amazoncorretto:17.0.7-alpine
EXPOSE 8087
ADD target/welcome-jenkin-app.jar welcome-jenkin-app.jar
ENTRYPOINT [ "java", "-jar", "/welcome-jenkin-app.jar" ]