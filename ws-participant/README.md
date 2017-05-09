
```
$ docker run -p 27017:27017 -d mongo
f8cbf4712a228a240d17da97e0cc366807b88c215d447129d90a65481a648c30
```

```
$ docker run -p 8111:8080 -e SPRING_DATA_MONGODB_URI=mongodb://192.168.86.53:27017 -e SPRING_DATA_MONGODB_DATABASE=participnts spring-participant-service
```
