/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking_system;

public class Withdraw_Runnable implements Runnable
  {
  private static final int DELAY = 1;
  private Bank_Account account;
  private double amount;
  private int count=5;


 public Withdraw_Runnable(Bank_Account anAccount, double anAmount,
 int aCount)
 {
 account = anAccount;
 amount = anAmount;
 count = aCount;
 }
public void run()
 {
 try
 {
 for (int i = 1; i <=2; i++)
 {
 account.withdraw(amount);
 Thread.sleep(DELAY);
 }
 }
 catch (InterruptedException exception) {}
 }
 }
