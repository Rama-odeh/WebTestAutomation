# Automated Test Suite for Online Bookstore

This project contains an automated test suite for a sample online bookstore. The test suite is written using Selenium WebDriver and TestNG, and it covers the following test scenarios:
1. Verify that the list of books is displayed correctly.
2. Verify that a user can add a book to the cart.
3. Verify that the cart updates correctly when a book is added.
4. Verify that the user can proceed to checkout from the cart.

## Prerequisites

Before running the tests, ensure you have the following installed:
- Java Development Kit (JDK) (version 8 or higher)
- Google Chrome Browser
- ChromeDriver
- TestNG (installable via Eclipse)

## Setup Instructions

1. **Install TestNG in Eclipse**

   Using Eclipse Marketplace:
   - Open Eclipse.
   - Navigate to Help > Eclipse Marketplace.
   - In the search bar, type TestNG and press Enter.
   - Find TestNG in the results and click Install.
   - Follow the prompts to complete the installation and restart Eclipse if required.

2. **Ensure Google Chrome and ChromeDriver are Available**

3. **Add TestNG and Selenium Dependencies to Maven Project**

   Visit Maven Repository:

   **Copy TestNG Dependency:**
   - Search for TestNG in the search bar and press Enter.
   - Select the appropriate version (e.g., 7.10.2) and copy the dependency code. For example:
     ```xml
     <!-- https://mvnrepository.com/artifact/org.testng/testng -->
     <dependency>
       <groupId>org.testng</groupId>
       <artifactId>testng</artifactId>
       <version>7.10.2</version>
       <scope>test</scope>
     </dependency>
     ```

   **Copy Selenium Dependency:**
   - Search for Selenium Java in the search bar.
   - Select the appropriate version (e.g., 4.23.0) and copy the dependency code. For example:
     ```xml
     <!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
     <dependency>
       <groupId>org.seleniumhq.selenium</groupId>
       <artifactId>selenium-java</artifactId>
       <version>4.23.0</version>
     </dependency>
     ```

   **Add Dependencies to `pom.xml`:**
   - Open the `pom.xml` file in your Maven project.
   - Add the copied dependencies within the `<dependencies>` section. For example:
     ```xml
     <dependencies>
       <!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
       <dependency>
         <groupId>org.seleniumhq.selenium</groupId>
         <artifactId>selenium-java</artifactId>
         <version>4.23.0</version>
       </dependency>
       <!-- https://mvnrepository.com/artifact/org.testng/testng -->
       <dependency>
         <groupId>org.testng</groupId>
         <artifactId>testng</artifactId>
         <version>7.10.2</version>
         <scope>test</scope>
       </dependency>
     </dependencies>
     ```

## Running the Tests

To run the tests, use the following Maven command:

mvn test
