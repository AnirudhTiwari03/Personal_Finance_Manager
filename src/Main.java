package com.yourname.finance;

import com.yourname.finance.service.FinanceManager;
import com.yourname.finance.service.ReportGenerator;
import com.yourname.finance.util.InputUtil;

public class Main {

    public static void main(String[] args) {
        FinanceManager financeManager = new FinanceManager();
        ReportGenerator reportGenerator = new ReportGenerator();

        boolean running = true;
        while (running) {
            System.out.println("1. Add Expense");
            System.out.println("2. Add Income");
            System.out.println("3. View Transactions");
            System.out.println("4. View Report");
            System.out.println("5. Exit");

            int choice = (int) InputUtil.getDouble("Choose an option: ");

            switch (choice) {
                case 1:
                    String expenseDesc = InputUtil.getString("Enter expense description: ");
                    double expenseAmount = InputUtil.getDouble("Enter expense amount: ");
                    InputUtil.getString(""); // consume the leftover newline
                    String expenseDate = InputUtil.getString("Enter expense date (YYYY-MM-DD): ");
                    financeManager.addExpense(expenseDesc, expenseAmount, expenseDate);
                    break;
                case 2:
                    String incomeDesc = InputUtil.getString("Enter income description: ");
                    double incomeAmount = InputUtil.getDouble("Enter income amount: ");
                    InputUtil.getString(""); // consume the leftover newline
                    String incomeDate = InputUtil.getString("Enter income date (YYYY-MM-DD): ");
                    financeManager.addIncome(incomeDesc, incomeAmount, incomeDate);
                    break;
                case 3:
                    financeManager.getAllTransactions().forEach(System.out::println);
                    break;
                case 4:
                    reportGenerator.printReport(financeManager.getAllTransactions());
                    System.out.println("Total Expenses: " + financeManager.getTotalExpenses());
                    System.out.println("Total Income: " + financeManager.getTotalIncome());
                    System.out.println("Net Balance: " + financeManager.getNetBalance());
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
// now enjoy