import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


/**
 * This tests all of the iceCreamCone methods.
 * Author Ryan Litwin
 * version 10-24-19
 */
public class IceCreamConeTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   
   /**
    * a test that gets the label.
    */
   @Test public void getLabelTest() {
      IceCreamCone ice = new IceCreamCone("iceCreamCone1", 3, 4);
      Assert.assertEquals("iceCreamCone1", ice.getLabel());
   }
   
   /**
    * a test that returns the set label.
    */
   @Test public void setLabelTest() {
      IceCreamCone ice = new IceCreamCone("iceCreamCone1", 3, 4);
      Assert.assertTrue("iceCreamCone1", ice.setLabel("iceCreamCone_1"));
      Assert.assertFalse(" ", ice.setLabel(null));
   }
   
   /**
    * a test that gets the radius.
    */
   @Test public void getRadiusTest() {
      IceCreamCone ice = new IceCreamCone("small radius", 2, 4);
      Assert.assertEquals("small radius", 2, ice.getRadius(), .000001);
   }
   
   /**
    * a test that sets the radius in the program.
    */
   @Test public void setRadiusTest() {
      IceCreamCone ice = new IceCreamCone("small radius", 1, 2);
      Assert.assertTrue(ice.setRadius(1));
      Assert.assertFalse(ice.setRadius(0));
   }
   
   /**
    * a test that gets the height.
    */
   @Test public void getHeightTest() {
      IceCreamCone ice = new IceCreamCone("small height", 1, 2);
      Assert.assertEquals("small height", 2, ice.getHeight(), .000001);
   }
   
   /**
    * a test that sets the height in program.
    */
   @Test public void setHeightTest() {
      IceCreamCone ice = new IceCreamCone("small height", 1, 2);
      Assert.assertTrue(ice.setHeight(1));
      Assert.assertFalse(ice.setHeight(0));
   }
   
   /**
    * a test that calculates the surface area of given numbers.
    */
   @Test public void surfaceAreaTest() {
      IceCreamCone ice = new IceCreamCone("surface area", 2, 3);
      Assert.assertEquals("surface area", 47.7870880269963, 
         ice.surfaceArea(), .0000001);
   }
   
   /**
    * a test that calculates the volume of given numbers.
    */
   @Test public void volumeTest() {
      IceCreamCone ice = new IceCreamCone("volume", 2, 3);
      Assert.assertEquals("volume", 29.321531433504735, ice.volume(), .0000001);
   }
   
   /**
    * a test that runs the string method and makes sure it prints
    * the correct thing.
    */
   @Test public void toStringTest() {
      IceCreamCone ice = new IceCreamCone("small cone", 2, 3);
      Assert.assertEquals("IceCreamCone \"small cone\" with radius = 2.0"
         + " and height = 3.0 units has: "
         + "\n\tsurface area = 47.787088 square units"
         + "\n\tvolume = 29.3215314 cubic units", ice.toString());
   }
    
    /**
    * a test that gets the count of the objects created.
    */
   @Test public void getCountTest() {
      IceCreamCone.resetCount();
      IceCreamCone obj = new IceCreamCone("test", 5, 5);
      IceCreamCone obj2 = new IceCreamCone("test", 5, 5);
      Assert.assertEquals("count", 2, IceCreamCone.getCount());
   }
   
   /**
    * a test that resets the count of objects.
    */
   @Test public void resetCountTest() {
      IceCreamCone.resetCount();
      IceCreamCone ice = new IceCreamCone("Low", 2, 3);
      IceCreamCone.resetCount();
      Assert.assertEquals("none ", 0, IceCreamCone.getCount());
   
   }
    
   /**
    * a test that shows if every list is equal.
    */
   @Test public void equalsTest() {
      IceCreamCone ice = new IceCreamCone("test", 2, 3);
      IceCreamCone ice1 = new IceCreamCone("test", 2, 3);
      Assert.assertEquals("test", true, ice.equals(ice1));
      IceCreamCone ice2 = new IceCreamCone("to false", 2, 3);
      Assert.assertEquals("test", false, ice.equals(ice2));
      IceCreamCone ice3 = new IceCreamCone("to false", 2, 3);
      Assert.assertEquals("test", false, ice.equals(ice3));
      IceCreamCone ice4 = new IceCreamCone("to false", 2, 3);
      Assert.assertEquals("test", false, ice.equals(ice4));
      Assert.assertEquals("false test", false, ice.equals(""));
      Assert.assertEquals("false test", 0, ice.hashCode());
   }
   
   /**
    * a test that shows the equals method is all true.
    */
   @Test public void equalsTest1() {
      IceCreamCone icc = new IceCreamCone("test", 2, 3);
      IceCreamCone icc1 = new IceCreamCone("test", 2, 3);
      Assert.assertTrue(icc.equals(icc1));
      
      
   }
   
   /**
    * a test that shows if the equal method has all true 
    * and one false.
    */
   @Test public void equalsTest2() {
      IceCreamCone icc = new IceCreamCone("test", 2, 3);
      IceCreamCone icc1 = new IceCreamCone("test", 2, 4);
      Assert.assertFalse(icc.equals(icc1));
   }
   
   /**
    * a test that shows if the equal method has one true 
    * and two false.
    */
   @Test public void equalsTest3() {
      IceCreamCone icc = new IceCreamCone("test", 2, 3);
      IceCreamCone icc1 = new IceCreamCone("test", 3, 4);
      Assert.assertFalse(icc.equals(icc1));
      
   }
   
   /**
    * a test that shows if the equal method is all false.
    */
   @Test public void equalsTest4() {
      IceCreamCone icc = new IceCreamCone("test", 2, 3);
      IceCreamCone icc1 = new IceCreamCone("false", 3, 4);
      Assert.assertFalse(icc.equals(icc1));
   }
   /**
    * a test that returns 0 for hashcode.
    */
   @Test public void hashCodeTest() {
      IceCreamCone ice = new IceCreamCone("Low", 2, 3);
      Assert.assertEquals("Low", 0, ice.hashCode());
   }
   


   
   
}
