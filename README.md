To run this Dockerfile on Windows, you can follow these steps:
Open a command prompt or PowerShell window and navigate to the directory containing the Dockerfile.
Build the Docker image using the following command: docker build -t myapp .
Run the Docker container using the following command: docker run -p 4000:80 myapp. This will map port 80 inside the container to port 4000 on your local machine.
Open a web browser and go to http://localhost:4000 to view the web application.

## Step 1: 
### Create docker image in Windows OS.
#### ```docker build --no-cache --tag python-docker ./```

## Step 2:
 ### Bind a port to the internal docker port
 #### ```docker run -p 4000:5000 python-docker```

 ## Step 3:
 ### Send a request to the micro service
 #### [Server Address](http://127.0.0.1:4000)
