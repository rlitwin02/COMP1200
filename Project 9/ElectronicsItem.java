/**
 * second part of activity 9.
 * author Ryan Litwin
 * version 11-4-19
 */
public class ElectronicsItem extends InventoryItem {
   protected double weight = 0;
   /**
    * sets up the constant shipping cost.
    */
   public static final double SHIPPING_COST = 1.5;
   
   /**
    * @param nameIn as a string
    * @param priceIn as a double
    * @param weightIn as a double
    */
   public ElectronicsItem(String nameIn, double priceIn, double weightIn) {
      super(nameIn, priceIn);
      weight = weightIn;
   }
   
   /**
    * @return a double
    */
   public double calculateCost() {
      return super.calculateCost() + (SHIPPING_COST * weight);
   }
}