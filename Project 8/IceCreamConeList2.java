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
      label = label.toUpperCase();
      IceCreamCone result = null;
      
      for (int i = 0; i < iceCreamConeObj; i++) {
         String iLabel = iceList[i].getLabel();
         iLabel = iLabel.toUpperCase();
         if (iLabel.equals(label)) {
            result = iceList[i];
            break;
         }
      }
      
      if (iceCreamConeObj == 0) {
         result = null;
      }
      return result;
   }
     
   
   /**
    * @param label as a string
    * @return a string
    */
   public IceCreamCone deleteIceCreamCone(String label) {
      IceCreamCone obj = null;
      label = label.toUpperCase();
      
      for (int i = 0; i < iceCreamConeObj; i++) {
         String tempLabel = iceList[i].getLabel().toUpperCase();
         if (tempLabel.equals(label)) {
            obj = iceList[i];
            for (int j = i; j < iceCreamConeObj - 1; j++) {
               iceList[j] = iceList[j + 1];
            }
            
            iceList[iceCreamConeObj - 1] = null;
            iceCreamConeObj--;
         }
      }
      
      return obj;
     
      /**
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
      **/
      
   }
   /**
    * @param label as a label input
    * @param radius as a radius input
    * @param height as a height input
    * @return true if edited
    */
   public boolean editIceCreamCone(String label, double radius, double height) {
      IceCreamCone coneIceCream = findIceCreamCone(label);
      
      if (coneIceCream != null) {
         coneIceCream.setRadius(radius);
         coneIceCream.setHeight(height);
         return true;
      }
      else {
         return false;
      }
      
         
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
   
   /**
    * finds the icecreamcone with the shortest radius.
    * @return IceCreamCone in program.
    */
   public IceCreamCone findIceCreamConeWithShortestRadius() {
      if (iceCreamConeObj > 0) {
         double shortestRadius = iceList[0].getRadius();
         int index = -1;
         for (int i = 0; i < iceCreamConeObj; i++) {
            if (iceList[i].getRadius() <= shortestRadius) {
               shortestRadius = iceList[i].getRadius();
               index = i;
            }
         }
         return iceList[index];
      }
      else {
         return null;
      }
   }
   /**
    * finds the icecreamcone with the longest radius.
    * @return IceCreamCone in program.
    */
   public IceCreamCone findIceCreamConeWithLongestRadius() {
      if (iceCreamConeObj > 0) {
         double longestRadius = 0;
         int index = 0;
         for (int i = 0; i < iceCreamConeObj; i++) {
            if (iceList[i].getRadius() > longestRadius) {
               longestRadius = iceList[i].getRadius();
               index = i;
            }
         }
         return iceList[index];
      }
      else {
         return null;
      }
        
   }
   /**
    * finds the icecreamcone with the smallest volume.
    * @return IceCreamCone in program.
    */
   public IceCreamCone findIceCreamConeWithSmallestVolume() {
      if (iceCreamConeObj > 0) {
         double smallestVolume = iceList[0].volume();
         int index = -1;
         for (int i = 0; i < iceCreamConeObj; i++) {
            if (iceList[i].volume() <= smallestVolume) {
               smallestVolume = iceList[i].volume();
               index = i;
            }
         }
         return iceList[index];
      }
      else {
         return null;
      }
   }
   /**
    * finds the icecreamcone with the largest volume.
    * @return IceCreamCone in program.
    */
   public IceCreamCone findIceCreamConeWithLargestVolume() {
      if (iceCreamConeObj > 0) {
         double largestVolume = 0;
         int index = 0;
         for (int i = 0; i < iceCreamConeObj; i++) {
            if (iceList[i].volume() > largestVolume) {
               largestVolume = iceList[i].volume();
               index = i;
            }
         }
         return iceList[index];
      }
      else {
         return null;
      }
   }
  
   
        
   
}