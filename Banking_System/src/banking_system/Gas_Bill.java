
package banking_system;

import java.util.Scanner;

public class Gas_Bill implements Billing{

    @Override
    public void bill_pay() {
        int balance =890000;
        int Amount=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("\t\t Gas Bill Payment!");
        System.out.println("Enter Account Number");
        int Account=sc.nextInt();
        System.out.println("Enter Consumer Number");
        int Consumer=sc.nextInt();
        System.out.println("Enter Consumption");
        int Con=sc.nextInt();
       if(Con<=100){
           Amount=(int) (Con*1.20);
      } else if(Con<300)  {
            Amount=(int) (100*1.20+(Con-100)*2);
        }else if(Con>300){
            Amount=(int) (100*1.20+200*2+(Con-300)*3);
        }
       System.out.println("Bill to Pay"  +Amount);
         if(balance>=Amount)
       {
           System.out.println("Your Gas Bill ["+Amount+"] is Successfully Paid");
           System.out.println("Remaining Balance in your Account is "+(balance-Amount));
       }
       else
       {
           System.out.println("Insufficient Balance in your Account Can't Proceed Further");
       }
       System.exit(0);
    }
    
         
     
    }
   
