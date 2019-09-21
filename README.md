# spring-sfg-pet-clinic

![CircleCI](https://circleci.com/gh/MikeSabillon/spring-sfg-pet-clinic/tree/develop.svg?style=svg)

A project I made from the spring boot beginner to guru course in udemy. This project an open source tutorial project. So feel free to use it!

## Requirements
For building and running the application you need:
- [JDK 11](https://www.oracle.com/technetwork/java/javase/downloads/jdk11-downloads-5066655.html)
- [Maven 3](https://maven.apache.org)
- [Project Lombok]([https://projectlombok.org/](https://projectlombok.org/))

## Running the application locally
First run the following command on the project container:

    mvn clean install

This will create all the necessary modules needed to execute the project. The web module is dependent of the data module. After that you just need to go to the pet-clinic-web module and execute the following command on the terminal:
      
    mvn spring-boot:run
Alternatively you can just go to the main class on the pet-clinic-web module (sabillon.springframework5.sfgpetclinic.SfgPetClinicApplication) and run it as a java project.