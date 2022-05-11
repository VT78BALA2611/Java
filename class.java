FROM ubuntu
MAINTAINER venkatesh
RUN apt-get update -y
RUN apt-get install git -y
RUN git config --global user.name "venkatesh"
RUN git config --global user.email "vinjumuri.venkatesh@gmail.com"
RUN apt-get install wget -y
RUN mkdir /opt/venkat
RUN touch /opt/venkat/sample.pdf sample.html sample.xml pom.xml
CMD git --version
