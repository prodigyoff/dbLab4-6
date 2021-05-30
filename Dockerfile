FROM ubuntu:focal

ENV MYSQL_PWD Pavlo?osada228
ENV TZ=Europe/Kiev
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone
RUN echo "mysql-server mysql-server/root_password password $MYSQL_PWD" | debconf-set-selections
RUN echo "mysql-server mysql-server/root_password_again password $MYSQL_PWD" | debconf-set-selections
RUN apt-get update && apt-get install -y git maven default-jre default-jdk wget vim apt-utils mysql-server curl net-tools
COPY wrapper-script.sh wrapper-script.sh
CMD chmod +x wrapper-script.sh && ./wrapper-script.sh