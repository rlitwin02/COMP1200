/**
 * the exception for invalid category in project 11.
 * author Ryan Litwin
 * version 11/28/19
 */
public class InvalidCategoryException extends Exception {
   
   /**
    * the method that makes invalid category exception work.
    * @param categoryIn as a string.
    */
   public InvalidCategoryException(String categoryIn) {
      super("For category: " + categoryIn);
   }
}