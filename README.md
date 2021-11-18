# assignment-rest-service
 assignment-rest-service

• The language, framework, and the storage you used </br>
  Java 8 </br>
  Spring boot </br>
  RestFul Web Service </br>
  Spring Boot JPA Repo </br>
  Maven </br>
  In-Menory H2 Data Base </br>
  Oracle Sql </br>
  Junit </br>
  Spring Boot Test </br>
  Mocki-to </br>

• How to compile and run your solution </br>
  In local - </br>
    Need to check out the code and import in STS as Maven Project, then do maven clean install </br>
  In Server - </br>
    Use any build tools to build and deploy to dedicated server </br>
    Post deploying in STS/Eclipse tool run as Spring Boot application  </br>
    in server java -jar panormic-hotel-reservation-rest-service-0.0.1-SNAPSHOT.jar </br>
   
• How to run the tests </br>
  In STS/Eclipse post import right click and run as JUnit Test</br>
		
• The test coverage </br>
  Achieved 97% of test Coverage for the code </br>
		
• Rest End points tests </br>
post deploying use the below end point url's in post man to test it. </br>
  http://localhost:8580/reservation/book </br>
  http://localhost:8580/reservation/status </br>
  http://localhost:8580/reservation/cancel </br>
  Note - localhost need to replace with the hosting server name if it's not in the local </br>
  Sample Reuqest for book - </br>
  { </br>
    "reservationId":"", </br>
    "firstName":"Rajashekara", </br>
    "lastName":"D", </br>
    "emailAddress":"rajashekara.de@gmail.com", </br>
    "mobileNo":"9445434634", </br>
    "checkInDate":"2021-11-18T16:45:00.000+02:00", </br>
    "checkOutDate":"2021-11-20T16:45:00.000+02:00", </br>
    "noOfPersons":"3", </br> 
    "noOfAdults":"1", </br>
    "noOfChildrens":"2", </br>
    "roomNo":"406" </br>
  } </br>


