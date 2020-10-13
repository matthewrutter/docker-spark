#BUILD
FROM gradle AS build
COPY . /app/
WORKDIR /app
RUN gradle build

#APP
FROM openjdk:8-jre
COPY --from=build /app/build/libs/ /
ENTRYPOINT [ "java", "-jar", "/app-all.jar" ]    