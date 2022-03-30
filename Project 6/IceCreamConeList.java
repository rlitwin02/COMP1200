import java.util.ArrayList;
import java.text.DecimalFormat;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *Uses ArrayList to create a list of objects in the program.
 *Author Ryan Litwin
 *Version 09/16/2019
 */
public class IceCreamConeList2 {

   private ArrayList<IceCreamCone> iceList;
   private String listName;
            
   /**
    * @param listNameIn as a string.
    * @param iceListIn as an ArrayList.
    */
   
   public IceCreamConeList2(String listNameIn, ArrayList<IceCreamCone2>iceListIn)
   {
   
      listName = listNameIn;
      iceList = iceListIn;
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
      return iceList();
   
   }
   /**
    *@return a double
    */
   public double totalSurfaceArea() {
      double totalsa = 0;
      
      int index = 0;
      while (index < iceList.size()) {
         totalsa += iceList.get(index).surfaceArea();
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
      while (index < iceList.size()) {
         totalv += iceList.get(index).volume();
         index++;
      }
      
      return totalv;
   
   }
   /**
    * @return a double
    */
   public double averageSurfaceArea() {
      if (iceList.size() != 0) {
         return totalSurfaceArea() / iceList.size();
      }
      else {
         return 0;
      }
      
   
   }
   /**
    * @return a double.
    */
   public double averageVolume() {
      if (iceList.size() != 0) {
         return totalVolume() / iceList.size();
      }
      else {
         return 0;
      }
   }
   /**
    * @return ArrayList as getList
    */
   public ArrayList<IceCreamCone> getList() {
      return iceList;
   }
   
   /**
    * @return a String.
    * @param fileNameIn as a string.
    * @throws FileNotFoundException in the program
    */
   public IceCreamConeList readFile(String fileNameIn) 
      throws FileNotFoundException {
      Scanner scanFile = new Scanner(new File(fileNameIn));
      ArrayList<IceCreamCone> myList = new ArrayList<IceCreamCone>();
      listName = scanFile.nextLine();
      while (scanFile.hasNext()) {
         String label = scanFile.nextLine();
         double radius = Double.parseDouble(scanFile.nextLine());
         double height = Double.parseDouble(scanFile.nextLine());
         IceCreamCone i = new IceCreamCone(label, radius, height);
         myList.add(i);
      }
      IceCreamConeList iL = new IceCreamConeList(listName, myList);
      return iL;
   }
         
   /**
    * @param label as a string
    * @param radius as a double
    * @param height as a double
    */
   public void addIceCreamCone(String label, double radius, double height) {
      IceCreamCone i = new IceCreamCone(label, radius, height);
      iceList.add(i);
   }
   /**
    * @param label as a string
    * @return a string
    */
   public IceCreamCone findIceCreamCone(String label) {
      for (IceCreamCone i : iceList) {
         if (i.getLabel().equalsIgnoreCase(label)) {
            return i;
         }
      }
      return null;
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
      
      for (v = 0; v < iceList.size(); v++) {
         scanObj = iceList.get(v);
         labelObj = scanObj.getLabel();
         trimmed = labelObj.trim().toUpperCase();
         if (trimmed.equals(deleteLabel)) {
            obj = iceList.get(v);
            remove = iceList.indexOf(iceList.get(v));
            result = true;
            break;
         }
         else {
            result = false;
         }
      }
      if (result) {
         iceList.remove(remove);
         return obj;
      }
      else {
         return null;
      }
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
         if (iList.getLabel().equalsIgnoreCase(label)) {
            iList.setRadius(radius);
            iList.setHeight(height);
            result = true;
            break;
         }
         else {
            result = false;
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
      while (index < iceList.size()) {
         result += "\n" + iceList.get(index) + "\n";
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