public class WirelessNetworksPart1 {

   public static void main(String[] args) {
   
   WiFi item1 = new WiFi("My Wifi", 450, 45.00, 5.00);
   System.out.println(item1 + "\n");
   
   Cellular item2 = new Cellular("My Note", 5.0, 20.00, 1200.0, 1.0);
   System.out.println(item2 + "\n");
   
   LTE item3 = new LTE("My iPad", 20.0, 102.00, 1200.0, 2.0);
   System.out.println(item3 + "\n");
   
   FiveG item4 = new FiveG("My Phone", 80.0, 80.00, 1200.0, 10.0);
   System.out.println(item4);
   }
   
   
}