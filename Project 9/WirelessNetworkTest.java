import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class WirelessNetworkTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   
   @Test public void getName() {
      WirelessNetwork item1 = new WirelessNetwork("My WiFi", 400.00, 40.00, 1000.00, 5.00);
      Assert.assertEquals("My WiFi", item1.getName());
   }


   /** A test that always fails. **/
   @Test public void defaultTest() {
      Assert.assertEquals("Default test added by jGRASP. Delete "
            + "this test once you have added your own.", 0, 1);
   }
}
