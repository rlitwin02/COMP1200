//import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.io.FileNotFoundException;

/**
 * runs tests for the driver part of project 10.
 * author Ryan Litwin
 * version 11/20/19
 */
public class WirelessNetworksPart2Test {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   
   /**
    * test for no command line found.
    * @throws FileNotFoundException in test
    */
   @Test public void noCommandLineArgumentTest() throws FileNotFoundException {
      String[] args1 = {};
      WirelessNetworksPart2.main(args1);
   }

   /**
    * test for command line.
    * @throws FileNotFoundException in project.
    */
   @Test public void mainMethodTest() throws FileNotFoundException {
      WirelessNetworksPart2 app = new WirelessNetworksPart2();
      String[] args2 = {"wireless_network_data1.csv"};
      WirelessNetworksPart2.main(args2);
   }
}
