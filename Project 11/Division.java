/**
 * Activity 11 class that deals with exceptions and catches.
 * author Ryan Litwin
 * version 11/18/19
 */
public class Division {
   
   /**
    * @param num as an int
    * @param den as an int
    * @return an int
    */
   public static int intDivide(int num, int den) {
      try {
         return num / den;
      }
      catch (ArithmeticException e) {
         return 0;
      }
   }
   
   /**
    * @param num as an int
    * @param den as an int
    * @return a double
    */
   public static double decimalDivide(int num, int den) {
      if (den == 0) {
         throw new IllegalArgumentException("The denominator "
               + "cannot be zero.");
      }
      else {
         return (double) num / den;
      }
   }
}