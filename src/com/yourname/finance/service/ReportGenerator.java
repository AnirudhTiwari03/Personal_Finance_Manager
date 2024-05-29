package com.yourname.finance.service;

import com.yourname.finance.model.Transaction;

import java.util.List;

public class ReportGenerator {

    public void printReport(List<Transaction> transactions) {
        System.out.println("----- Financial Report -----");
        transactions.forEach(System.out::println);
        System.out.println("----------------------------");
    }
}
