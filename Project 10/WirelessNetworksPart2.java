import java.io.FileNotFoundException;


/**
 * the driver class for project 10.
 * author Ryan Litwin
 * version 11/19/2019
 */
public class WirelessNetworksPart2 {
   
   /**
    * the main method that executes the code.
    * @throws FileNotFoundException in program
    * @param args not used
    */
   public static void main(String[] args) throws FileNotFoundException {      
      
      if (args.length == 0) {
         System.out.println("File name expected as command line argument.\n"
            + "Program ending.");
      
         
         
      }
      else {
         WirelessNetworkList obj = new WirelessNetworkList();
         obj.readFile(args[0]);
         System.out.print(obj.generateReport() 
            + obj.generateReportByName()
            + obj.generateReportByBandwidth() 
            + obj.generateReportByMonthlyCost());
         
      }
   }
      
}