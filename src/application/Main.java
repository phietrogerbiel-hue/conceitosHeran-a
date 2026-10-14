package application;

import entities.Account;
import entities.BusinessAcount;
import entities.SavingsAccount;

public class Main {
    public static void main(String[] args) {
        Account acc = new Account(1001, "Thrwo", 0.0);
        BusinessAcount bacc = new BusinessAcount(1002, "Mdr", 0.0,500.0);


        //UPCASTING

        Account acc1 = bacc;
        Account acc2 = new BusinessAcount(1002, "Bob", 0.0, 200.0);
        Account acc3 = new SavingsAccount(1004,"ana",0.0,0.01);




    }
}