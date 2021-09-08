[![License: GPL v3](https://img.shields.io/badge/License-GPLv3-blue.svg)](https://www.gnu.org/licenses/gpl-3.0)

*If you would like to support these tutorials, you can contribute to my [Patreon account](https://patreon.com/czetsuya)

# AWS XRay Training

Spring Boot and AWS XRay integration demo.

## Local Setup

1. Add in environment variables: AWS_XRAY_TRACING_NAME=spring-aws-xray-training;AWS_XRAY_DAEMON_ADDRESS=127.0.0.1:2000
2. Install aws-cli on your local machine.
3. Setup your AWS default profile.
```shell
aws configure
```

## Running AWS XRay on Windows

1. Download the Windows executable from https://docs.aws.amazon.com/xray/latest/devguide/xray-daemon.html.
2. Run XRay Daemon 
```shell
xray_windows.exe -o -n us-east-2
```

## Running AWS XRay Daemon On Linux

1. Build the Dockerfile
```shell
docker build -t xray-daemon .
```

2. Run the container
```shell
docker run --attach STDOUT -v ~/.aws/:/root/.aws/:ro --net=host -e AWS_REGION=us-east-2 --name xray-daemon -p 
2000:2000/udp xray-daemon -o
```

## AWS XRay

To view the log go to https://console.aws.amazon.com/xray/home.

## References
- https://docs.aws.amazon.com/xray/latest/devguide/xray-daemon-local.html