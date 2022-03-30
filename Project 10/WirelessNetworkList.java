import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
//import java.util.Comparator;

/**
 * a class that has values in project 10.
 * author Ryan Litwin
 * version 11/19/2019
 */
public class WirelessNetworkList {
   private WirelessNetwork[] wirelessList;
   private String[] invalidRecords;
   
   /**
    * the constructor for the project.
    */
   public WirelessNetworkList() {
      wirelessList = new WirelessNetwork[0];
      invalidRecords = new String[0];
   }
   
   /**
    * gets a wirelessnetwork array.
    * @return wirelessList as an array.
    */
   public WirelessNetwork[] getWirelessNetworksArray() {
      return wirelessList;
   }
   
   /**
    * gets an invalidrecords array.
    * @return invalidrecords as an array.
    */
   public String[] getInvalidRecordsArray() {
      return invalidRecords;
   }
   
   /**
    * @param wirelessListIn for a WirelessNetwork array.
    */
   public void addWirelessNetwork(WirelessNetwork wirelessListIn) {
      wirelessList = Arrays.copyOf(wirelessList, wirelessList.length + 1);
      wirelessList[wirelessList.length - 1] = wirelessListIn;
   }
   
   /**
    * @param invalidRecordsIn as a string.
    */
   public void addInvalidRecord(String invalidRecordsIn) {
      invalidRecords = Arrays.copyOf(invalidRecords, invalidRecords.length + 1);
      invalidRecords[invalidRecords.length - 1] = invalidRecordsIn;
   }
   
   /**
    * @param fileNameIn as a string
    * @throws FileNotFoundException in this method.
    */
   public void readFile(String fileNameIn) throws FileNotFoundException {
      Scanner scanFile = new Scanner(new File(fileNameIn));
      String line = null;
      
      while (scanFile.hasNextLine()) {
         line = scanFile.nextLine();
         Scanner thisLine = new Scanner(line);
         thisLine = thisLine.useDelimiter(",");
         
         char category = thisLine.next().charAt(0);
         
         String nameIn = "";
         double bandwidthIn, mcostIn, modemCostIn, timeIn, dLimitIn;
         try {
            switch (category) {
               case 'W':
                  nameIn = thisLine.next().trim();
                  bandwidthIn = Double.parseDouble(thisLine.next());
                  mcostIn = Double.parseDouble(thisLine.next());
                  modemCostIn = Double.parseDouble(thisLine.next());
                  WiFi wifiObj = new WiFi(nameIn, bandwidthIn, 
                     mcostIn, modemCostIn);
               
                  addWirelessNetwork(wifiObj);
                  break;
               case 'C':
                  nameIn = thisLine.next().trim();
                  bandwidthIn = Double.parseDouble(thisLine.next());
                  mcostIn = Double.parseDouble(thisLine.next());
                  timeIn = Double.parseDouble(thisLine.next());
                  dLimitIn = Double.parseDouble(thisLine.next());

                  Cellular cellularObj = new Cellular(nameIn, bandwidthIn, 
                     mcostIn, timeIn, dLimitIn);
                  addWirelessNetwork(cellularObj);
                  break;
               case 'L':
                  nameIn = thisLine.next().trim();
                  bandwidthIn = Double.parseDouble(thisLine.next().trim());
                  mcostIn = Double.parseDouble(thisLine.next().trim());
                  timeIn = Double.parseDouble(thisLine.next().trim());
                  dLimitIn = Double.parseDouble(thisLine.next().trim());
                  LTE lteObj = new LTE(nameIn, bandwidthIn, 
                     mcostIn, timeIn, dLimitIn);
                  addWirelessNetwork(lteObj);
                  break;
               case 'F':
                  nameIn = thisLine.next().trim();
                  bandwidthIn = Double.parseDouble(thisLine.next().trim());
                  mcostIn = Double.parseDouble(thisLine.next().trim());
                  timeIn = Double.parseDouble(thisLine.next().trim());
                  dLimitIn = Double.parseDouble(thisLine.next().trim());
                  FiveG fivegObj = new FiveG(nameIn, bandwidthIn, 
                     mcostIn, timeIn, dLimitIn);
                  addWirelessNetwork(fivegObj);
                  break;
               default:
                  break;
               
               
               
               
            }
           
         }
      
         catch (InvalidCategoryException e) {
            String result = e + " in: " + line;
         
            invalidRecords.add(result);
         }
      
         catch (NumberFormatException e) {
            if (thisLine.hasNext()) {
               thisLine.nextLine();
            }
            String result = e + " in: " + line;
            invalidRecords.add(result);
         }
      }
     
     
      
      
      
   }
   
   /**
    * generates a report to show the monthly network report.
    * @return a result and report.
    */
   public String generateReport() {
      WirelessNetwork[] wn1 = Arrays.copyOf(wirelessList, 
         wirelessList.length + 1);
      String report = "";
      String result = "-------------------------------\n"
         + "Monthly Wireless Network Report\n"
         + "-------------------------------\n";

      for (WirelessNetwork wn : wirelessList) {
         report += wn.toString() + "\n\n";
         
         
      }
      
      
      return result + report;
         
   }
   
   /**
    * generate the report but sorted by name.
    * @return a result and report.
    */
   public String generateReportByName() {
      String report = "";
      Arrays.sort(getWirelessNetworksArray());
      String result = "-----------------------------------------\n"
         + "Monthly Wireless Network Report (by Name)\n"
         + "-----------------------------------------\n"; 
      
      for (WirelessNetwork wn : wirelessList) {
         report += wn.toString() + "\n\n";
         
      }
      
      
      return result + report;

   }
   
   /**
    * generates a report sorted by bandwidth.
    * @return a result and report.
    */
   public String generateReportByBandwidth() {
      String report = "";
      Arrays.sort(getWirelessNetworksArray(), new BandwidthComparator());
      String result = "----------------------------------------------\n"
         + "Monthly Wireless Network Report (by Bandwidth)\n"
         + "----------------------------------------------\n";
         
      for (WirelessNetwork wn : wirelessList) {
         report += wn.toString() + "\n\n";
         
      }
      
      
      return result + report;
   }
   
   /**
    * generates a report sorted by the monthly cost.
    * @return a result and report.
    */
   public String generateReportByMonthlyCost() {
      String report = "";
      Arrays.sort(getWirelessNetworksArray(), new MonthlyCostComparator());
      String result = "-------------------------------------------------\n"
         + "Monthly Wireless Network Report (by Monthly Cost)\n"
         + "-------------------------------------------------\n";
      
      for (WirelessNetwork wn : wirelessList) {
         report += wn.toString() + "\n\n";
         
      }
      
      
      return result + report;   
   }
   
            
         
   
}
