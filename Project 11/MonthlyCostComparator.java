import java.util.Comparator;

/**
 * a class that sets up a monthly cost comparator for project 10.
 * author Ryan Litwin
 * version 11/19/2019
 */
public class MonthlyCostComparator implements Comparator<WirelessNetwork> {
   
   /**
    * @param n1 as a wirelessnetwork array.
    * @param n2 as a wirelessnetwork array.
    * @return a value.
    */
   public int compare(WirelessNetwork n1, WirelessNetwork n2) {
      if (Math.abs(n1.monthlyCost() - n2.monthlyCost()) < 0.001) {
         return 0;
      }
      else if (n1.monthlyCost() < n2.monthlyCost()) {
         return 1;
      }
      else {
         return -1;
      }
   }
}