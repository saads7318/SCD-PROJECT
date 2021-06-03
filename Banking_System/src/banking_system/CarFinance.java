
package banking_system;

import java.util.Scanner;


public class CarFinance {
    public void carFin()
	{
		double civic=3985000;
		double city=2865000;
		double corolla=3999000;
		double yaris=2999000;
		double fortuner=9399000;
		
		System.out.println("Select the Car Company");
		System.out.println("1:HONDA\t2:TOYOTA\t0:Exit");
		Scanner sc = new Scanner(System.in);
		int s=sc.nextInt();
		switch(s)
		{
			case 1:
				System.out.println("1:Honda Civic \t 2:Honda City");
				int b =sc.nextInt();
				switch(b)
				{
				case 1:
					System.out.println("Honda Civic\n Oriel 1.8 i-VTEC CVT\n1799cc - Petrol -Automatic\nPKR "+civic);
					System.out.println("Enter Tenure by Year");
					int ten =sc.nextInt();
					System.out.println("Enter Downpayment");
					int down=sc.nextInt();
					double interest=0.05;
					
					double monthly_installment=(civic*interest*(Math.pow(1+interest, ten*12))/(Math.pow(1+interest, (ten*12)-1)));
					System.out.println("Monthly Installment="+monthly_installment);
					break;
				case 2:
					System.out.println("Honda City\nAspire Prosmatec\n1497cc - Petrol -Automatic\nPKR "+city);
					
					System.out.println("Enter Tenure bt Year");
					int ten1 =sc.nextInt();
					System.out.println("Enter Downpayment");
					int down1=sc.nextInt();
					double interest1=0.05;
					double monthly_installment1=(city*interest1*(Math.pow(1+interest1, ten1*12))/(Math.pow(1+interest1, (ten1*12)-1)));
					System.out.println("Monthly Installment="+monthly_installment1);
					
					
					break;
				
				} break;
			case 2:
				System.out.println("1:Toyota Corolla \t 2:Toyota Yaris \t 3:Toyota Fortuner");
				int c =sc.nextInt();
				switch(c)
				{
				case 1:
					System.out.println("Toyota Corolla\n Altis Grande CVT-i 1.8\n1799cc - Petrol -Automatic\nPKR "+corolla);
					
					System.out.println("Enter Tenure bt Year");
					int ten =sc.nextInt();
					System.out.println("Enter Downpayment");
					int down=sc.nextInt();
					double interest=0.05;
					double monthly_installment=(corolla*interest*(Math.pow(1+interest, ten*12))/(Math.pow(1+interest, (ten*12)-1)));
					System.out.println("Monthly Installment="+monthly_installment);
					
					break;
				case 2:
					System.out.println("Toyota Yaris\n ATIV X CVT 1.5\n1496cc - Petrol -Automatic\nPKR "+yaris);
					
					System.out.println("Enter Tenure bt Year");
					int ten1 =sc.nextInt();
					System.out.println("Enter Downpayment");
					int down1=sc.nextInt();
					double interest1=0.05;
					double monthly_installment1=(yaris*interest1*(Math.pow(1+interest1, ten1*12))/(Math.pow(1+interest1, (ten1*12)-1)));
					System.out.println("Monthly Installment="+monthly_installment1);
					
					break;
					
				case 3:
					System.out.println("Toyota Fortuner\n TRD Sportivo\n2755cc - Diesel -Automatic\nPKR "+fortuner);
					
					System.out.println("Enter Tenure bt Year");
					int ten2 =sc.nextInt();
					System.out.println("Enter Downpayment");
					int down2=sc.nextInt();
					double interest2=0.05;
					double monthly_installment2=(fortuner*interest2*(Math.pow(1+interest2, ten2*12))/(Math.pow(1+interest2, (ten2*12)-1)));
					System.out.println("Monthly Installment="+monthly_installment2);
					
					break;
                                case 0:
                                    System.exit(0);
                                
				}break;
		}
	}
    
}
