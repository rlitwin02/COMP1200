import java.text.DecimalFormat;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *Uses an Array to create a list of objects in the program.
 *Author Ryan Litwin
 *Version 10/16/2019
 */
public class IceCreamConeList2 {

   private IceCreamCone[] iceList;
   private String listName;
   private int iceCreamConeObj;
            
   /**
    * @param listNameIn as a string.
    * @param iceListIn as an Array.
    * @param length as an int.
    */
   
   public IceCreamConeList2(String listNameIn, IceCreamCone[] 
      iceListIn, int length)
   {
   
      listName = listNameIn;
      iceList = iceListIn;
      iceCreamConeObj = length;
   }
      
  /**
   * @return a string
   */
   public String getName() {
      return listName;
   
   
   
   }
   /**
    * @return an int
    */
   public int numberOfIceCreamCones() {
      return iceCreamConeObj;
   
   }
   /**
    *@return a double
    */
   public double totalSurfaceArea() {
      double totalsa = 0;
      
      int index = 0;
      while (index < iceCreamConeObj) {
         totalsa += iceList[index].surfaceArea();
         index++;
      } 
      
      return totalsa;  
   }
   /**
    * @return a double
    */
   public double totalVolume() {
      double totalv = 0;
      
      int index = 0;
      while (index < iceCreamConeObj) {
         totalv += iceList[index].volume();
         index++;
      }
      
      return totalv;
   
   }
   /**
    * @return a double
    */
   public double averageSurfaceArea() {
      if (iceCreamConeObj != 0) {
         return totalSurfaceArea() / iceCreamConeObj;
      }
      else {
         return 0;
      }
      
   
   }
   /**
    * @return a double.
    */
   public double averageVolume() {
      if (iceCreamConeObj != 0) {
         return totalVolume() / iceCreamConeObj;
      }
      else {
         return 0;
      }
   }
   /**
    * @return Array as getList
    */
   public IceCreamCone[] getList() {
      return iceList;
   }
   
   /**
    * @return a String.
    * @param fileNameIn as a string.
    * @throws FileNotFoundException in the program
    */
   public IceCreamConeList2 readFile(String fileNameIn) 
      throws FileNotFoundException {
      Scanner scan = new Scanner(new File(fileNameIn));
      IceCreamCone[] myList = new IceCreamCone[100];
      int iceCreamConeObjR = 0;
      
      listName = scan.nextLine();
      while (scan.hasNext()) {
         String label = scan.nextLine();
         double radius = Double.parseDouble(scan.nextLine());
         double height = Double.parseDouble(scan.nextLine());
         IceCreamCone iceObject = new IceCreamCone(label, radius, height);
         myList[iceCreamConeObjR] = iceObject;
         iceCreamConeObjR++;
      }
      IceCreamConeList2 iL = new IceCreamConeList2(listName, myList, 
         iceCreamConeObjR);
      return iL;
   }
         
   /**
    * @param label as a string
    * @param radius as a double
    * @param height as a double
    */
   public void addIceCreamCone(String label, double radius, double height) {
      IceCreamCone i = new IceCreamCone(label, radius, height);
      iceList[iceCreamConeObj] = i;
      iceCreamConeObj++;
   }
   /**
    * @param label as a string
    * @return a string
    */
   public IceCreamCone findIceCreamCone(String label) {
      IceCreamCone result = null;
      for (IceCreamCone i : iceList) {
         if (i == null) { break; }
         if (i.getLabel().equalsIgnoreCase(label)) {
            result = i;
            break;
         }
      }
      return result;
   }
   /**
    * @param label as a string
    * @return a string
    */
   public IceCreamCone deleteIceCreamCone(String label) {
      String deleteLabel = label.trim().toUpperCase();
      IceCreamCone scanObj;
      IceCreamCone obj = null;
      boolean result = false;
      String labelObj;
      String trimmed;
      int v = 0;
      int remove = -1;
      
      for (v = 0; v < iceCreamConeObj; v++) {
         scanObj = iceList[v];
         labelObj = scanObj.getLabel();
         trimmed = labelObj.trim().toUpperCase();
         if (trimmed.equals(deleteLabel)) {
            obj = iceList[v];
            for (int s = v; s < iceCreamConeObj - 1; s++) {
               iceList[s] = iceList[s + 1];
            }
            iceList[iceCreamConeObj - 1] = null;
            iceCreamConeObj--;
            result = true;
            break;
         
         }
      }
      
      return obj;
      
   }
   /**
    * @param label as a label input
    * @param radius as a radius input
    * @param height as a height input
    * @return true if edited
    */
   public boolean editIceCreamCone(String label, double radius, double height) {
      boolean result = false;
      for (IceCreamCone iList : iceList) {
         if (iList == null) { break; }
         if (iList.getLabel().equalsIgnoreCase(label)) {
            iList.setRadius(radius);
            iList.setHeight(height);
            result = true;
            break;
         }
         
         
      }
      return result;
   }

   /**
    * @return a string
    */
   public String toString() {
      String result = listName + "\n";
      int index = 0;
      while (index < iceCreamConeObj) {
         result += "\n" + iceList[index] + "\n";
         index++;
      }
      return result;
   
   }
   /**
    * @return a string
    */
   public String summaryInfo() {
      String result = ""; 
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      result += "----- Summary for " + getName() + " -----";
      result += "\nNumber of IceCreamCone Objects: " + numberOfIceCreamCones();
      result += "\nTotal Surface Area: " + df.format(totalSurfaceArea());
      result += "\nTotal Volume: " + df.format(totalVolume());
      result += "\nAverage Surface Area: " + df.format(averageSurfaceArea());
      result += "\nAverage Volume: " + df.format(averageVolume());
      
      return result;
      
   }
  
   
        
   
}