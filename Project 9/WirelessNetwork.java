import java.text.DecimalFormat;
/**
 * an abstract class for WirelessNetwork.
 * author Ryan Litwin
 * version 11/5/19
 */
public abstract class WirelessNetwork {
   protected String name = "";
   protected double bandwidth = 0;
   protected double mcost = 0;
   protected static int count = 0;

   
   /**
    * @param nameIn as a string
    * @param bandwidthIn as a double
    * @param mcostIn as a double
    */
   public WirelessNetwork(String nameIn, double bandwidthIn, double mcostIn) {
      name = nameIn;
      bandwidth = bandwidthIn;
      mcost = mcostIn;
      count++;
   }
   
   /**
    * @return name as a string
    */
   public String getName() {
      return name;
   }
   
   /**
    * @param nameIn as a string
    */
   public void setName(String nameIn) {
      name = nameIn;
   }
   
   /**
    * @return bandwidth as a double
    */
   public double getBandwidth() {
      return bandwidth;
   }
   
   /**
    * @param bandwidthIn as a double
    */
   public void setBandwidth(double bandwidthIn) {
      bandwidth = bandwidthIn;
   }
   
   /**
    * @return mcost as a double
    */
   public double getMonthlyFixedCost() {
      return mcost;
   }
   
   /**
    * @param mcostIn as a double
    */
   public void setMonthlyFixedCost(double mcostIn) {
      mcost = mcostIn;
      
   }
   
   /**
    * @return count as an int
    */
   public static int getCount() {
      return count;
   }
   
   /**
   * a method that resets the count.
   */
   public static void resetCount() {
      count = 0;
   }
   
   /**
    * @return a string
    */
   public String toString() {
      DecimalFormat df = new DecimalFormat("#,##0.00");
      return name + " (" + this.getClass() + ") " 
         + "Cost: $" + df.format(monthlyCost())
         + "\nBandwidth: " + bandwidth + " Mbps";
   }
   
   /**
    * @return abstract
    */
   public abstract double monthlyCost();
    
}