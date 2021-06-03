
package banking_system;

import java.util.Scanner;


public class E_Bill implements Billing{
    
     @Override
    public void bill_pay() {
        int balance =890000;
        Scanner sc=new Scanner(System.in);
        System.out.println("\t\tElectricity Bill Payment!");
        System.out.println("Enter Account Number");
        int Account=sc.nextInt();
        System.out.println("Enter Consumer Number");
        int Consumer=sc.nextInt();
       
        System.out.println("Enter Consumption");
        int Con=sc.nextInt();
        double Amount=0;
       if(Con<=100){
           Amount= (Con*8);
      } else if(Con>100 || Con<=300)  {
            Amount= (100*8+(Con-100)*17);
        }else if(Con>300){
            Amount= (100*8+300*17+(Con-300)*20);
        }
       System.out.println("Bill to Pay "+Amount);
       if(balance>=Amount)
       {
           System.out.println("Your Electric Bill ["+Amount+"] is Successfully Paid");
           System.out.println("Remaining Balance in your Account is "+(balance-Amount));
       }
       else
       {
           System.out.println("Insufficient Balance in your Account Can't Proceed Further");
       }
       System.exit(0);
    }
    }
    

