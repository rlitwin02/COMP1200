import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * running test cases on monthlycostcomparator.
 * author Ryan Litwin
 * version 11/20/19
 */
public class MonthlyCostComparatorTest {
   
   private MonthlyCostComparator test = new MonthlyCostComparator();


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   
   /**
    * runs test for negative comparative value.
    */
   @Test public void negativeTest() {
      Cellular c = new Cellular("My Note", 20, 5, 1200, .75);
      FiveG f = new FiveG("My Phone", 80, 80, 1200, 12);
      
      int value = 0;
      
      if (test.compare(f, c) < 0) {
         value = -1;
      }
      
      Assert.assertEquals(-1, value);
   }
   /**
    * runs test for a positive comparative value.
    */
   @Test public void positiveTest() {
      Cellular c = new Cellular("My Note", 20, 5, 1200, .75);
      LTE l = new LTE("My iPad", 38, 5, 1200, 3);
      
      int value = 0;
      
      if (test.compare(c, l) > 0) {
         value = 1;
      }
      
      Assert.assertEquals(1, value);
   }
   
   /**
    * runs test for equal comparative value.
    */
   @Test public void equalTest() {
      Cellular c = new Cellular("My Note", 10, 5, 1200, .75);
      Cellular c2 = new Cellular("My New Note", 10, 5, 1200, .75);
      Assert.assertEquals(0, test.compare(c, c2));
   }


}
