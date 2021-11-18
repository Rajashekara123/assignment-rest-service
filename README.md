# assignment-rest-service
 assignment-rest-service

• The language, framework, and the storage you used
  Java 8
  Spring boot
  RestFul Web Service
  Spring Boot JPA Repo
  Maven
  In-Menory H2 Data Base
  Oracle Sql
  Junit
  Spring Boot Test
  Mocki-to

• How to compile and run your solution
  In local -
    Need to check out the code and import in STS as Maven Project, then do maven clean install
  In Server -
    Use any build tools to build and deploy to dedicated server 
    Post deploying in STS/Eclipse tool run as Spring Boot application 
    in server java -jar panormic-hotel-reservation-rest-service-0.0.1-SNAPSHOT.jar
   
• How to run the tests
  In STS/Eclipse post import right click and run as JUnit Test
• The test coverage
  Achived 97% of test Coverage for the code.
• Rest End points tests
post deploying use the below end point url's in post man to test it.
  http://localhost:8580/reservation/book
  http://localhost:8580/reservation/status
  http://localhost:8580/reservation/cancel
  Note - localhost need to replace with the hosting server name if it's not in the local
  Sample Reuqest for book -
  {
    "reservationId":"",
    "firstName":"Rajashekara",
    "lastName":"D",
    "emailAddress":"rajashekara.de@gmail.com",
    "mobileNo":"9445434634",
    "checkInDate":"2021-11-18T16:45:00.000+02:00",
    "checkOutDate":"2021-11-20T16:45:00.000+02:00",
    "noOfPersons":"3",
    "noOfAdults":"1",
    "noOfChildrens":"2",
    "roomNo":"406"
  }


