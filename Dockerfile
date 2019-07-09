# Use an oracle java 8 runtime as a base image
FROM anapsix/alpine-java

# pointing "/tmp" to home/docker because that is where a Spring Boot application creates
# working directories for Tomcat by default.
VOLUME /tmp

# Copy the current jar into the container as app.jar
ADD target/entropytest-0.0.1-SNAPSHOT.jar app.jar

# command to "touch" the jar file so that it has a file modification time
# Docker creates all container files in an "unmodified" state by default, but any static
# content (e.g. "index.html") would require the file to have a modification time.
RUN sh -c 'touch /app.jar'

# Make port 8080 available to the world outside this container
EXPOSE 8080

# The project JAR file is ADDed to the container as "app.jar" and then executed in the ENTRYPOINT
ENTRYPOINT [ "sh", "-c", "java -jar /app.jar" ]
