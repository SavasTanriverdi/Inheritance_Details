# Inheritance_Details

This project explores advanced inheritance concepts in Java, including **protected access modifier**, **upcasting and downcasting**, **`instanceof` operator**, and **overridden method behavior**. It demonstrates these concepts with a parent class `Employee` and subclasses `Manager` and `Developer`.

---

## Features
- **Protected Access Modifier**: Allows inherited classes to directly access parent class attributes.
- **Upcasting**: Treats subclass objects as instances of the parent class.
- **Downcasting**: Casts parent class references back to their specific subclass types.
- **`instanceof` Operator**: Ensures safe type casting by checking object types.
- **Overridden Methods**: Demonstrates polymorphism by overriding methods in subclasses.

---

## Code Overview

### 1. `Employee` Class (Parent)
- **Attributes**:
    - `name`: Name of the employee.
    - `age`: Age of the employee.
- **Methods**:
    - `displayInfo()`: Displays employee information.
    - `calculateBonus()`: Returns a default bonus of 1000.

### 2. `Manager` Class (Subclass)
- **Attributes**:
    - `teamSize`: Number of people in the manager's team.
- **Overridden Methods**:
    - `displayInfo()`: Adds team size to the output.
    - `calculateBonus()`: Custom bonus based on team size.
- **Additional Methods**:
    - `conductMeeting()`: Prints a message about conducting a team meeting.

### 3. `Developer` Class (Subclass)
- **Attributes**:
    - `programmingLanguage`: Primary programming language of the developer.
- **Overridden Methods**:
    - `displayInfo()`: Adds programming language to the output.
- **Additional Methods**:
    - `writeCode()`: Prints a message about writing code.

---

## How to Run

1. Clone the repository or download the project files.
2. Open the project in an IDE such as **IntelliJ IDEA** or **Eclipse**.
3. Compile and run the `InheritanceDetails.java` file.

---

## Sample Output

```plaintext
Employee Name: Alice, Age: 40
Team Size: 5
Employee Name: Bob, Age: 30
Programming Language: Java
Bonus for emp1: 2500.0
Bonus for emp2: 1000.0
Alice is conducting a team meeting.
Bob is writing code in Java.
