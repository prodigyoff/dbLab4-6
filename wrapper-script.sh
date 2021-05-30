/etc/init.d/mysql start

# shellcheck disable=SC2164
cd
git clone -b osExam https://github.com/prodigyoff/dbLab4-6.git
# shellcheck disable=SC2164
cd dbLab4-6/
export MYSQL_PWD=Pavlo?osada228
/usr/bin/mysql -u root -e "CREATE DATABASE IF NOT EXISTS kit;"
/usr/bin/mysql -u root -e "FLUSH PRIVILEGES;"
/usr/bin/mysql -u root kit < src/main/resources/lab3DBScript.sql
mvn install
mvn clean package
timeout 30s mvn spring-boot:run

# shellcheck disable=SC2125

#mvn spring-boot:run