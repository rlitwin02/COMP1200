import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * runs tests for the BandwidthComparator in project 10.
 * author Ryan Litwin
 * version 11/20/2019
 */
public class BandwidthComparatorTest {
   
   private BandwidthComparator test = new BandwidthComparator();


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   
   /**
    * a test that shows negative result.
    */
   @Test public void negativeTest() {
      Cellular c = new Cellular("My Note", 5, 20, 1200, .75);
      LTE l = new LTE("My iPad", 20, 38, 1200, 3);
      
      int value = 0;
      
      if (test.compare(c, l) < 0) {
         value = -1;
      }
      Assert.assertEquals(-1, value);
   }
   
   /**
    * a test that shows positive result.
    */
   @Test public void positiveTest() {
      Cellular c = new Cellular("My Note", 5, 20, 1200, .75);
      LTE l = new LTE("My iPad", 20, 38, 1200, 3);
      
      int value = 0;
      
      if (test.compare(l, c) > 0) {
         value = 1;
      }
      Assert.assertEquals(1, value);
   }
   
   /**
    * a test that shows equal result.
    */
   @Test public void equalsTest() {
      Cellular c = new Cellular("My Note", 5, 20, 1200, .75);
      LTE l = new LTE("My iPad", 5, 20, 1200, .75);
      Assert.assertEquals(0, test.compare(c, l));
   }
      


}
