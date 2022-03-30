/**
 * ItemsList class for activity 10.
 * author Ryan Litwin
 * version 11/11/19
 */
public class ItemsList {
   private InventoryItem[] inventory;
   private int count;
   
   /**
    * sets the constructor for the class.
    */
   public ItemsList() {
      inventory = new InventoryItem[20];
      count = 0;
   }
   
   /**
    * @param itemIn as an InventoryItem
    */
   public void addItem(InventoryItem itemIn) {
      inventory[count] = itemIn;
      count++;
   }
   
   /**
    * @param electronicsSurcharge as a double
    * @return total after if statement.
    */
   public double calculateTotal(double electronicsSurcharge) {
      double total = 0;
      for (int i = 0; i < count; i++) {
         if (inventory[i] instanceof ElectronicsItem) {
            total += inventory[i].calculateCost() + electronicsSurcharge;
         }
         else {
            total += inventory[i].calculateCost();
         }
         
      }
      return total;
   }
   
   /**
    * @return output after the for loop
    */
   public String toString() {
      String output = "All inventory:\n\n";
      
      for (int i = 0; i < count; i++) {
         output += inventory[i] + "\n";
      }
      
      
      return output;
   }
}