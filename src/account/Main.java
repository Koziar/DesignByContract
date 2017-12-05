package account;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Account account = new Account(1000);

        System.out.println("Initial balance state: " + account.getBalance());

        account.deposit(100);
        System.out.println("Balance after deposit: " + account.getBalance());

        account.deposit(250);
        System.out.println("Balance after deposit: " + account.getBalance());

        account.withdraw(300);
        System.out.println("Balance after withdraw: " + account.getBalance());
    }
}
