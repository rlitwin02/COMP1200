import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * running tests to prove the wifi class works.
 * author Ryan Litwin
 * version 11/7/19
 */
public class WiFiTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   
   /**
    * tests the getModelCost() method.
    */
   @Test public void getModemCostTest() {
      WiFi item1 = new WiFi("My Wifi", 450.00, 45.00, 5.00);
      Assert.assertEquals(5.00, item1.getModemCost(), .001);
   }
   
   /**
    * tests the setModemCost() method.
    */
   @Test public void setModemCostTest() {
      WiFi item1 = new WiFi("My Wifi", 450.00, 45.00, 5.00);
      item1.setModemCost(1.00);
      Assert.assertEquals(1.00, item1.getModemCost(), .001);
   }
   
   /**
    * tests the monthlyCost() method.
    */
   @Test public void monthlyCostTest() {
      WiFi item1 = new WiFi("My Wifi", 450.00, 45.00, 5.00);
      Assert.assertEquals(50.0, item1.monthlyCost(), .001);
   }
   /**
    * test that gets the name.
    */
   @Test public void getNameTest() {
      WiFi item1 = new WiFi("My WiFi", 400.00, 40.00, 1000.0);
      Assert.assertEquals("My WiFi", item1.getName());
   }
   /**
    * test that sets the name.
    */
   @Test public void setNameTest() {
      WiFi item1 = new WiFi("My WiFi", 400.00, 40.00, 1000.0);
      item1.setName("Not My WiFi");
      Assert.assertEquals("Not My WiFi", item1.getName());
   }
   /**
    * tests getting the bandwidth.
    */
   @Test public void getBandwidthTest() {
      WiFi item1 = new WiFi("My WiFi", 400.00, 40.00, 1000.0);
      Assert.assertEquals(400.00, item1.getBandwidth(), .001);
   }
   
   /**
    * tests setting the bandwidth.
    */
   @Test public void setBandwidthTest() {
      WiFi item1 = new WiFi("My WiFi", 400.00, 40.00, 1000.0);
      item1.setBandwidth(200.00);
      Assert.assertEquals(200.00, item1.getBandwidth(), .001);
   }
   
   /**
    * tests getting the monthly fixed cost.
    */
   @Test public void getMonthlyFixedCost() {
      WiFi item1 = new WiFi("My WiFi", 400.00, 40.00, 1000.0);
      Assert.assertEquals(40.00, item1.getMonthlyFixedCost(), .001);
   }
   
   /**
    * tests setting the monthly fixed cost.
    */
   @Test public void setMonthlyFixedCost() {
      WiFi item1 = new WiFi("My WiFi", 400.00, 40.00, 1000.0);
      item1.setMonthlyFixedCost(30.00);
      Assert.assertEquals(30.00, item1.getMonthlyFixedCost(), .001);
   }
   
   /**
    * tests to get the count data.
    */
   @Test public void getCount() {
      WiFi.resetCount();
      WiFi item1 = new WiFi("My WiFi", 400.00, 40.00, 1000.0);
      Assert.assertEquals(1, item1.getCount());
   }
   /**
    * tests to reset the count.
    */
   @Test public void resetCount() {
      WiFi item1 = new WiFi("My WiFi", 400.00, 40.00, 1000.0);
      item1.resetCount();
      Assert.assertEquals(0, item1.getCount());
   }
   
   /**
    * tests the toString method.
    */
   @Test public void toStringTest() {
      WiFi item1 = new WiFi("My WiFi", 400.00, 40.00, 1000.0);
      Assert.assertEquals("My WiFi (class WiFi) Cost: $1,040.00"
         + "\nBandwidth: 400.0 Mbps", item1.toString());
   }
      

      
}
