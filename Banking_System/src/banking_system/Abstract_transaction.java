
package banking_system;

import java.util.Scanner;

public abstract class Abstract_transaction {
    protected String UserNumber;
    public abstract boolean isNull();
    protected int Amount;
    protected int Balance;
}
class Coder extends Abstract_transaction{
 Scanner sc = new Scanner(System.in);
    private String Nic;

   public void getUserNumber(){
       
       System.out.println("Are You Sure To Transfer The Amount!! Press 1");
       System.out.println("Press 2 For Cancel the Transaction");
       int c = sc.nextInt();
       switch(c){
           case 1 :
              if(c==1){
                 System.out.println("Transaction open ! ");
                 System.out.println("Enter  Account Number to Transfer! ");
                 int UserNumber;
                 UserNumber = sc.nextInt();
                 System.out.println("Transfered! ");
             
                
              } else if(c==2){
                  System.out.println("Back to Home");
                  System.exit(0);
              }
           
       }
   }
   public void Amount(){
       int Balance = 890000;
       int Amount;
      System.out.println("Please Enter Details To Transfer Amount ");
       System.out.println("Enter the Amount to transfer");
       Amount=sc.nextInt();
       if(Amount<=Balance){
           System.out.println("The Amount " +Amount+ " is ready to transfer"); 
           Balance = Balance - Amount;
                System.out.println("Your Amount After Transaction  " +Amount+  " and new balance is " +Balance+ "\n");
       }
       else{ if(Amount>=Balance){
           System.out.println("Insufficent Balance");
           System.exit(0);
       }
           
       }
   } @Override
    public boolean isNull() {
       return false;
       
    }
}
 class  Notransaction extends Abstract_transaction{

    public String UserName(){
        return "Amount Error";
        
    }
     @Override
    public boolean isNull() {
        return false;
       
    }}
  
    
    
 
  