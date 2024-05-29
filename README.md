# Personal Finance Manager

Personal Finance Manager is a command-line Java application designed to help users manage their personal finances effectively. It allows users to track their expenses and incomes, view all transactions, and generate simple financial reports. This project demonstrates the use of object-oriented programming principles, file handling, and user input handling in Java.

## Features

1. **Add Expense**:
   - Allows users to record an expense by entering a description, amount, and date.
   - Expenses are stored and can be viewed or included in financial reports.

2. **Add Income**:
   - Allows users to record an income by entering a description, amount, and date.
   - Incomes are stored and can be viewed or included in financial reports.

3. **View Transactions**:
   - Displays a list of all recorded transactions (both expenses and incomes).
   - Provides a quick overview of the user's financial activities.

4. **View Report**:
   - Generates a simple financial report showing total expenses, total income, and net balance.
   - Provides a summary of the financial status based on recorded transactions.

5. **Exit**:
   - Allows users to exit the application gracefully.

## Project Structure

The project is organized into several packages for better modularity and maintainability:

1. **com.yourname.finance.model**:
   - Contains the model classes representing the core entities of the application.
     - `Transaction`: Abstract base class for financial transactions.
     - `Expense`: Represents an expense, extending `Transaction`.
     - `Income`: Represents an income, extending `Transaction`.

2. **com.yourname.finance.service**:
   - Contains the service classes that handle the business logic.
     - `FinanceManager`: Manages the list of transactions and provides methods to add expenses, add incomes, and retrieve transactions.
     - `ReportGenerator`: Generates and prints a financial report based on the transactions.

3. **com.yourname.finance.util**:
   - Contains utility classes for input handling.
     - `InputUtil`: Provides methods to read user input from the console.

4. **Main Class**:
   - `Main`: The entry point of the application. It provides a menu-driven interface for interacting with the application.
