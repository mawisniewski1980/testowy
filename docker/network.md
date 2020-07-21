### container in network

## create container
 > docker run -ti --name WebServer1 ubuntu bash
 > apt update
 > apt upgrade

## install apache2
 > apt install apache2
 > etc/init.d/apache2 restart
 
## install lsof 
## https://www.howtoforge.com/linux-lsof-command/
 > apt install lsof
 > lsof -i -P -n

## install elinks
## http://elinks.or.cz/
 > apt install elinks
 > elinks http://localhost

## install iproute2
## docker address IP
 > apt install iproute2
 > ip a

## install ssh
 > apt install openssh-server  -y
 > etc/init.d/ssh restart
 > ssh user@172.17.0.2
 > 