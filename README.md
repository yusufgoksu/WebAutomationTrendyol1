# Trendyol Web Automation

## Overview
This project automates various scenarios on the **Trendyol website**. The goal is to automate the **login**, **search**, **add to favorites**, and **failed login attempt** functionalities. It uses **Java** with **Selenium** for browser automation and **JUnit** for running the tests.

## Features
- **Login Test**: Verifies user login functionality with valid credentials.
- **Failed Login Test**: Validates the response for invalid login attempts.
- **Search Test**: Tests the search functionality with various keywords.
- **Add to Favorites Test**: Verifies adding items to the favorites list.

## Technologies
- **Programming Language**: Java
- **Automation Tool**: Selenium
- **Testing Framework**: JUnit
- **IDE**: IntelliJ IDEA or Eclipse
- **Build Tool**: Maven

## Setup

### Prerequisites
Ensure that the following are installed:
- **Java**: Version 8 or higher
- **Maven**: For managing dependencies and building the project
- **Selenium WebDriver**: For automating the browser
- **JUnit**: For running tests

### Steps to Setup
1. **Clone the Repository**  
   Clone the repository to your local machine:
   ```bash
   git clone https://github.com/yusufgoksu/WebAutomationTrendyol.git
   cd WebAutomationTrendyol

2. **Install Dependencies**  
  Use Maven to install the necessary dependencies:
   ```bash
   mvn clean install

Download WebDriver
Download the appropriate WebDriver for your browser (e.g., ChromeDriver for Chrome) and ensure it’s in your system's PATH or specify its location in the code.

 3. **Update Configuration**  
   Edit the config.properties file to provide your login credentials:
    ```bash
     site.url=https://www.trendyol.com
     username=your-email@example.com
     password=yourpassword

 
4. **Run the Tests**  
  Execute all the tests using Maven:
   ```bash
   mvn test

5. **Project Structure**  
   ```bash
                                                                          WebAutomationTrendyol/
               WebAutomationTrendyol/
              ├── src/main/java
              │   ├── base/               # BaseLib class for shared functions and setup
              │   ├── pages/              # Page Object Model classes
              │   │   ├── HomePage.java   # Represents the homepage and its interactions
              │   │   ├── ProductPage.java # Represents the product page and its interactions
              │   │   ├── LoginPage.java  # Represents the login page and its interactions
              │   │   └── ProductListingPage.java # Represents the product listing page and its interactions
              │   └── utils/              # Utility classes for reusable code
              ├── src/test/java
              │   ├── tests/              # Test cases for login, search, favorites, etc.
              │   └── base/               # Base classes for test setup
              ├── config.properties       # Configuration file for test parameters
              └── pom.xml                 # Maven configuration file

## Test Cases

1. **Login Test**  
   - Verifies that the user can successfully log in with valid credentials.

2. **Failed Login Test**  
   - Tests login with incorrect credentials and ensures that an error message is displayed.

3. **Search Test**  
   - Validates the search functionality by inputting search terms and verifying that relevant results appear.

4. **Add to Favorites Test**  
   - Verifies that an item can be added to the favorites list successfully.

## Contributing

1. Fork the repository.
2. Create a new branch (`git checkout -b feature-branch`).
3. Commit your changes (`git commit -m "Added new feature"`).
4. Push to your branch (`git push origin feature-branch`).
5. Open a Pull Request to the main repository.

## License

This project is licensed under the MIT License. See the `LICENSE` file for details.



   


