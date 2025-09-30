# Selenide Project

**Selenide Project** is an automated testing framework for web applications, built with **Selenide**, **Selenium WebDriver**, and **Gradle**. 
The project leverages **Behavior-Driven Development (BDD)** with feature files to test web application functionality efficiently.


## Technologies Used
- Java  
- Gradle  
- Selenium WebDriver  
- Selenide  
- Cucumber (BDD)  
- Page Object Model (POM) design pattern  
- Test properties for configuration and test data  

## Features
- BDD approach with **Cucumber feature files** to define test scenarios in natural language.  
- Page Object Model design for reusable and maintainable page classes.  
- Covers main functionality including login and home page interactions.  
- Test runner configured to execute all feature files with proper reporting.  
- Utilities for configuration and test data management (`Test.properties`).  

# Project Structure Overview
src/main/java/com/sconto/pages — Page classes (HomePage, LoginPage)
src/main/java/com/sconto/utils — Utilities for test support
src/main/java/com/sconto/properties — Test properties and loader classes
src/test/java/com/sconto/stepdefinitions — Step definitions and TestRunner.java
src/test/resources/features — Feature files defining scenarios (e.g., LoginFeature.feature)
src/test/resources — Configuration files (Test.properties)
