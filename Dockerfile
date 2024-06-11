FROM maven:3.8.5-openjdk-17 AS stage1
WORKDIR /home/app
COPY . /home/app
RUN mvn -f /home/app/pom.xml clean package

FROM openjdk:17-jdk-alpine
EXPOSE 8085 8086 8087
COPY --from=stage1 /home/app/target/products-service.jar products-service.jar
ENTRYPOINT ["sh", "-c","java -jar /products-service.jar"]