#BUILD
#USE GRADLE TO BUILD APP IN DEV DIR IN CONTAINER
FROM gradle AS build
COPY . /app/
WORKDIR /app
RUN gradle build

#APP
#USE BUILD FROM GRADE AND RUN FAT JAR SERVER
FROM openjdk:8-jre
COPY --from=build /app/build/libs/ /
ENTRYPOINT [ "java", "-jar", "/app-all.jar" ]    