//import java.text.DecimalFormat;
/**
 * a third class in program and extends
 * WirelessNetwork.
 * author Ryan Litwin
 * version 11-6-19
 */
public class Cellular extends WirelessNetwork {
   protected double time;
   protected double dLimit;
   /**
    * sets a cost factor for the program.
    */
   public static final double COST_FACTOR = 1.0;
   
   /**
    * @param nameIn as a string
    * @param bandwidthIn as a double
    * @param mcostIn as a double
    * @param timeIn as a double
    * @param dLimitIn as a double
    */
   public Cellular(String nameIn, double bandwidthIn, double mcostIn, 
      double timeIn, double dLimitIn) {
      super(nameIn, bandwidthIn, mcostIn);
      time = timeIn;
      dLimit = dLimitIn;
   }
   
   /**
    * @return a double
    */
   public double getTime() {
      return time;
   }
   
   /**
    * @param timeIn as a double
    */
   public void setTime(double timeIn) {
      time = timeIn;
   }
   
   /**
    * @return a double
    */
   public double getDataLimit() {
      return dLimit;
   }
   
   /**
    * @param dLimitIn as a double
    */
   public void setDataLimit(double dLimitIn) {
      dLimit = dLimitIn;
   }
   
   /**
    * @return as a double
    */
   public double dataUsage() {
      double dataUsage;
      dataUsage = bandwidth / 8000 * time;
      return dataUsage;
   }
   
   /**
    * @return a double
    */
   public double monthlyCost() {
      if (dataUsage() <= dLimit) {
         return mcost;
      }
      else {
         return mcost + (dataUsage() - dLimit) * Cellular.COST_FACTOR;
      }
   }
   
   /**
    * @return a string
    */
   public String toString() {
      return super.toString() + "\nTime: " + time
         + " seconds" + "\nData Limit: " + dLimit + " GB" + "\nData Used: "
         + dataUsage() + " GB";
   }

}