package com.bankaccountchallenge;

public class BankAccount {
 private String number;
 private double balance;
 private String customerName;
 private String email;
 private String phoneNumber;

    public BankAccount() {
        this("11111",2.50,"Default name","Defaul email","999-999-999");
    }

    public BankAccount(String number, double balance, String customerName, String email, String phoneNumber) {
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double quantity){
     this.balance += quantity;
     System.out.println("Deposit of " + quantity + "  done correctly. Now you have " + this.balance +
             " in you account");
 }

 public void withdraw(double quantity){
     if(this.balance - quantity < 0){
         System.out.println("The withdrawal could not be done, you have " + this.balance + " in your account");
     }
     else{
         this.balance -= quantity;
         System.out.println("Withdrawal of " + quantity + " done correctly. Now you have " + this.balance
                 + " in you balance ");
     }
 }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
