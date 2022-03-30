import java.util.ArrayList;
import java.text.DecimalFormat;

/**
 *Uses ArrayList to create a list of objects in the program.
 *Author Ryan Litwin
 *Version 09/16/2019
 */
public class IceCreamConeList {

   private ArrayList<IceCreamCone> iceList;
   private String listName;
            
   /**
    * @param listNameIn as a string.
    * @param iceListIn as an ArrayList.
    */
   
   public IceCreamConeList(String listNameIn, ArrayList<IceCreamCone>iceListIn)
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
      return iceList.size();
   
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