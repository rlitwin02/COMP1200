import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.io.FileNotFoundException;


/**
 * Running tests on IceCreamConeList2 methods.
 * Author Ryan Litwin
 * Version 10-30-19
 */
public class IceCreamConeList2Test {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /**
    * a test to get the name of the label.
    * @throws FileNotFoundException for the test
    */
   @Test public void getNameTest() throws FileNotFoundException {
      IceCreamCone[] ice = new IceCreamCone[100];
      IceCreamConeList2 list = new IceCreamConeList2("list name", ice, 0);
      list = list.readFile("IceCreamCone_data_1.txt");
      Assert.assertEquals("IceCreamCone Test List", list.getName());
   }
   /**
    *@throws FileNotFoundException in this test.
    *a test to determine the number of IceCreamCones.
    */
   @Test public void numberOfIceCreamConesTest() throws FileNotFoundException {
      IceCreamCone[] ice = new IceCreamCone[100];
      IceCreamConeList2 list = new IceCreamConeList2("", ice, 3);
      list = list.readFile("IceCreamCone_data_1.txt");
      Assert.assertEquals("", 3, list.numberOfIceCreamCones());
      IceCreamConeList2 list2 = new IceCreamConeList2("", ice, 0);
      list2 = list2.readFile("IceCreamCone_data_0.txt");
      Assert.assertEquals("", 0, list2.numberOfIceCreamCones());
   }
    /**
    * a test to get the total surface area.
    * @throws FileNotFoundException for the test
    */
   @Test public void totalSurfaceAreaTest() throws FileNotFoundException {
      IceCreamCone[] ice = new IceCreamCone[100];
      IceCreamConeList2 list = new IceCreamConeList2("", ice, 0);
      list = list.readFile("IceCreamCone_data_1.txt");
      Assert.assertEquals(449905.09745852894, list.totalSurfaceArea(), .0001);
   }
    /**
    * a test to get the total volume.
    * @throws FileNotFoundException for the test
    */
   @Test public void totalVolumeTest() throws FileNotFoundException {
      IceCreamCone[] ice = new IceCreamCone[100];
      IceCreamConeList2 list = new IceCreamConeList2("", ice, 0);
      list = list.readFile("IceCreamCone_data_1.txt");
      Assert.assertEquals("", 1.82951165884855E7, list.totalVolume(), .0001);
   }
    /**
    * a test to get the average surface area.
    * @throws FileNotFoundException for the test
    */
   @Test public void averageSurfaceAreaTest() throws FileNotFoundException {
      IceCreamCone[] ice = new IceCreamCone[100];
      IceCreamConeList2 list = new IceCreamConeList2("", ice, 0);
      list = list.readFile("IceCreamCone_data_1.txt");
      Assert.assertEquals("", 149968.36581950964, list.averageSurfaceArea(), 
         .0001);
      IceCreamCone[] ice2 = new IceCreamCone[100];
      IceCreamConeList2 list2 = new IceCreamConeList2("", ice2, 0);
      list2 = list2.readFile("IceCreamCone_data_0.txt");
      Assert.assertEquals("", 0, list2.averageSurfaceArea(), 0.0001);
      
   }
   
    /**
    * a test to get the average volume.
    * @throws FileNotFoundException for the test
    */
   @Test public void averageVolumeTest() throws FileNotFoundException {
      IceCreamCone[] ice = new IceCreamCone[100];
      IceCreamConeList2 list = new IceCreamConeList2("", ice, 0);
      list = list.readFile("IceCreamCone_data_1.txt");
      Assert.assertEquals("", 6098372.196161834, list.averageVolume(), .0001);
      IceCreamCone[] ice2 = new IceCreamCone[100];
      IceCreamConeList2 list2 = new IceCreamConeList2("", ice2, 0);
      list2 = list2.readFile("IceCreamCone_data_0.txt");
      Assert.assertEquals("", 0, list2.averageVolume(), 0.0001);
   }
   
    /**
    * a test to get the desired list.
    * @throws FileNotFoundException for the test
    */
   @Test public void getListTest() throws FileNotFoundException {
      IceCreamCone[] ice = new IceCreamCone[100];
      ice[1] = new IceCreamCone("one", 3.0, 4.0);
      IceCreamConeList2 list = new IceCreamConeList2("", ice, 0);
      Assert.assertArrayEquals(ice, list.getList());
   }
   
   /**
    * a test that reads the file for the program.
    * @throws FileNotFoundException for the test
    */
   @Test public void readFileTest() throws FileNotFoundException {
      IceCreamCone[] ice = new IceCreamCone[100];
      IceCreamConeList2 list = new IceCreamConeList2("", ice, 0);
      list = list.readFile("IceCreamCone_data_1.txt");
      Assert.assertEquals("IceCreamCone Test List", list.getName());
      
   }
   
