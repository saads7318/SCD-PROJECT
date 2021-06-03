
package banking_system;

import java.util.Scanner;


public class mobile_recharge {
    public void recharge()
    {
            Scanner re = new Scanner(System.in);
        System.out.println("1:Post Paid\t2:PrePaid\t0:Exit");
        int r=re.nextInt();
        switch(r)
                {
            
            case 1:
             System.out.println("Enter The Number");
        double num=re.nextFloat();
        System.out.println("Enter The Amount");
       double am=re.nextInt();
            float n=(float) (am-(am*0.125));
            System.out.println(n+" Rupees Balance After Tax Transfer Successfully");
            
            break;
            case 2:
        System.out.println("Enter The Number");
        double num1=re.nextFloat();
        System.out.println("Enter The Amount");
       double am1=re.nextInt();
        if (am1<50)
        {
            System.out.println("Cant Proceed!! Enter The Amount More than 50 Rupees");
        }
        else 
        {
            
            float n1=(float) (am1-(am1*0.125));
          
            System.out.println(n1+" Rupees Balance After Tax Transfer Successfully");
        }
        
        
        break;
        
            case 0:
                System.exit(0);
    }
    
}}
