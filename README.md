# Blaugrana Hub – Automated UI Testing

This project contains an automated UI testing framework built for the course **Metode i tehnike testiranja programske podrške**.  
The tests are written for **Blaugrana Hub**, a simple static web app about FC Barcelona.

## Application Under Test

The app is hosted on GitHub Pages, so the tests run without any local frontend setup.

**URL:** https://filipkampic.github.io/blaugrana-hub/

## What's Covered

The test suite focuses on real UI behavior:

- Navigation menu interactions  
- Squad list visibility and basic interactions  
- Formation selection and correct formation rendering  

## Tech Stack

- Java  
- Maven  
- Selenium WebDriver  
- TestNG  
- WebDriverManager  
- WebDriverWait  
- GitHub

## Project Structure

The framework uses the **Page Object Model (POM)** for cleaner and more maintainable tests.

## Running the Tests

**Prerequisites:** JDK 8+, Maven, Google Chrome

```bash
git clone https://github.com/filipkampic/blaugrana-hub-testing
cd blaugrana-hub-testing
mvn test
```

## Author

Student project created for academic purposes.
