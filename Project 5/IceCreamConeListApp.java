import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
/**
*Uses the ListApp to run the program.
*Author Ryan Litwin
*Version 09/16/2019
*/

public class IceCreamConeListApp {

   /**
    * @param args Command line arguments (not used).
    * @throws FileNotFoundException if a problem occurs.
    */
   public static void main(String[] args) throws FileNotFoundException {
     
     
      ArrayList<IceCreamCone> iceList = new ArrayList<IceCreamCone>();
      String iceListName = "";
      String label = "";
      
      double radius = 0;
      double height = 0;
      
      
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter file name: ");
      
      
      String fileName = scan.nextLine();
      System.out.print("\n");
      Scanner scanFile = new Scanner(new File(fileName));
      
      iceListName = scanFile.nextLine();
      
      while (scanFile.hasNext()) {
         label = scanFile.nextLine();
         radius = Double.parseDouble(scanFile.nextLine());
         height = Double.parseDouble(scanFile.nextLine());
         
         IceCreamCone myObj = new IceCreamCone(label, radius, height);
         iceList.add(myObj);
      }
      
      IceCreamConeList myIceCreamConeList = new IceCreamConeList(
         iceListName, iceList);
      
      
      
      System.out.println(myIceCreamConeList.toString());
      
      
      System.out.println("\n" + myIceCreamConeList.summaryInfo());
   }
}