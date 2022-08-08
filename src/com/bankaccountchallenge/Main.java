package com.bankaccountchallenge;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        BankAccount miguelAccount = new BankAccount("12345",200.0,"Mike","mymail@gmail.com",
                "333-333-333");

        miguelAccount.withdraw(100.0);

        miguelAccount.deposit(50.0);
        miguelAccount.withdraw(100.0);

        miguelAccount.deposit(51.0);
        miguelAccount.withdraw(100);
    }
}
