/**
 * second class in the program and extends
 * WirelessNetwork.
 * author Ryan Litwin
 * version 11-6-19
 */
public class WiFi extends WirelessNetwork {
   private double modemCost;
   
   /**
    * @param nameIn as a string
    * @param bandwidthIn as a double
    * @param mcostIn as a double
    * @param modemCostIn as a double
    */
   public WiFi(String nameIn, double bandwidthIn, 
      double mcostIn, double modemCostIn) {
      super(nameIn, bandwidthIn, mcostIn);
      modemCost = modemCostIn;
      
   }
   
   /**
    * @return a double
    */
   public double getModemCost() {
      return modemCost;
   }
   
   /**
    * @param modemCostIn as a double
    */
   public void setModemCost(double modemCostIn) {
      modemCost = modemCostIn;
   }
   
   /**
    * @return a double
    */
   public double monthlyCost() {
      return mcost + modemCost;
   }


}