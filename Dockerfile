# syntax=docker/dockerfile:1

# Gets the lates version of ubuntu and jeclipse jdk
FROM ubuntu:latest
WORKDIR /app

RUN apt-get update -y && \
    apt-get install -y python3-pip && \
    pip3 install Flask

COPY . .
CMD ["python3", "-m" , "flask", "run", "--host=0.0.0.0"]

# Run the command below to make the docker image
# docker build --no-cache --tag python-docker ./

# Run the command below to run the container
# docker run -p 4000:5000 python-docker

# web address:
# http://127.0.0.1:4000