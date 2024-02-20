# Project Title
  CIB_DigitalTech - UI automation

 # Project Description

This project utilizes Selenium 4 with Java to automate web testing. It incorporates Selenium Grid with Docker for efficient and scalable parallel execution of tests across multiple machines. The Page Object Model (POM) design pattern is implemented to enhance test maintenance and readability.

To ensure efficient resource handling, the Singleton design pattern is employed, allowing for a single instance of the WebDriver to be allocated per class.

Parallel execution is a key feature of this project, enabling tests to run concurrently on different browsers or devices. This significantly reduces the overall execution time and improves test efficiency.

In case of test failures, the project is configured to automatically capture screenshots, providing visual evidence for debugging and issue resolution. This helps in identifying UI issues or unexpected behavior during test execution.

To track and analyze test results, the project generates comprehensive test execution reports. These reports provide detailed information about the test cases executed, their pass/fail status, and any errors encountered. Such reports aid in identifying patterns, trends, and areas that require attention or improvement.

Overall, this project leverages Selenium 4, Java, Selenium Grid with Docker, Page Object Model, Singleton design pattern, parallel execution, screenshot capture, and test execution reports to deliver efficient and robust automated testing for web applications.
  
  
    Frameworks and Libraries:
      
    Apache Maven
    TestNG 
    Extent Report
    Selenium Java
    Fillo Api
    Apache POI Api
    JavaFaker

 #  How to Run Project
 
   Prerequisites:
       
     IDE - https://www.jetbrains.com/idea/download/?section=windows
     JDK 8 - https://www.oracle.com/java/technologies/javase/javase8u211-later-archive-downloads.html
     Git - https://git-scm.com/
     Docker Desktop - https://www.docker.com/products/docker-desktop/
   
   Step 1:
   
       $ git clone https://github.com/your/repository.git](https://github.com/NeoMahobe/Selenium4_WithGridAndDocker.git

  Step 2:

      $ docker compose up

![image](https://github.com/NeoMahobe/CIB_DigitalTech-_UI/assets/61291968/8444da2d-fc83-412b-bc2f-5b21fe70fafc)

![image](https://github.com/NeoMahobe/CIB_DigitalTech-_UI/assets/61291968/bf35d012-c8b2-4020-a79e-bcdafebe52b8)

Step 3: 

      $ Execute mvn clean test -DsuiteXmlFile=Regression_Prod.xml for remote execution

![image](https://github.com/NeoMahobe/CIB_DigitalTech-_UI/assets/61291968/16fe3672-fb4c-4add-9424-047046989557)

      $ Navigate to http://localhost:4444/ui#/sessions to view live sessions 

![image](https://github.com/NeoMahobe/CIB_DigitalTech-_UI/assets/61291968/1afb9d9c-0ed2-4707-a35b-f260aeb4d493)


 #  How to Configure Project

       $ For remote parallel execution and thread count
 
  ![image](https://github.com/NeoMahobe/CIB_DigitalTech-_UI/assets/61291968/cac59376-737b-45a6-816f-790acd2c79ca)

       $ For local parallel execution and debugging

  ![image](https://github.com/NeoMahobe/CIB_DigitalTech-_UI/assets/61291968/af7f4d38-028b-46dd-a912-88579704f1cc)











 

