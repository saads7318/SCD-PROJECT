package banking_system;
import java.util.Scanner;

public class LoginInfo {

    private static LoginInfo ms = null;
    
    String username, Password;

    private LoginInfo() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Username");
        username = input.nextLine();
        System.out.println("Enter the Password");
        Password = input.nextLine();
        
        if (username.equalsIgnoreCase("Kanza") && (Password.equalsIgnoreCase("Ahmed"))) {
            System.out.println("Hello Kanza!!");
        } else if (username.equalsIgnoreCase("Saad") && (Password.equalsIgnoreCase("Saeed"))) {
            System.out.println("Hello Saad!!");}
        else if (username.equalsIgnoreCase("Qurtain") && (Password.equalsIgnoreCase("Syed"))) {
            System.out.println("Hello Qurtain!!");}
        else {
            System.out.println("invalid username & password\n           Try Again!!!!");  
           System.exit(0);
}
    }public static LoginInfo getInstance() {

        if (ms == null) {
            ms = new LoginInfo();
        }
        return ms;
    }

}