   /**
    * @throws FileNotFoundException in test
    * a test that adds an IceCreamCone object.
    */
   @Test public void addIceCreamConeTest() throws FileNotFoundException {
      IceCreamCone[] ice = new IceCreamCone[100];
      ice[1] = new IceCreamCone("one", 5.0, 6.0);
      IceCreamConeList2 list = new IceCreamConeList2("", ice, 0);
      list = list.readFile("IceCreamCone_data_1.txt");
      list.addIceCreamCone("newcone", 7.0, 8.0);
      IceCreamCone[] newList = list.getList();
      Assert.assertEquals(newList[3], list.findIceCreamCone("newcone"));
   }
   
    /**
    * a test to find the ice cream cone label.
    * @throws FileNotFoundException for the test
    */
   @Test public void findIceCreamConeTest() throws FileNotFoundException {
      IceCreamCone[] ice = new IceCreamCone[100];
      IceCreamConeList2 list = new IceCreamConeList2("", ice, 0);
      list = list.readFile("IceCreamCone_data_0.txt");
      Assert.assertEquals(null, list.findIceCreamCone("ex1"));
      IceCreamCone[] ice2 = new IceCreamCone[100];
      IceCreamConeList2 list2 = new IceCreamConeList2("", ice2, 0);
      list2 = list2.readFile("IceCreamCone_data_1.txt");
      IceCreamCone find = list2.findIceCreamCone("Ex 3");
      Assert.assertEquals("Ex 3", find.getLabel());
   }
      
   
    /**
    * a test to delete an icecreamcone object.
    * @throws FileNotFoundException for the test
    */
   @Test public void deleteIceCreamConeTest() throws FileNotFoundException {
      IceCreamCone[] ice = new IceCreamCone[100];
      IceCreamConeList2 list = new IceCreamConeList2("", ice, 0);
      list = list.readFile("IceCreamCone_data_1.txt");
      IceCreamCone[] newList = list.getList();
      Assert.assertEquals(null, list.deleteIceCreamCone("fake"));
      Assert.assertEquals(newList[0], list.deleteIceCreamCone("Ex1"));

      list.deleteIceCreamCone("Ex2");
      Assert.assertEquals(null, list.findIceCreamCone("Ex2"));
      list.deleteIceCreamCone("Ex3");
      Assert.assertEquals(null, list.findIceCreamCone("Ex3"));
   }
   
    /**
    * a test to edit an icecreamcone object.
    * @throws FileNotFoundException for the test
    */
   @Test public void editIceCreamConeTest() throws FileNotFoundException {
      IceCreamCone[] ice = new IceCreamCone[100];
      IceCreamConeList2 list = new IceCreamConeList2("", ice, 0);
      list = list.readFile("IceCreamCone_data_1.txt");
      Assert.assertEquals(true, list.editIceCreamCone("Ex1", 10.0, 11.0));
      Assert.assertEquals(false, list.editIceCreamCone("fake", 3.0, 4.0));
   }
   
    /**
    * a test that returns the printed string in the ice cream code.
    * @throws FileNotFoundException for the test
    */
   @Test public void toStringTest() 
      throws FileNotFoundException {
      IceCreamCone[] ice = new IceCreamCone[100];
      IceCreamConeList2 list = new IceCreamConeList2("", ice, 0);
      list = list.readFile("IceCreamCone_data_1.txt");
      Assert.assertEquals("IceCreamCone Test List"
         + "\n\nIceCreamCone \"Ex1\" with"
         + " radius = 1.0 and height = 2.0 units has: "
	      + "\n\tsurface area = 13.308 square units"
         + "\n\tvolume = 4.1887902 cubic units"
         
         + "\n\nIceCreamCone \"Ex 2\" with radius = 12.3"
         + " and height = 25.5 units has: "
	      + "\n\tsurface area = 2,044.5837657 square units"
	      + "\n\tvolume = 7,937.3689278 cubic units"
         
         + "\n\nIceCreamCone \"Ex 3\" with radius = 123.4 "
         + "and height = 900.0 units has: " 
	      + "\n\tsurface area = 447,847.2056927 square units"
	      + "\n\tvolume = 18,287,175.0307675 cubic units\n", list.toString());
   }
   
