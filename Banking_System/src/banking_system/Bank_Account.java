/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking_system;

public class Bank_Account
{
  private double balance;
 
  /**
 Constructs a bank account with a zero balance.
 */
 public Bank_Account()
 {
 balance = 0;
 }
synchronized void deposit(double amount)
 {
 System.out.print("Deposited " + amount);
 double newBalance = balance + amount;
 System.out.println(", new balance is " + newBalance);
 balance = newBalance;
 }
synchronized void withdraw(double amount)
 {
 System.out.print("Withdrawed " + amount);
 double newBalance = balance - amount;
 System.out.println(", new balance is " + newBalance);
 balance = newBalance;
 }

 public double getBalance()
 {
 return balance;
 }
 }