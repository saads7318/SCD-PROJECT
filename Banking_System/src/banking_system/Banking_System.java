
package banking_system;

import java.util.Scanner;


public class Banking_System {

  public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
      User Banker = new User("Banker");
    Banker.sendMessage("Welcome To MCB Bank of Pakistan!");
       LoginInfo ms1=LoginInfo.getInstance();
       System.out.println("1:Amount Transaction\t\t 2:Bill Payment \n3:Loan Interest Calculator \t4:Car Monthly Installment\n5:Mobile Balance Recharge\t6:Transaction History\n7:Change Phone Number\t8:Show Details\n\t\t 0:Exit");
       int choice=sc.nextInt();
        while (choice < 0 || choice > 8) {
        System.out.print("\nError! Incorrect choice.\n");
        System.out.println("xxx"+choice+"xxxx");
        System.out.print("\nPLEASE ENTER AGAIN.\n");
        System.out.println("1:Amount Transaction\t\t 2:Bill Payment \n3:Loan Interest Calculator \t4:Car Monthly Installment\n0:Exit");

        choice = sc.nextInt();
    }
       
       switch(choice)
       {
           case 1:
      Coder c=new Coder();
       c.Amount();
       c.getUserNumber();
        

        break;
           case 2:
                 System.out.println("Online Billing Payment!");
       System.out.println("1:Electric Bill \t2:Gas Bill");
     
       int e= sc.nextInt();
       switch(e){
           case 1 :
               BillingFactory Bf =new BillingFactory();
                Billing E_Bill =  Bf.getBilling("E_Bill");
       E_Bill.bill_pay();
       
        
           case  2:
               BillingFactory b =new BillingFactory();
               Billing Gas_Bill =  b.getBilling("Gas_Bill");
       Gas_Bill.bill_pay(); 
       break;
       } 
           case 3:     
               LoanInterestCalculator in = new LoanInterestCalculator();
       in.interest();
       break;
       
           case 4:
               
               CarFinance car =new CarFinance();
       car.carFin();
               
       
       break;
           case 5:
               mobile_recharge r=new mobile_recharge();
               r.recharge();
           case 6:
               Bank_Account account = new Bank_Account();
 final double AMOUNT = 1000;
 final int REPETITIONS = 1;
 final int THREADS = 1;

 for (int i = 1; i <= THREADS; i++)
 {
 Deposit_Runnable d = new Deposit_Runnable(
 account, AMOUNT, REPETITIONS);
 Withdraw_Runnable w = new Withdraw_Runnable(
 account, AMOUNT, REPETITIONS);
Thread dt = new Thread(d);
 Thread wt = new Thread(w);

 dt.start();
 wt.start();
 }
       break;
           case 7:
     
    System.out.println("Phone Number");
	Phone_no obj2 = new Phone_no("0384841545");
	System.out.println("" +obj2.getName()+"\n");

	System.out.println("Updating Phone Number.........");
        System.out.println("Enter Updated Phone Number");
         
             
           obj2.setName("");
         
         
	System.out.println("Phone Number:"+ obj2.getName());
         
         break;
           case 8:
        Details obj1 = new Details ("SAAD AHMED" ,"5040564860115354654");
        
	System.out.println("ACCOUNT HOLDER: " + obj1.getUser_Name());
	System.out.println("ACCOUNT NUMBER: " + obj1.getAccount_Number());
           case 0:
               System.exit(0);
           
       }
       }
   
    
       
       
       
       
  }

   

