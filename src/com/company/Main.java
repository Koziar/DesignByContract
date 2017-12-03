package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Account account = new Account(1000);

        account.print();

        account.deposit(100);
        account.print();

        account.deposit(250);
        account.print();

        account.withdraw(300);
        account.print();
    }
}
