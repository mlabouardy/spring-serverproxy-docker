# spring-serverproxy-docker

Scale docker app using haproxy server

<img src="arch.png" width="60%"/>

# Build

docker build -t socialnetwork-app .

# Run

docker-compose scale serverproxy=1 socialnetwork=3

# Results

<img src="screenshot.png" width="50%"/>

<img src="results.png" width="50%"/>
