# 🚀 Unified Automation Framework (UI & API)

A robust, scalable, and maintainable Test Automation Framework built from scratch using Java. This framework is designed to handle both **Frontend (UI)** and **Backend (API)** automation within a single unified architecture, adhering to the SOLID principles and Clean Code practices.

## 🛠️ Technology Stack
* **Language:** Java 
* **Build Tool:** Maven
* **UI Automation:** Selenium WebDriver
* **API Automation:** Rest-Assured
* **Architecture Patterns:** Page Object Model (POM) for UI, Service Object Model (SOM) for API, Factory Pattern, Strategy Pattern.

## 🏗️ Architecture Overview

The framework is highly modular, ensuring that business logic is completely separated from the test execution and configuration.

### API Layer Architecture
1.  **Base Engine (`BaseApI` & `RestWrapper`):** Acts as the core HTTP client. It encapsulates RestAssured syntax, handles common request specifications (Base URL, Headers, Logging), and ensures zero code duplication.
2.  **Authentication Strategy (`AuthTypes` & `AuthFactory`):**
    Implements a dynamic Factory Pattern utilizing `Enums` to seamlessly inject different authentication methods (Bearer, API Key, Basic) into requests without altering the core engine.
3.  **Service Object Model (`Service` Layer):**
    Mirrors the UI's POM. Each API domain (e.g., `AuthService`, `UserService`) has its own class representing the available business actions, completely hiding HTTP verbs and endpoints from the test layer.
4.  **Configuration Management (`ConfigReader` & `.env`):**
    Strict separation of environment configurations from the codebase. Secrets and Base URLs are managed via `.env` files to ensure security and cross-environment execution.

### UI Layer Architecture (Upcoming)
* **Base Page:** Centralized WebDriver initialization and common interactions (Waits, Clicks, SendKeys).
* **Page Objects:** Locators and specific page actions isolated per screen.

## ⚙️ Setup & Installation

1.  **Clone the repository:**
    ```bash
    git clone [your-repo-link]
    ```
2.  **Install dependencies:**
    Ensure you have Maven installed, then run:
    ```bash
    mvn clean install
    ```
3.  **Environment Variables:**
    Create a `.env` file in the root directory (this file is git-ignored) and add your environment-specific configurations:
    ```properties
    BaseUrl=[https://your-api-base-url.com/api/v1](https://your-api-base-url.com/api/v1)
    AdminToken=your_bearer_token_here
    ```