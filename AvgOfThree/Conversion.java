import java.util.Scanner;

public class Conversion
{
   public static void main (String[] args)
   {
       Scanner s = new Scanner(System.in);
       double choice;

      System.out.print ("Enter the number of meters that you want converted: ");
      choice = s.nextDouble();
      
      System.out.println("Meters to miles: "+choice/1609.34);
      System.out.println("Meters to feet: "+choice*3.28084);
      System.out.println("Meters to inches: "+choice*39.3701);
      




   }
}
