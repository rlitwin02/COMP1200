import java.text.DecimalFormat;

/**
*Uses the interaction menu to get data about user information.
*Author Ryan Litwin
*Version 09/16/2019
*/

public class IceCreamCone {

   // instance variables
   private String label;
   private double radius, height;
   
   //constructor
   /**
    *@param labelIn for label in the program.
    *@param radiusIn for double value of radius
    *@param heightIn for double value of height
    */
   
   public IceCreamCone(String labelIn, double radiusIn, double heightIn) {
      setLabel(labelIn);
      setRadius(radiusIn);
      setHeight(heightIn);
   }
   
   //methods
   
   /**
    * @return a string
    */
   public String getLabel() {
      return label;
   }
   
   /**
    * @return a boolean
    * @param labelIn for the label in the program
    *
    */
   public boolean setLabel(String labelIn) {
      
      boolean isNull = true;
      if (labelIn == null) {
         isNull = false;
      }
      else {
         label = labelIn.trim();
      }
      return isNull;
   }
   /**
    * @return a double
    */
   
   public double getRadius() {
      return radius;
   }
   /**
    * @return a boolean
    * @param radiusIn for the radius in the program
    */
   
   public boolean setRadius(double radiusIn) {
      if (radiusIn > 0) {
         radius = radiusIn;
         return true;
      }
      else {
         return false;
      }
   }
   /**
    * @return a double
    */
      
   public double getHeight() {
      return height;
   }
   /**
    * @return a boolean
    * @param heightIn for the height in the program
    */
   
   public boolean setHeight(double heightIn) {
      if (heightIn > 0) {
         height = heightIn;
         return true;
      }
      else {
         return false;
      }
   }
   /**
    * @return a double
    */
   public double surfaceArea() {
      double cA = Math.PI * radius * Math.sqrt(
         +(Math.pow(height, 2) + Math.pow(radius, 2)));
      double hA = 2 * Math.PI * Math.pow(radius, 2);
      double sfarea = cA + hA;
      return sfarea;
   }
   /**
    * @return a double
    */
   public double volume() {
      double cV = height * Math.PI * Math.pow(radius, 2) / 3;
      double hV = 2 * Math.PI * Math.pow(radius, 3) / 3;
      double varea = cV + hV;
      return varea;
   }
   /**
    * @return a string
    */
   public String toString() {
      DecimalFormat df = new DecimalFormat("#,##0.0######");
      return "IceCreamCone \"" + label + "\" with radius = " 
         + df.format(radius) + " and "
         + "height = " + df.format(height) + " units has: "
         + "\n\tsurface area = " + df.format(surfaceArea()) + " square units"
         + "\n\tvolume = " + df.format(volume()) + " cubic units";
   }
}