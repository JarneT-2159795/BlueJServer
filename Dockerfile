FROM eclipse-temurin:17-jdk-alpine
COPY ./build/libs/BlueJServer.jar app.jar
ARG PORT=8080
EXPOSE $PORT
ENTRYPOINT ["sh", "-c", "java -jar /app.jar --server.port=$PORT"]