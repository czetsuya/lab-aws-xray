[![License: GPL v3](https://img.shields.io/badge/License-GPLv3-blue.svg)](https://www.gnu.org/licenses/gpl-3.0)

*If you would like to support these tutorials, you can contribute to my [Patreon account](https://patreon.com/czetsuya)

# AWS XRay Training

## Running the AWS XRay Daemon

1. Build the Dockerfile
```shell
docker build -t xray-daemon .
```

2. Run the container
```shell
docker run \
      --attach STDOUT \
      -v ~/.aws/:/root/.aws/:ro \
      --net=host \
      -e AWS_REGION=us-east-2 \
      --name xray-daemon \
      -p 2000:2000/udp \
      xray-daemon -o
```
