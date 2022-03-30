import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * tests methods for FiveG.
 * author Ryan Litwin
 * version 11/7/19
 */
public class FiveGTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /**
    * tests the monthly cost for FiveG.
    */
   @Test public void monthlyCostTest() {
      FiveG item1 = new FiveG("My Phone", 80.00, 80.00, 1200.00, 10.00);
      Assert.assertEquals(110.0, item1.monthlyCost(), 0.01);
      
      FiveG item2 = new FiveG("My Phone", 80.00, 80.00, 900.00, 15.00);
      Assert.assertEquals(80.0, item2.monthlyCost(), 0.01);
     
   }
}
