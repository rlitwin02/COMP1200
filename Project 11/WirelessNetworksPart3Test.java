//import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.io.FileNotFoundException;

/**
 * test method for the driver class for project 11.
 * author Ryan Litwin
 * version 11/28/19
 */
public class WirelessNetworksPart3Test {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   
   /**
    * test method for no command line.
    * @throws FileNotFoundException in test.
    */
   @Test public void noCommandLineArgumentTest() throws FileNotFoundException {
      String[] args1 = {};
      WirelessNetworksPart3.main(args1);
   }
   
   /**
    * test method for the main method.
    * @throws FileNotFoundException in test.
    */
   @Test public void mainMethodTest() throws FileNotFoundException {
      WirelessNetworksPart3 app = new WirelessNetworksPart3();
      String[] args2 = {"wireless_network_data2.exceptions.csv"};
      WirelessNetworksPart3.main(args2);
   }
   
   /**
    * test method for file not found.
    * @throws FileNotFoundException in test.
    */
   @Test public void fileNotFoundTest() throws FileNotFoundException {
      WirelessNetworksPart3 app = new WirelessNetworksPart3();
      String[] args3 = {"nofile.csv"};
      WirelessNetworksPart3.main(args3);
   }


}
