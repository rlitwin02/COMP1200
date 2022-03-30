import java.io.FileNotFoundException;

/**
 * the driver class for project 11.
 * author Ryan Litwin
 * version 11/28/19
 */
public class WirelessNetworksPart3 {
   
   /**
    * the main method that includes the output.
    * @param args not used.
    */
   public static void main(String[] args) {
      
      WirelessNetworkList obj = new WirelessNetworkList();
      
      if (args.length == 0) {
         System.out.println("File name expected as command line argument.\n"
            + "Program ending.");
      }
      
      
      else {
         try {
            obj.readFile(args[0]);
            System.out.print(obj.generateReport() 
               + obj.generateReportByName()
               + obj.generateReportByBandwidth() 
               + obj.generateReportByMonthlyCost()
               + obj.generateInvalidRecordsReport());
         }
      
         catch (FileNotFoundException e) {
            System.out.println("*** Attempted to read file: " + args[0]
               + " (No such file or directory)");
         }
      }
      
      
      
      
      
   }
}