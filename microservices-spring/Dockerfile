FROM openjdk:8-jdk-alpine
# Environment Variable that defines the endpoint of sentiment-analysis python api.
ENV SA_LOGIC_API_URL http://localhost:5000
ENV PORT 8005
WORKDIR /
ADD ["./user-portal-0.0.1-SNAPSHOT.jar", "./microservices-spring/target/"]
EXPOSE 8005
CMD ["java", "-jar", "user-portal-0.0.1-SNAPSHOT.jar", "--sa.logic.api.url=${SA_LOGIC_API_URL}"]
