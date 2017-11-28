FROM anapsix/alpine-java:8_jdk
COPY /build/libs/jalgoarena-problems-*.jar /app/jalgoarena-problems.jar
WORKDIR /app
RUN ls -lt && java $JAVA_OPTS -jar jalgoarena-problems.jar