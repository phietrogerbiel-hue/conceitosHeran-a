package application;

import entities.BusinessAcount;

public class Main {
    static void main(String[] args) {

        BusinessAcount acount = new BusinessAcount(1212, "Phietro", 0.0, 500.0);

        System.out.println("Saldo inicial: " + acount.getBalance());

        acount.deposit(100);
        System.out.println("Saldo pós depósito: " + acount.getBalance());

        acount.loan(200);
        System.out.println("Saldo pós empréstimo: " + acount.getBalance());
    }
}