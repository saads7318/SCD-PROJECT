/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking_system;

/**
 *
 * @author H.p
 */

    public final class Details {
    final String User_Name;
	final String Account_Number;
	

public Details  (String User_Name, String Account_Number) {
	this.User_Name = User_Name;
	this.Account_Number = Account_Number;
}
public String getUser_Name() {
	return User_Name;
}
public String getAccount_Number() {
	return Account_Number;
}
    
    }
