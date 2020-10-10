## create and run in background httpd server in container
 > docker run -d -ti --name WebServer4 httpd
 > elinks http://172.17.0.2:80
 > elinks http://localhost:80
 
## random port 
 > docker run -d -ti --name WebServer5 -P httpd
 > docker inspect WebServer5
 > elinks http://172.17.0.3:80      > It works
 > elinks http://localhost:32768    > It works

## own port
 > docker run -d -ti --name WebServer6 -p 8080:80 httpd 