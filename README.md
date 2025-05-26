# weather-ui-test-automation
UI test automation project for AccuWeather using Java, TestNG, and Aquality Selenium. Validates weather search functionality and city-specific weather page data.
# 🌤️ AccuWeather UI Test Automation

This project is a UI test automation suite written in **Java 17**, using **Aquality Selenium**, **TestNG**, and **Awaitility**, designed to validate the search functionality of [AccuWeather.com](https://www.accuweather.com).

## ✅ What It Does

- Automates a test case where a user searches for a city (e.g., "New York")
- Validates that:
  - The search result list appears
  - The correct city weather page is opened
  - The city name is present on the page
    
## 🔧 Tech Stack

| Tool/Library        | Purpose                          |
|---------------------|----------------------------------|
| **Java 17**         | Core language                    |
| **Maven**           | Dependency & build management    |
| **TestNG**          | Test execution framework         |
| **Aquality Selenium** | UI test automation framework  |
| **Awaitility**      | Asynchronous wait handling       |
| **Gson**            | JSON handling                    |
| **Lombok**          | Reduces boilerplate code         |
| **SLF4J**           | Logging                          |

---

## 🚀 How to Run the Tests

1. Clone the repo.
2. Open the project in **IntelliJ** (or your preferred Java IDE).
3. Ensure you have **Maven** and **Java 17** installed and configured.
4. Run tests via Maven:

```bash
mvn clean test
