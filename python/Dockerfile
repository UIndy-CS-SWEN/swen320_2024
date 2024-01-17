# To build the image:
# To run the container:
# To login the shell of the container: 
# syntax=docker/dockerfile:1
FROM ubuntu:22.04

ARG DEBIAN_FRONTEND="noninteractive"

RUN mkdir -p /home/app
WORKDIR /home/app

# replace bourne with bash to be able to source files
RUN rm /bin/sh && ln -s /bin/bash /bin/sh


# update the repository sources list
# and install dependencies
# apt-get install -y curl wget
RUN apt-get update \
    && apt-get install -y \
    curl \
    wget \
    ca-certificates \
    sudo \
    git \
    bzip2 \
    locales \
    libx11-6 \
    software-properties-common \
    && apt-get -y autoclean
    

# install pip (in the system using root)
RUN ln -s /usr/bin/python3.10 /usr/bin/python


# install pip
RUN apt-get install -y python3-pip
RUN pip3 --version
RUN pip --version

# Unit test packages
RUN pip install coverage
RUN pip install pytest
RUN pip install pytest-cov


# install Excel package
RUN pip install xlrd


EXPOSE 8888

CMD [ "/bin/bash" ]