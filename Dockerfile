FROM anapsix/alpine-java:8_jdk
COPY /build/libs/jalgoarena-problems-*.jar /app/jalgoarena-problems.jar
WORKDIR /app
ENTRYPOINT java -jar /app/jalgoarena-problems.jar
