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

        VipCustomer customer1 = new VipCustomer();
        System.out.println("customer1 = " + customer1.getName());

        VipCustomer customer2 = new VipCustomer("mike",25000.0);
        System.out.println("customer2 = " + customer2.getName());

        VipCustomer customer3 = new VipCustomer("Bart",100.0,"bart@email.com");
        System.out.println("customer3 = " + customer3.getName());
        System.out.println("customer3 email = " + customer3.getEmail());
    }
}
