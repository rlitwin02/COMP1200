import java.util.Scanner;
/**
 *A program that does a math equation.
 * author Ryan Litwin
 * version 9/4/2019
 */
public class Formula {
/**
 *The Class that contains the title of the program.
 *@param args Command line arguments (not used).
 */

   public static void main(String[] args) {
      Scanner userInput  =  new Scanner(System.in);
      double x = 0;
      double y = 0;
      double z = 0;
      double result = 0;
      
      System.out.println("result = (3x + 10.5) (2y + 7.5) (z + 5.5) / xyz");
      
      System.out.print("\tEnter x: ");
      x = userInput.nextDouble();  
      
      System.out.print("\tEnter y: ");
      y = userInput.nextDouble();
      
      System.out.print("\tEnter z: ");
      z = userInput.nextDouble();
      
      
      if (x == 0 || y == 0 || z == 0) {
         result = 0;
      }
      else {
         result = (3 * x + 10.5) * (2 * y + 7.5) * (z + 5.5) / (x * y * z);
      }
      
      System.out.print("result = " + result);
   }
}
