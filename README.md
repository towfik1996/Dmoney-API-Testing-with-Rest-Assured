# Dmoney-API-Testing-with-Rest-Assured

## What is Rest Assured in API Automation?
Rest Assured is an open-source Java library used to test RESTful APIs. It provides a domain-specific language (DSL) for writing API tests in a simple and readable format. Rest Assured supports various HTTP methods such as GET, POST, PUT, DELETE, etc., and allows us to set request headers, query parameters, and request bodies. It also provides easy-to-use assertion methods to validate the response received from the server. Rest Assured is widely used in the industry for API testing due to its simplicity and effectiveness.

## Why Rest Assured is popular choice for API Testing?
There are several reasons why Rest Assured is a popular choice for API testing:

- Easy to Use: Rest Assured provides a simple and intuitive syntax for writing API tests, making it easy for both developers and testers to use.

- Comprehensive Functionality: Rest Assured supports various HTTP methods and provides a wide range of assertions, making it easy to test various aspects of an API such as response status codes, response headers, response body, and more.

- Integration: Rest Assured can be easily integrated with popular testing frameworks like JUnit and TestNG, making it easy to incorporate API tests into existing test suites.

- Automation: Rest Assured allows for the automation of API tests, which can save time and resources by automating repetitive tasks and increasing test coverage.

- Open-source: Rest Assured is an open-source library, which means it's free to use and has an active community of developers contributing to its development and maintenance.

## Technology Used:
- Rest Assured
- commons-configuration
- Jackson Databind
- TestNG
- Java
- Gradle
- intellij idea
- Allure

## How to run this project:
- Clone this project
- hit the following command: ```gradle clean test```
- for Allure Report hit: ```allure generate allure-results --clean -o allure-report and allure serve allure-results```

## Project Scenerio:
- Call login API
- Create a new user
- get user list
- Search by the user Id

## Allure Report:
![1](https://github.com/towfik1996/Dmoney-API-Testing-with-Rest-Assured/assets/96409251/7d2fcb47-e053-4295-8ed3-20f912213351)
![2](https://github.com/towfik1996/Dmoney-API-Testing-with-Rest-Assured/assets/96409251/84d1629e-30b2-4ca8-a528-be9386b38d7b)
