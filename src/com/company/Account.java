package com.company;

import java.io.IOException;

public class Account {
    private double balance;

    public Account(double b) {
        this.balance = b;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) throws IOException {
        if (this.balance > amount) {
            this.balance -= amount;
            System.out.println("Withdrawal of: " + amount);
        } else {
            throw new IOException();
        }
    }

    public void print() {
        System.out.println("Account balance: " + balance);
    }
}
