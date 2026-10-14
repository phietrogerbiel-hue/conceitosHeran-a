package application;

import entities.Account;
import entities.BusinessAcount;
import entities.SavingsAccount;

public class Main {
    public static void main(String[] args) {
        Account acc = new Account(1001, "Thrwo", 1000.0);
        acc.withdraw(200);
        System.out.println(acc.getBalance());


    }
}