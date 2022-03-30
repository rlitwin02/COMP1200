
/**
 * a program that works with customers and
 * their balance, location, and name.
 * author Ryan Litwin
 * version 10-28-19
 */
public class Customer implements Comparable<Customer> {
   //instance variables
   private String name;
   private String location;
   private double balance;
   
   
   /**
    * @param nameIn as a string
    */
   public Customer(String nameIn) {
      name = nameIn;
      location = "";
      balance = 0;
   }
   
   /**
    * @param locationIn as a string
    */
   public void setLocation(String locationIn) {
      location = locationIn;
   }
   
   /**
    * @param city as a string
    * @param state as a string
    */
   public void setLocation(String city, String state) {
      location = city + ", " + state;
   }
   
   /**
    * @param amount as a double
    */
   public void changeBalance(double amount) {
      balance += amount;
   }
   
   /**
    * @return a string
    */
   public String getLocation() {
      return location;
   }
   
   /**
    * @return a double
    */
   public double getBalance() {
      return balance;
   }
   
   /**
    * @param obj as a Customer
    * @return an int
    */
   public int compareTo(Customer obj) {
      if (Math.abs(this.balance - obj.getBalance()) < 0.000001) {
         return 0;
      }
      else if (this.balance < obj.getBalance()) {
         return -1;
      }
      else {
         return 1; 
      }
   }
   
   /**
    * @return a string
    */
   public String toString() {
      return name + "\n" + location + "\n$" + balance;
   }
   
   
}  