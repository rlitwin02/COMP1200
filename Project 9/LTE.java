/**
 * a fourth class in my program and it extends
 * Cellular.
 * author Ryan Litwin
 * version 11/6/19
 */
public class LTE extends Cellular {
   /**
    * sets the cost factor.
    */
   public static final double COST_FACTOR = 4.0;
   
   /**
    * @param nameIn as a string
    * @param bandwidthIn as a double
    * @param mcostIn as a double
    * @param timeIn as a double
    * @param dLimitIn as a double
    */
   public LTE(String nameIn, double bandwidthIn, double mcostIn, 
      double timeIn, double dLimitIn) {
      super(nameIn, bandwidthIn, mcostIn, timeIn, dLimitIn);
   }
   
   /**
    * @return a double
    */
   public double monthlyCost() {
      if (dataUsage() <= dLimit) {
         return mcost;
      }
      else {
         return mcost + (dataUsage() - dLimit) * LTE.COST_FACTOR * 2;
      }
   }
}