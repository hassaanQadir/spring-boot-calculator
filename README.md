# spring-boot-calculator

A simple calculator built with Spring Boot and a basic HTML/JS UI

<img width="1470" alt="image" src="https://github.com/user-attachments/assets/18d83f4b-4359-4f5e-82b8-b13fec85cc33" />


## Overview
This project demonstrates how to build a simple four-function calculator using **Spring Boot** on the backend and a basic **HTML/CSS/JavaScript** interface on the frontend.

---

## Development History

1. **Initial Spring Boot Setup**  
   - Generated a basic Spring Boot project using [Spring Initializr](https://start.spring.io/).  
   - Created a `CalculatorController` with REST endpoints for **add**, **subtract**, **multiply**, and **divide**.  

2. **Added Unit Tests using JUnit**  
   - Implemented **JUnit 5** tests for the arithmetic logic by invoking controller methods.  
   - Added **integration tests** using `MockMvc` to verify endpoints respond correctly.  

3. **Basic HTML/JS Frontend**  
   - Placed a simple `index.html` in `src/main/resources/static` to fetch endpoints using JavaScript.  
   - Allowed users to enter `num1` and `num2`, select an operation, and see the result displayed.  

4. **Prettified the UI**  
   - Replaced the basic HTML page with a more stylized calculator interface using **CSS** grid and custom styling.  
   - Added button designs, a digital-style calculator “display,” and interactive transitions.
   - Created a separate **header** to display **“Hassaan's 4-function calculator”** at the top of the page.
     
5. **Set Up GitHub Repository**  
   - Created a GitHub repository named `spring-boot-calculator`.  
   - Initialized the local project as a Git repo, committed files, and pushed to GitHub.  
   - Resolved merge conflicts by pulling and merging remote changes, then pushing again.  

---

## How to Run

1. **Clone the repository**:
   ```bash
   git clone https://github.com/hassaanQadir/spring-boot-calculator.git
   ```
2. **Navigate** into the project directory:
   ```bash
   cd spring-boot-calculator
   ```
3. **Build & run** the Spring Boot app:
   ```bash
   mvn spring-boot:run
   ```
   The application will start on [http://localhost:8080](http://localhost:8080).

4. **Open the Calculator UI**:
   - Go to [http://localhost:8080](http://localhost:8080) to see the styled calculator page.
   - Click buttons to perform **addition**, **subtraction**, **multiplication**, or **division**.

---

## Tests

- **Unit Tests**: Located in `src/test/java/...`, checking arithmetic logic.  
- **Integration Tests**: Also in `src/test/java/...`, using `MockMvc` to verify HTTP endpoints.

Run tests with:
```bash
mvn test
```

---

## Future Enhancements

- Error handling and custom responses for divide-by-zero.  
- Additional operations (exponent, modulus, memory, etc.).  
- Responsive or mobile-friendly UI design.  
- Authentication and user-specific history/tracking (database integration).

---

### License

This project is licensed under the Apache License 2.0.  
