
package banking_system;

import java.util.Scanner;

public class Phone_no {
    
   public String phone_no;

Phone_no(String phone_no) 
{
	this.phone_no = phone_no;
}
 
public String getName() 
{
	return phone_no;
}
public void setName(String phone_no) 
{
        Scanner sc=new Scanner(System.in);
    
         phone_no = sc.nextLine();
   
	
	this.phone_no = phone_no;
}

}
