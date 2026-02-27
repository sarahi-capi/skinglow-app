# SkinGlow: Skincare Routine Manager 🧴🫧

A Java application built to model personalized skincare routines, heavily utilizing advanced Object-Oriented Programming (OOP) paradigms and JavaFX for the user interface.

<p align="center">
  <video src="https://github.com/user-attachments/assets/1380b7da-dfec-4e62-9f7a-ab2da53c867f" width="100%" controls></video>
</p>

## The Concept ✨
**SkinGlow** is a catalog and routine-building application that helps users understand when and how to apply different skincare products (Cleansers, Serums, Moisturizers, etc.) based on their specific skin type. The core focus of this project was to implement a robust, scalable backend architecture utilizing strict OOP principles.

## Software Architecture & OOP Concepts 🛠️
This project demonstrates a deep understanding of Java backend structuring:

* **Abstraction & Inheritance:** Utilizes a core `SkincareProducts.java` abstract base class to enforce architectural rules, which is then extended by specific child classes (e.g., `Cleanser.java`, `Sunscreen.java`).
* **Polymorphism (Overriding & Overloading):** Dynamic method dispatch is used to handle unique product behaviors (e.g., overriding the `morningRoutine()` and `nightRoutine()` methods). Method overloading is utilized within the `IGiveTips` interface to provide dynamic tip generation based on varying parameters.
* **Encapsulation:** Strict access modifiers (private fields with public getters) protect the integrity of the product data models.
* **Interface Segregation:** Behaviors that are not universal to all products are decoupled into specific interfaces like `IGiveTips.java` for cleaner, modular code.
* **Data Parsing:** The application dynamically loads product data from a `products.csv` file (`ReadingCSV.java`), demonstrating file I/O operations and data structure management.
* **MVC & JavaFX:** The visual frontend is fully decoupled from the backend logic, using `FXML` files and Controller classes (`CatalogController`, `MainSceneController`) for a clean Model-View-Controller architecture.

## How to Run 🚀
This project was built as a standard JavaFX module. To run it locally:
1. Clone the repository to your machine.
2. Open the project folder in your preferred Java IDE (IntelliJ IDEA, Eclipse, or VS Code).
3. Ensure the JavaFX SDK is configured in your project structure.
4. Run the `BlackJackApp.java` main class!

--- 

*Created by Sarahi — Bridging advanced Object-Oriented Programming with aesthetic UI design.* 
