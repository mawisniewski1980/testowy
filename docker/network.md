### container in network

## create container
 > docker run -ti --name WebServer1 ubuntu bash
 > apt update
 > apt upgrade

## install apache2
 > apt install apache2
 > etc/init.d/apache2 restart
 
## install lsof 
## check if apache is running and listening at 80 port
## https://www.howtoforge.com/linux-lsof-command/
 > apt install lsof
 > lsof -i -P -n
## COMMAND  PID USER   FD   TYPE DEVICE SIZE/OFF NODE NAME
### apache2 3465 root    3u  IPv4  22549      0t0  TCP *:80 (LISTEN)

## install elinks
## http://elinks.or.cz/
## check page in text editor
 > apt install elinks
 > elinks http://localhost

## install iproute2
## check ip adressess - docker container
## docker address IP
 > apt install iproute2
 > ip a

## install ssh
 > apt install openssh-server -y
 > etc/init.d/ssh restart
 > adduser user
 > CTRL+P > CTRL+Q
 > ssh user@172.17.0.2
 >  

 ## inspect docker container
  > docker run -ti -d --name WebServer2 ubuntu bash
  > docker run -ti -d --name WebServer3 ubuntu bash
  > docker inspect WebServer2
  > docker inspect WebServer3

## checking communication between container
  > run on two different terminal command ping
    > docker attach WebServer2
    > docker attach WebServer3
    > ip a
    > ping 172.17.0.2 <> ping 172.17.0.3