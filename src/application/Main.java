package application;

import entities.Account;
import entities.BusinessAcount;
import entities.SavingsAccount;

public class Main {
    public static void main(String[] args) {
        Account acc = new Account(1001, "Thrwo", 1000.0);
        acc.withdraw(200);
        System.out.println(acc.getBalance());

        Account acc2 = new SavingsAccount(1002, "ana", 1000.0, 0.01);
        acc2.withdraw(200.0);
        System.out.println(acc2.getBalance());

        Account acc3 = new BusinessAcount(1003, "bob", 1000.0, 500.0);
        acc3.withdraw(200.0);
        System.out.println(acc3.getBalance());
    }
}