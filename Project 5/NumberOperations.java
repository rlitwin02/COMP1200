/**
 * Shows number operations for a program plugging in numbers.
 * author Ryan Litwin 
 * version 9/30/2019
 */

public class NumberOperations {
   private int number;
   
   /**
    * @param numberIn for the number integer in the problem
    */
   public NumberOperations(int numberIn) {
   
      number = numberIn;
   
   }
   
  /**
   * @return an int
   */
   public int getValue()
   {
      return number;
   }
   
  /**
   * @return a string
   */
   public String oddsUnder()
   {
      String output = "";
      int i = 0;
      while (i < number) {
         if (i % 2 != 0) {
            output += i + "\t";
         }
         i++;
      }
      return output;
   }
   /**
    * @return a string
    */
   public String powersTwoUnder()
   {
      String output = "";
      int powers = 1;
      while (powers < number) {
         output += powers + "\t"; // concatenate to output
         powers = powers * 2; // get next power of 2
      }
      return output;
   }
   
   /**
    * @return an int
    * @param compareNumber for int value of compared number
    */
   public int isGreater(int compareNumber)
   {
      if (number > compareNumber) {
         return 1;
      }
      else if (number < compareNumber) {
         return -1;
      }
      else {
         return 0;
      }
   
   }
   
   /**
    * @return a string
    */
   public String toString()
   {
      return number + "";
   }
}