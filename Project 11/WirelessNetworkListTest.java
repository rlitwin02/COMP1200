import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.io.FileNotFoundException;

/**
 * tests that prove the method WirelessNetworkList.
 * author Ryan Litwin
 * version 11/19/2019
 */
public class WirelessNetworkListTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   
   /**
    * a test that adds a wireless network object.
    * @throws FileNotFoundException in test.
    */
   @Test public void addWirelessNetworkTest() throws FileNotFoundException {
      WirelessNetworkList obj = new WirelessNetworkList();
      obj.readFile("wireless_network_data1.csv");
      WirelessNetwork obj2 = new WiFi("My WiFi", 10, 30, 20);
      obj.addWirelessNetwork(obj2);
      Assert.assertEquals(obj.getWirelessNetworksArray().length, 3, 10);
   }
   
   /**
    * tests the addInvalidRecordArray method.
    * @throws FileNotFoundException in the test
    */
    
   @Test public void addInvalidRecordTest() throws FileNotFoundException {
      WirelessNetworkList obj = new WirelessNetworkList();
      obj.readFile("wireless_network_data1.csv");
      String[] a = new String[0];
      a = obj.getInvalidRecordsArray();
      Assert.assertEquals(obj.getInvalidRecordsArray().length, 3, 10);
   }
   /**
    * a test that gets a wireless network array.
    * @throws FileNotFoundException in program
    */
   @Test public void getWirelessNetworksArrayTest() 
      throws FileNotFoundException {
      WirelessNetworkList obj = new WirelessNetworkList();
      WirelessNetwork[] obj2 = obj.getWirelessNetworksArray();
      Assert.assertArrayEquals(obj2, obj.getWirelessNetworksArray());  
   }
   
   /**
    * a test that gets an invalid record array.
    */
   @Test public void getInvalidRecordsArrayTest() {
      WirelessNetworkList obj = new WirelessNetworkList();
      obj.addInvalidRecord("invalid");
      String[] in = obj.getInvalidRecordsArray();
      Assert.assertEquals("invalid", in[0]);
   }
   
   /**
    * a test that reads the file.
    * @throws FileNotFoundException in program
    */
   @Test public void   readFileTest() throws FileNotFoundException {
      WirelessNetworkList obj = new WirelessNetworkList();
      obj.readFile("wireless_network_data1.csv");
      obj.generateReport();
      obj.generateReportByName();
      obj.generateReportByBandwidth();
      obj.generateReportByMonthlyCost();
   } 
   
   /**
    * a test that generates a report and prints the wireless network objects.
    * @throws FileNotFoundException in test.
    */
   @Test public void generateReportTest() throws FileNotFoundException {
      WirelessNetworkList obj = new WirelessNetworkList();
      obj.readFile("wireless_network_data1.csv");
      Assert.assertEquals("report test", 
         true, obj.generateReport().contains("WiFi"));
     
   }
   
   /**
    * a test that shows the generateReport by name method works.
    * @throws FileNotFoundException in the test
    */
   @Test public void generateReportByNameTest() throws FileNotFoundException {
      WirelessNetworkList obj = new WirelessNetworkList();
      obj.readFile("wireless_network_data1.csv");
      Assert.assertEquals("report by name test", 
         true, obj.generateReportByName().contains("WiFi"));
   }
   
   /**
    * a test that shows the generateReport by bandwidth method works.
    * @throws FileNotFoundException in the test
    */
   @Test public void generateReportByBandwidthTest() 
      throws FileNotFoundException {
      WirelessNetworkList obj = new WirelessNetworkList();
      obj.readFile("wireless_network_data1.csv");
      Assert.assertEquals("report by bandwidth test", 
         true, obj.generateReportByBandwidth().contains("WiFi"));
   }
   
   /**
    * a test that shows the generateReport by monthly cost method works.
    * @throws FileNotFoundException in the test
    */
   @Test public void generateReportByMonthlyCostTest() 
      throws FileNotFoundException {
      WirelessNetworkList obj = new WirelessNetworkList();
      obj.readFile("wireless_network_data1.csv");
      Assert.assertEquals("report by monthly cost test", 
         true, obj.generateReportByMonthlyCost().contains("WiFi"));
   }


   
   

}