    /**
    * a test that returns the summary info for the project.
    * @throws FileNotFoundException for the test
    */
   @Test public void summaryInfoTest() throws FileNotFoundException {
      IceCreamCone[] ice = new IceCreamCone[100];
      IceCreamConeList2 list = new IceCreamConeList2("", ice, 0);
      list = list.readFile("IceCreamCone_data_1.txt");
      Assert.assertEquals("----- Summary for IceCreamCone Test List -----"
         + "\nNumber of IceCreamCone Objects: 3"
         + "\nTotal Surface Area: 449,905.097"
         + "\nTotal Volume: 18,295,116.588"
         + "\nAverage Surface Area: 149,968.366"
         + "\nAverage Volume: 6,098,372.196", list.summaryInfo());
   }
   
    /**
    * a test that returns the icecreamcone object with the shortest radius.
    * @throws FileNotFoundException for the test
    */
   @Test public void findIceCreamConeWithShortestRadius() 
      throws FileNotFoundException {
      IceCreamCone[] ice = new IceCreamCone[100];
      IceCreamConeList2 list = new IceCreamConeList2("", ice, 0);
      list = list.readFile("IceCreamCone_data_1.txt");
      IceCreamCone ice2 = list.findIceCreamConeWithShortestRadius();
      Assert.assertEquals(list.getList()[0], ice2);
      IceCreamCone[] ice3 = new IceCreamCone[100];
      IceCreamConeList2 list3 = new IceCreamConeList2("", ice3, 0);
      list3 = list3.readFile("IceCreamCone_data_0.txt");
      Assert.assertEquals(null, list3.findIceCreamConeWithShortestRadius());
      
   }
   
   /**
    * a test that returns the icecreamcone object with the longest radius.
    * @throws FileNotFoundException for the test
    */
   @Test public void findIceCreamConeWithLongestRadius() 
      throws FileNotFoundException {
      IceCreamCone[] ice = new IceCreamCone[100];
      IceCreamConeList2 list = new IceCreamConeList2("", ice, 0);
      list = list.readFile("IceCreamCone_data_1.txt");
      IceCreamCone ice2 = list.findIceCreamConeWithLongestRadius();
      Assert.assertEquals(list.getList()[2], ice2);
      IceCreamCone[] ice3 = new IceCreamCone[100];
      IceCreamConeList2 list3 = new IceCreamConeList2("", ice3, 0);
      list3 = list3.readFile("IceCreamCone_data_0.txt");
      Assert.assertEquals(null, list3.findIceCreamConeWithLongestRadius());
      IceCreamCone[] ice4 = new IceCreamCone[100];
      ice4[0] = new IceCreamCone("zero", 0, 0);
      IceCreamConeList2 list4 = new IceCreamConeList2("", ice4, 1);
      Assert.assertEquals(ice4[0], list4.findIceCreamConeWithLongestRadius());
      

   }
   /**
    * a test that returns the icecreamcone object with the smallest volume.
    * @throws FileNotFoundException for the test
    */
   @Test public void findIceCreamConeWithSmallestVolume() 
      throws FileNotFoundException {
      IceCreamCone[] ice = new IceCreamCone[100];
      IceCreamConeList2 list = new IceCreamConeList2("", ice, 0);
      list = list.readFile("IceCreamCone_data_1.txt");
      IceCreamCone ice2 = list.findIceCreamConeWithSmallestVolume();
      Assert.assertEquals(list.getList()[0], ice2);
      IceCreamCone[] ice3 = new IceCreamCone[100];
      IceCreamConeList2 list3 = new IceCreamConeList2("", ice3, 0);
      list3 = list3.readFile("IceCreamCone_data_0.txt");
      Assert.assertEquals(null, list3.findIceCreamConeWithSmallestVolume());

   }
   
   /**
    * a test that returns the icecreamcone object with the largest volume.
    * @throws FileNotFoundException for the test
    */
   @Test public void findIceCreamConeWithLargestVolume() 
      throws FileNotFoundException {
      IceCreamCone[] ice = new IceCreamCone[100];
      IceCreamConeList2 list = new IceCreamConeList2("", ice, 0);
      list = list.readFile("IceCreamCone_data_1.txt");
      IceCreamCone ice2 = list.findIceCreamConeWithLargestVolume();
      Assert.assertEquals(list.getList()[2], ice2);
      IceCreamCone[] ice3 = new IceCreamCone[100];
      IceCreamConeList2 list3 = new IceCreamConeList2("", ice3, 0);
      list3 = list3.readFile("IceCreamCone_data_0.txt");
      Assert.assertEquals(null, list3.findIceCreamConeWithLargestVolume());
      IceCreamCone[] ice4 = new IceCreamCone[100];
      ice4[0] = new IceCreamCone("zero", 0, 0);
      IceCreamConeList2 list4 = new IceCreamConeList2("", ice4, 1);
      Assert.assertEquals(ice4[0], list4.findIceCreamConeWithLargestVolume());
      

   }
}
