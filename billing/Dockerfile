FROM  gradle:jdk18-focal as build

WORKDIR /app

COPY --chown=gradle:gradle . /app

RUN gradle build --no-daemon

FROM openjdk:18.0.2-jdk 

COPY --from=build /app/build/libs/*.jar /app/app.jar

EXPOSE 8080

CMD ["java", "-jar", "/app/app.jar"]
