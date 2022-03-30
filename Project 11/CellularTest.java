import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * tests cases for cellular class.
 * author Ryan Litwin
 * version 11/7/19
 */
public class CellularTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   
   /**
    * runs a test that gets the time.
    */
   @Test public void getTimeTest() {
      Cellular item1 = new Cellular("My Note", 450.00, 45.00, 1200.00, 2.00);
      Assert.assertEquals("", 1200.00, item1.getTime(), 0.01);
   }
   
   /**
    * runs a test that sets the time.
    */
   @Test public void setTimeTest() {
      Cellular item1 = new Cellular("My Note", 450.00, 45.00, 1200.00, 2.00);
      item1.setTime(300.00);
      Assert.assertEquals(300.00, item1.getTime(), 0.01);
   }
   
   /**
    * runs a test that gets the data limit.
    */
   @Test public void getDataLimitTest() {
      Cellular item1 = new Cellular("My Note", 450.00, 45.00, 1200.00, 2.00);
      Assert.assertEquals(2.00, item1.getDataLimit(), 0.01);
   }
   
   /**
    * runs a test that sets the data limit.
    */
   @Test public void setDataLimitTest() {
      Cellular item1 = new Cellular("My Note", 450.00, 45.00, 1200.00, 2.00);
      item1.setDataLimit(10.00);
      Assert.assertEquals(10.00, item1.getDataLimit(), 0.01);
   }
   
   /**
    * a test that runs the data usage method.
    */
   @Test public void dataUsageTest() {
      Cellular item1 = new Cellular("My Note", 450.00, 45.00, 900.00, 10.00);
      Assert.assertEquals(50.625, item1.dataUsage(), 0.01);
   }
   
   /**
    * checks the monthlyCost method.
    */
   @Test public void monthlyCostTest() {
      Cellular item1 = new Cellular("My Note", 400.00, 40.00, 1000.00, 5.00);
      Assert.assertEquals(85.0, item1.monthlyCost(), 0.01);
      
      Cellular item2 = new Cellular("My Note", 5.00, 40.00, 1000.00, 10.00);
      Assert.assertEquals(40.00, item2.monthlyCost(), 0.01);
   }
   
   /**
    * runs a test with the string method.
    */
   @Test public void toStringTest() {
      Cellular item1 = new Cellular("My Note", 450.00, 45.00, 1200.00, 2.00);
      Assert.assertEquals("My Note (class Cellular) Cost: $110.50"
         + "\nBandwidth: 450.0 Mbps"
         + "\nTime: 1200.0 seconds"
         + "\nData Limit: 2.0 GB"
         + "\nData Used: 67.5 GB", item1.toString());
   }
}
