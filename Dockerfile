FROM eclipse-temurin:17
COPY target/dockerauto.jar dockerauto.jar
CMD ["java","-jar","dockerauto.jar" ]
