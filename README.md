
# Spring boot - Micorservice






#### Used
Java       - 8,
SpringBoot - 2.7.0 and 2.3.4,
Eureka server, Eureka client, Config Server, Actuator, Gateway, Hystrix, Hystrix-Dashboard, Starter-Config, Starter-Bootstrap, JPA, Slueth-zipkin, Starter-Slueth

## API 

```http
POST  http://localhost:9001/departments/
GET   http://localhost:9001/departments/1
POST  http://localhost:9002/users/
GET   http://localhost:9002/users/1
POST  http://localhost:9191/users/
GET   http://localhost:9191/users/2
```

| Body Raw JSON Department |   
 :-------- | 
 {"departmentName":"IT", "departmentAddress":"first street", "departmentCode":"IT-04"}

| Body Raw JSON User |   
 :-------- | 
{"firstName":"deepak", "lastName":"mishra", "email":"dmishra@gmail.com", "departmentId":"1"}

## URL
http://localhost:8761/ Eureka Registry 

http://localhost:9295/hystrix  Hystrix Dashboard to monitor stream

http://localhost:9191/actuator/hystrix.stream

http://localhost:9411/zipkin/

## Start zipkin
java -jar zipkin-server-2.23.16-exec.jar

## config-server settings
application.yml file is used by cloud-config-server-microservice