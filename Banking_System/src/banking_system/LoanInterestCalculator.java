
package banking_system;

import java.util.Scanner;



public class LoanInterestCalculator {
    public void interest()
    {
        Scanner ch=new Scanner(System.in);
        System.out.println("1:Loan Calculator\t0:Exit");
        int choice = ch.nextInt();
        switch(choice)
        {
            case 1:   
        
          
        double loan_principle,interest_rate=0,interest,total_interest;
		int no_of_payments;
		
		System.out.println("Enter the Loan Principle/Amount");
		Scanner sc = new Scanner(System.in);
		loan_principle=sc.nextFloat();
		
		System.out.println("Enter the Time Duration for Loan in year :");
		no_of_payments=sc.nextInt();
		
		if(no_of_payments==1)
		{
			interest_rate = 4.0;
		}
		else if(no_of_payments==2)
		{
			interest_rate = 6.0;
		}
		else if(no_of_payments==3)
		{
			interest_rate = 8.0;
		}
		else if(no_of_payments==4)
		{
			interest_rate = 10.0;
		}
		else if(no_of_payments==5)
		{
			interest_rate = 12.0;
		}
	
		
		no_of_payments=no_of_payments*12;
		interest= ((interest_rate/no_of_payments)*(loan_principle));
		System.out.print("The Interest is= "+interest+ "/Year\n");
		total_interest=interest*no_of_payments/12;
		System.out.println("Total interest for "+no_of_payments/12+ " years=" +total_interest);
		System.out.println("Total(Total Interest+Loan Principle)=" +(total_interest+loan_principle));
                
            case 0:
                System.exit(0);
	}
	
    }
}
    

