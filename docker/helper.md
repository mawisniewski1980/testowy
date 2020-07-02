
1. Create Ubuntu Linux system on Hyper Virtual Machine
2. Install Docker (https://docs.docker.com/engine/install/ubuntu/)
3. Check installation: 
 > sudo docker info 
 > sudo docker run hello-world 
 
NOTE: usefull commands
 > cat /etc/lsb-release //linux distribution
 > docker images //images
 > docker run -ti centos echo "Hello centOS" //img centos
 > docker ps  // display all running containers
 > docker ps -a // display all containers
 
 https://docs.docker.com/engine/reference/commandline/run/

 > docker run -ti ubuntu bash   -> exit  //contener with terminal
 > docker run -ti --name test_contener_01 ubuntu echo "test_contener_01" //contener with name
 
 
 > docker start id_contener //run container
 > docker exec -ti id_contener bash     // create new process, own, individually
 > docker attach id_contener			//attach to running container
 > docker start -ia id_contener     // start contener and attach interactive
 > docker run -ti --restart unless-stopped --name always_run ubuntu bash   //container is in continuous running
 > docker rm id_contener   // remove container  - ONLY NOT RUNNED
 
 > docker stop id_contener   // stop one docker container
 > docker stop $(docker ps -aq)   // stop all dockers containers
 
 > docker commit id_contener name
 > 
 > docker search ubuntu //search on docker hub image ubuntu
 > docker search http
 
 > docker pull ubuntu // download image ubuntu
 > docker pull http
 
 > docker  push name_image // push image to docker hub

 > docker login // login into docker

 > docker tag name_image new_image  / create new image with different name

 > docker run --rm centos echo "One minute" //run container and delete this contener

 > create image from container
   > docker run -ti ubuntu bash
   > touch file1.txt
   > echo "Test file" >> file1.txt
   > cat file1.txt
   > docker ps -l     // last created container
   > docker commit id_contener    // create new image from container
   > docker tag id..................
   > docker run -ti --name new_image_02 new_image bash
   
   
   
 
 ##########################
 attach      	 Attach local standard input, output, and error streams to a running container
 build       	 Build an image from a Dockerfile
 commit      	 Create a new image from a container's changes
 cp          	 Copy files/folders between a container and the local filesystem
 create      	 Create a new container
 diff        	 Inspect changes to files or directories on a container's filesystem
 events      	 Get real time events from the server
 exec        	 Run a command in a running container
 export      	 Export a container's filesystem as a tar archive
 history     	 Show the history of an image
 images      	 List images
 import      	 Import the contents from a tarball to create a filesystem image
 info        	 Display system-wide information
 inspect     	 Return low-level information on Docker objects
 kill        	 Kill one or more running containers
 load        	 Load an image from a tar archive or STDIN
 login       	 Log in to a Docker registry
 logout      	 Log out from a Docker registry
 logs        	 Fetch the logs of a container
 pause       	 Pause all processes within one or more containers
 port        	 List port mappings or a specific mapping for the container
 ps          	 List containers
 pull        	 Pull an image or a repository from a registry
 push        	 Push an image or a repository to a registry
 rename      	 Rename a container
 restart     	 Restart one or more containers
 rm          	 Remove one or more containers
 rmi         	 Remove one or more images
 run         	 Run a command in a new container
 save        	 Save one or more images to a tar archive (streamed to STDOUT by default)
 search      	 Search the Docker Hub for images
 start       	 Start one or more stopped containers
 stats       	 Display a live stream of container(s) resource usage statistics
 stop        	 Stop one or more running containers
 tag         	 Create a tag TARGET_IMAGE that refers to SOURCE_IMAGE
 top         	 Display the running processes of a container
 unpause     	 Unpause all processes within one or more containers
 update      	 Update configuration of one or more containers
 version     	 Show the Docker version information
 wait        	 Block until one or more containers stop, then print their exit codes
