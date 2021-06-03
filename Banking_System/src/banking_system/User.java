
package banking_system;

import java.util.Scanner;

public class User {
private String name;
 public String getname() {
 return name;
 }
 public void setName(String name) {
 this.name = name;
 }
 public User(String name){
 this.name = name;
 }
 public void sendMessage(String message){
 pop_up.showinquiry(this,message);
 }

}