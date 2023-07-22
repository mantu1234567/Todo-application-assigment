# Todo App - Readme

This repository contains a simple Java application for a Todo App. It provides functionality to manage a list of todos and their statuses.

## Tech Stack

The application is built using the following technologies:

- Java
- Spring Boot
- Maven (for dependency management)

## Project Structure

The project is organized into packages to keep related files together:

1. `com.geekster.Todo_app_practies.model`: This package contains the `Todo` class, representing the model for todos. It includes attributes like `todoId`, `todoName`, and `isTodoDoneStatus`.

2. `com.geekster.Todo_app_practies.controller`: This package contains the RESTful API controllers that handle incoming requests related to the todo app. The `TodoController` class contains endpoints for adding, updating, retrieving, and deleting todos.

3. `com.geekster.Todo_app_practies.service`: This package contains the service layer of the application. The `TodoService` class provides methods to perform various operations on todos.

4. `com.geekster.Todo_app_practies.repository`: This package contains the data access layer. The `TodoRepo` class is a simple in-memory data repository for managing todos.

## Functionality

The application provides the following functionalities:

1. **Add Todo**: Endpoint to add a todo to the system.

2. **Find All Todos**: Endpoint to retrieve all todos.

3. **Find Done Todos**: Endpoint to retrieve todos marked as done.

4. **Find Undone Todos**: Endpoint to retrieve todos marked as undone.

5. **Update Todo**: Endpoint to update the name of a todo by its ID.

6. **Find Todo by ID**: Endpoint to retrieve a todo by its ID.

7. **Delete Todo**: Endpoint to delete a todo by its ID.

## Controller

The Controller layer is responsible for handling incoming HTTP requests and returning appropriate responses. It interacts with the Service layer to perform various operations on todos. The `TodoController` class contains endpoints for managing todos:

- **Add Todo**: Endpoint to add a todo to the system.

- **Find All Todos**: Endpoint to retrieve all todos.

- **Find Done Todos**: Endpoint to retrieve todos marked as done.

- **Find Undone Todos**: Endpoint to retrieve todos marked as undone.

- **Update Todo**: Endpoint to update the name of a todo by its ID.

- **Find Todo by ID**: Endpoint to retrieve a todo by its ID.

- **Delete Todo**: Endpoint to delete a todo by its ID.

## Service

The Service layer contains the business logic of the application. The `TodoService` class is responsible for implementing various operations related to todos. It interacts with the Repository layer to access the data. The `TodoService` class provides the following methods:

- **Add Todo**: Method to add a todo to the system.

- **Find All Todos**: Method to retrieve all todos.

- **Find Done Todos**: Method to retrieve todos marked as done.

- **Find Undone Todos**: Method to retrieve todos marked as undone.

- **Update Todo**: Method to update the name of a todo by its ID.

- **Find Todo by ID**: Method to retrieve a todo by its ID.

- **Delete Todo**: Method to delete a todo by its ID.

## Repository

The Repository layer is responsible for data access and communication with the database. In this case, the `TodoRepo` class acts as a simple in-memory data repository for managing todos.

## Getting Started

To run the application locally, follow these steps:

1. Ensure you have Java JDK and Maven installed on your system.

2. Clone this repository to your local machine.

3. Open the project in your preferred Java IDE.

4. Build the project using Maven.

5. Run the application.

6. The application should now be running, and you can use tools like Postman to test the RESTful API endpoints.

## Contributing

If you wish to contribute to this project, feel free to create pull requests or open issues for improvements or bug fixes.

