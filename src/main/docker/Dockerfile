#Place this file in the src/main/docker directory
FROM openjdk

VOLUME /tmp
ADD maven/${fileName}.war ${fileName}.war
RUN sh -c 'touch /${fileName}.war'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-war","/${fileName}.war"]

EXPOSE 7070