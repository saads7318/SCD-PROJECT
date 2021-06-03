
package banking_system;
public class BillingFactory {
    public Billing getBilling(String BillingType){
 if(BillingType == null){
 return null; }
 if(BillingType.equalsIgnoreCase("E_Bill")){
 return new E_Bill();
 } else if(BillingType.equalsIgnoreCase("Gas_Bill")){
 return new Gas_Bill();
 } 
 return null; }
}
