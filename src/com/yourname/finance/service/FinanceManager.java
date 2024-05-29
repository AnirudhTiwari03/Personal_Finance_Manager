package com.yourname.finance.service;

import com.yourname.finance.model.Expense;
import com.yourname.finance.model.Income;
import com.yourname.finance.model.Transaction;

import java.util.ArrayList;
import java.util.List;

public class FinanceManager {
    private List<Transaction> transactions;

    public FinanceManager() {
        this.transactions = new ArrayList<>();
    }

    public void addExpense(String description, double amount, String date) {
        transactions.add(new Expense(description, amount, date));
    }

    public void addIncome(String description, double amount, String date) {
        transactions.add(new Income(description, amount, date));
    }

    public List<Transaction> getAllTransactions() {
        return transactions;
    }

    public double getTotalExpenses() {
        return transactions.stream()
                .filter(t -> t instanceof Expense)
                .mapToDouble(Transaction::getAmount)
                .sum();
    }

    public double getTotalIncome() {
        return transactions.stream()
                .filter(t -> t instanceof Income)
                .mapToDouble(Transaction::getAmount)
                .sum();
    }

    public double getNetBalance() {
        return getTotalIncome() - getTotalExpenses();
    }
}
