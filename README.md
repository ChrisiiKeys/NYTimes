**Overview**

The project NYTimes automates the Newyork Times news webpage, using Selenium & Cucumber Framework. Here, I've covered the major scenario of Automation cases like Navigating the Elections page, Searching a context & Login. The project is structured with Selenium Webdriver for Automation of webpage, Cucumber framework for runner class with Step definition & Feature file for scenarios. The project is integrated with Maven as build tool, provides dependencies & library plugins for report generation.The test file supports cross-browser testing to test the cases in different browsers, data-driven with Excel and generates html reports for test run. For Configuration, pom.xml is used & Base class is used to ensure all the necessary functions are under one class file, which is inherited to all the other classes. 

**Technologies Used**

Framework : Data Driven Framework

Design Pattern: Page Object Model with Factory Design Pattern , Base class with Object Repository, Runner file for Execution, Step definion for defining the steps with feature file.

Selenium WebDriver: For browser automation.

Cucumber: For organizing and running test cases.

Maven: For dependency management , Project life cycle and build automation.

Java: Primary programming language.

Web interactions: HTML, CSS, JavaScript, Xpath

**Project Structure**

IDE : Eclipse

src/main/java contains all the packages of Factory and Framework Configs, Object repository, data providers, drivers,annotations, utilities.

src/main/resources contains Config Properties file.

src/test/java contains Test Base class, Test classes, Runner class, Step Definition

src/test/resources contains Test Data file , Feature File, Report, Screenshots

pom.xml is a Maven project file for managing dependencies.

**Pre-requisites**
Java Development Kit (JDK)
Maven
Junit Cucumber
Eclipse IDE or any other IDE
Installation

**Clone the repository**
git clone - https://github.com/ChrisiiKeys/NYTimes.git

**Running Tests using CLI**
Navigate to the project directory and execute the code : mvn clean test


**Running Tests on different browser**

\src\main\resources\config\AmsConfig.properties
Change the browser type to below in the above mentioned config file for running on different browser:
Chrome(Currently set)
Edge
Firefox

**Running the Tests**

Open the Project folder in Git
Navigate to src/test/java and open the org.runner package.
Open the TestRunner.java class and Run the Test file.

**Test Case Overview**

TC_01 - This scenario focuses on the login which then leads to the Homepage

TC_02 - This scenario focus on the 2024 Elections page which is a sub module in U.S page

TC_03 - This scenario has the focus on Canada region under world news module.

TC_04 - This scenario has the functionality of Searching "Climate", inside the search box and to wait for the result.

