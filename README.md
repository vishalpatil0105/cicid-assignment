# Spring Boot based Java web application

Hi This is Simple Demo app for second sem final project for cicd module.

## Execute the application locally and access it using your browser

Checkout the repo and move to the directory

```
git clone https://github.com/vishalpatil0105/cicid-assignment.git
```

Execute the Maven targets to generate the artifacts

```
mvn clean package
```

The above maven target stroes the artifacts to the `target` directory. You can either execute the artifact on your local machine
(or) run it as a Docker container.

### Execute locally (Java 17 needed) and access the application on http://localhost:8080

```
java -jar target/spring-boot-web.jar
```
