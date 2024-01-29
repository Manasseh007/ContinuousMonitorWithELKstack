FROM maven:3.9.5 
WORKDIR /app
COPY pom.xml /app/
RUN mvn dependency:resolve
COPY . /app/
RUN mvn clean
RUN mvn package -DskipTests -X

FROM openjdk
COPY --from=build /app/target/*.jar app.jar
CMD [ "java", "-jar", "app.jar" ]
