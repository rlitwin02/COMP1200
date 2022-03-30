/**
 * a program for activity 9 with
 *inventory items.
 * author Ryan Litwin
 *version 11-4-19
 */
public class InventoryItem {
   protected String name = "";
   protected double price;
   private static double taxRate = 0;
   
   
   /**
    * @param nameIn as a string
    * @param priceIn as a double
    */
   public InventoryItem(String nameIn, double priceIn) {
      name = nameIn;
      price = priceIn;
   }
   
   /**
    * @return name as a string
    */
   public String getName() {
      return name;
   }
   
   /**
    * @return as a double
    */
   public double calculateCost() {
      return price * (1 + taxRate);
   }
   /**
    * sets taxRateIn equal to taxRate.
    * @param taxRateIn as a double
    */
   public static void setTaxRate(double taxRateIn) {
      taxRate = taxRateIn;
   }
   
   /**
    * @return as a string
    */
   public String toString() {
      return name + ": $" + calculateCost();
   }
   
}
