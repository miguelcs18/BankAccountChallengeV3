package com.bankaccountchallenge;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        BankAccount miguelAccount = new BankAccount();
        miguelAccount.withdraw(100.0);

        miguelAccount.deposit(50.0);
        miguelAccount.withdraw(100.0);

        miguelAccount.deposit(51.0);
        miguelAccount.withdraw(100);
    }
}
