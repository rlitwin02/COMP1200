import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * runs a test for the LTE class.
 * author Ryan Litwin
 * version 11/7/19
 */
public class LTETest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   
   /**
    * runs a test for the monthlyCost test.
    */
   @Test public void monthlyCostTest() {
      LTE item1 = new LTE("My iPad", 20.00, 38.00, 1000.00, 5.00);
      Assert.assertEquals(38.0, item1.monthlyCost(), 0.01);
      
      LTE item2 = new LTE("My iPad", 20.00, 38.00, 1200.00, 2.00);
      Assert.assertEquals(46, item2.monthlyCost(), 0.01);
    
   }
   
   
}
