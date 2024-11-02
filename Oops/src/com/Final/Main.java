package com.Final;


 final class BankAccount {

 private final String accountNumber;
 private double balance;


 public BankAccount(String accountNumber, double balance) {
     this.accountNumber = accountNumber;
     this.balance = balance;
 }


 public final double getBalance() {
     return balance;
 }


 public void deposit(double amount) {
     if (amount > 0) {
         balance += amount;
         System.out.println("Deposited: $" + amount);
     }
 }

 public void withdraw(double amount) {
     if (amount > 0 && balance >= amount) {
         balance -= amount;
         System.out.println("Withdrew: $" + amount);
     } else {
         System.out.println("Insufficient balance or invalid amount.");
     }
 }


 public final void printAccountDetails() {
     System.out.println("Account Number: " + accountNumber);
     System.out.println("Balance: $" + balance);
 }
}

public class Main {
 public static void main(String[] args) {
     BankAccount account = new BankAccount("123456789", 1000.00);
     account.deposit(500);
     account.withdraw(200);
     account.printAccountDetails();
 }
}

