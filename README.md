# Introduction to Spring Webflux
This is a very basic [springboot reactive](https://spring.io/reactive) application 

## Requirements
- [JDK 11](https://www.oracle.com/de/java/technologies/javase/jdk11-archive-downloads.html)
- [Gradle](https://gradle.org/)

### Building the project
After going to the project directory run the following:
```
./gradlew clean build
```

### Running the application
```
./gradlew bootRun
```
---

## Notes
- The application starts at default port is 8080.
- It uses Spring data R2DBC with an in memory H2 database 
- The schema.sql file generates the table and data.sql file creates entries
