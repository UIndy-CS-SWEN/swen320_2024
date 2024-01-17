#### To build the docker image
- Syntax: docker build -t {CONTAINER_NAME} .  
``docker build -t vg-python .``

#### To create a docker container based on the built image
- Syntax: docker run -itd -p{HOST_PORT:CONTAINER_PORT} --rm --name {CONTAINER_NAME} -v{HOST_DIR:CONTAINER_DIR} {IMAGE_NAME}  
- Using $PWD for getting current folder  
``docker run -itd -p8888:8888 --rm --name vg-py3con -v"$PWD/projects":/home/app vg-python``

#### Other useful Docker commands
- List running containers 
``docker container ls``  
- List built images  
``docker image ls``  
- Stop running a container  
``docker container stop vg-pycon``  
- Remove a container
  - Syntax: docker container remove {CONTAINER_ID}  
  - Syntax: docker container remove {CONTAINER_NAME}  
  ``docker container remove 33c49e55c816``  
  ``docker image remove vg-python``  
- Remove a built image
  - Syntax: docker image remove {IMAGE_ID}  
  - Syntax: docker image remove {IMAGE_NAME}  
- Enter the shell inside the container
  - Syntax: docker exec -it {CONTAINER_ID} /bin/bash  
  ``docker exec -it 76985950d25c /bin/bash`` 
