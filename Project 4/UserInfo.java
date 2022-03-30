/**
 *Uses the interaction menu to get data about user information.
 *Author Ryan Litwin
 *Version 09/16/2019
 */
public class UserInfo {

  
   // instance variables
   private String firstName;
   private String lastName;
   private String location;
   private int age;
   private int status;
   private static final int OFFLINE = 0, ONLINE = 1;
   
   // constructor
   /**
   * @param firstNameln for the user's name
   * @param lastNameln for the user's name
   */
   public UserInfo(String firstNameln, String lastNameln) {
   /**
    *
    *describes the variables used in first part of gathering data.
    */
      firstName = firstNameln;
      lastName = lastNameln;
      location = "Not specified";
      age = 0;
      status = OFFLINE;
   }
   // methods
   /**
   * @return a string
   */
   public String toString() {
   /**DecimalFormat df = new DecimalFormat("#,##0.0######");
    *Explains the string output.
    */
      String output = "Name: " + firstName + " "
         + lastName + "\n";
      output += "Location: " + location + "\n";
      output += "Age: " + age + "\n";
      output += "Status: ";
      if (status == OFFLINE) {
         output += "Offline";
      }
      else {
         output += "Online";
      }
      return output;
   
   } 
   /** 
    *@param  locationln for location input.
    */
   public void setLocation(String locationln) {
      location = locationln;
    /**
     *allows user to input their location.
     */  
   }
   /**
    * @return a boolean
    * @param ageln for age input
    */
   public boolean setAge(int ageln) {
      boolean isSet = false;
      if (ageln > 0) {
         age = ageln;
         isSet = true;
      }
      return isSet;
   }
   /**
    * @return an int
    */
   public int getAge() {
      return age;
    /**
     * gets users age from their input
     */
   }
   /**
    * @return an int
    */
   public String getLocation() {
      return location;  
   }
   /** 
    *@ return a void
    */
   public void logOff() {
      status = OFFLINE;
   }
   /** 
    *@ return a void
    */

   public void logOn() {
      status = ONLINE;
   }
  
    
}  
