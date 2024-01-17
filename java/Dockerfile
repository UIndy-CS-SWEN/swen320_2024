FROM ubuntu:latest

ENV DEBIAN_FRONTEND=noninteractive
ENV JAVA_HOME=/usr/lib/jvm/java-8-openjdk-amd64
ENV PATH $JAVA_HOME/bin:$PATH

RUN mkdir -p /home/app
WORKDIR /home/app

# replace bourne with bash to be able to source files
RUN rm /bin/sh && ln -s /bin/bash /bin/sh

RUN apt-get update
RUN apt-get install -y openjdk-8-jdk
RUN java -version
RUN apt-get -y install junit5
RUN apt-get -y install wget

RUN wget https://dlcdn.apache.org/maven/maven-3/3.9.6/binaries/apache-maven-3.9.6-bin.tar.gz
RUN tar -xvf apache-maven-3.9.6-bin.tar.gz
RUN mv apache-maven-3.9.6 /opt/
RUN rm apache-maven-3.9.6-bin.tar.gz

ENV M2_HOME=/opt/apache-maven-3.9.6
ENV PATH=$M2_HOME/bin:$PATH


EXPOSE 8899

CMD [ "/bin/bash" ] 