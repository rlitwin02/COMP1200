import java.util.Scanner;

/**
*Uses the interaction menu to get data about user information.
*Author Ryan Litwin
*Version 09/16/2019
*/

public class IceCreamConeApp {
   /**
    * @param args Command line arguments (not used).
    */

   public static void main(String[] args) {
   
      //IceCreamCone user1 = new IceCreamCone();
      Scanner userInput = new Scanner(System.in);
      System.out.print("Enter label, radius, and height for an "
         + "ice cream cone.");
      System.out.print("\n\tlabel: ");
      String label = userInput.nextLine();
      System.out.print("\tradius: ");
      String radius2 = userInput.nextLine();
      double radius = Double.parseDouble(radius2);
      
      if (radius <= 0) {
         System.out.print("Error: radius must be greater than 0.");
      }
      else {
         System.out.print("\theight: ");
         String height2 = userInput.nextLine();
         double height = Double.parseDouble(height2);
         if (height <= 0) {
            System.out.print("Error: height must be greater than 0.");
         }
         else {
            IceCreamCone myObj = new IceCreamCone(label, radius, height);
            System.out.print("\n" + myObj);
         
         }
         
      }
   }
} 
   