import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

/**
* This program presents a menu and file choices for IceCreamCone to user.
* @author Ryan Litwin
* @version 10/11/2019
*/
public class IceCreamConeListMenuApp {

   /**
    * @param args - not used
    * @throws FileNotFoundException in file
    */
   public static void main(String[] args) throws FileNotFoundException {
   
      String listName = "*** no list name assigned ***";
      ArrayList<IceCreamCone> iceList = new ArrayList<IceCreamCone>();
      IceCreamConeList iceCreamList = new IceCreamConeList(listName, iceList);
      String fileName = "no file Name", userInput = "";
   
      Scanner scanInput = new Scanner(System.in);
   
      System.out.println("IceCreamCone List System Menu\n"
             + "R - Read File and Create IceCreamCone List\n"
             + "P - Print IceCreamCone List\n"
             + "S - Print Summary\n"
             + "A - Add IceCreamCone\n"
             + "D - Delete IceCreamCone\n"
             + "F - Find IceCreamCone\n"
             + "E - Edit IceCreamCone\n"
             + "Q - Quit");
   
      do {
         System.out.print("Enter Code [R, P, S, A, D, F, E, or Q]: ");
      
         String labelIn = "", actualLabel = "";
         double radius = 0, height = 0;
      
      
         userInput = scanInput.nextLine();
         if (userInput.length() == 0) {
            continue;
         }
         userInput = userInput.toUpperCase();
         char userChar = userInput.charAt(0);
         switch (userChar) {
            case 'R':
               System.out.print("\tFile Name: ");
               fileName = scanInput.nextLine();
            
               iceCreamList = iceCreamList.readFile(fileName);
               System.out.println("\tFile read in and IceCreamCone "
                      + "List created\n");
               break;
         
            case 'P':
               System.out.println(iceCreamList.toString());
               break;
         
            case 'S':
               System.out.println("\n" + iceCreamList.summaryInfo() + "\n");
               break;
         
            case 'A':
               System.out.print("\tLabel: ");
               labelIn = scanInput.nextLine();
               System.out.print("\tRadius: ");
               radius = Double.parseDouble(scanInput.nextLine());
               System.out.print("\tHeight: ");
               height = Double.parseDouble(scanInput.nextLine());
            
               iceCreamList.addIceCreamCone(labelIn, radius, height);
            
               System.out.println("\t*** IceCreamCone added ***\n");
               break;
         
            case 'D':
               System.out.print("\tLabel: ");
               labelIn = scanInput.nextLine();
               IceCreamCone ice = iceCreamList.deleteIceCreamCone(labelIn);
               if (ice != null) {
                  actualLabel = ice.getLabel();
                  iceCreamList.deleteIceCreamCone(labelIn);
                  System.out.println("\t\"" + actualLabel + "\" deleted\n");
               } else {
                  System.out.println("\t\"" + labelIn + "\" not found\n");
               }
               break;
         
            case 'F':
               System.out.print("\tLabel: ");
               labelIn = scanInput.nextLine();
               if (iceCreamList.findIceCreamCone(labelIn) != null) {
                  System.out.println(iceCreamList.findIceCreamCone(labelIn)
                     + "\n");
               } else {
                  System.out.println("\t\"" + labelIn + "\" not found\n");
               }
               break;
         
            case 'E':
               System.out.print("\tLabel: ");
               labelIn = scanInput.nextLine();
               System.out.print("\tRadius: ");
               radius = Double.parseDouble(scanInput.nextLine());
               System.out.print("\tHeight: ");
               height = Double.parseDouble(scanInput.nextLine());
               if (iceCreamList.findIceCreamCone(labelIn) != null) {
                  iceCreamList.editIceCreamCone(labelIn, radius, height);
                  System.out.println("\t\"" 
                     + labelIn + "\" successfully edited\n");
               } else {
                  System.out.println("\t\"" + labelIn + "\" not found\n");
               }
               break;
            case 'Q':
               break;
            default:
               System.out.println("\t*** invalid code ***\n");
         }
      } while (!userInput.equalsIgnoreCase("Q"));
   }
}