# Dufuna Training Program
﻿
# Building and Implementation of a REAL ESTATE property TAX service solutions
---
> 
This implementation focuses on developing a solution for real estates to identify properties on their database and also allow users to perform all other needed operations. Some of the operation I carried out while creating this solution are;

- Create a Property
- Save a Property
- Get a property using its ID
- Search for list of properties in the DB
- Update a property if changes are needed
- Run Unit Tests using JUnit

# This project also implements RESTful web service to calculate Tax using Spring Boot.

Technologies and Tools used:

- JAVA
- Maven
- Amazon Corretto JDK 17.0.3
- Spring Boot
- Spring Data JPA
- Lombok
- h2database
- Junit.Jupiter 5.8.2
- Intelli J IDEA

# STEPS TO RUN THE PROJECT
---
>
Since the project used Spring Data JPA in the `tax package` and auto generate ddl, we don't need to define the table in the Entity class. Other two packages are `address`  and  `lekki`.

- `clone` the project.
- Replace the db credential with yours in application.properties
- Clean, install and package the project using `mvn clean install`
- Start the server and test the endpoints in `tax package`.
- Test the Tax Service by using HTTP client tool or Intelli J default tool

**[Ihedioha Chinedu](https://github.com/Chinex-Boroja)**
