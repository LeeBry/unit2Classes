import java.util.Scanner;

public class Conversion
{
   public static void main (String[] args)
   {
       double meters_to_miles=1609.34;
       double meters_to_feet= 3.28084;
       double meters_to_inches=39.3701;
       Scanner s = new Scanner(System.in);
       double choice;

      System.out.print ("Enter the number of meters that you want converted: ");
      choice = s.nextDouble();
      
      System.out.println("Meters to miles: "+choice/meters_to_miles);
      System.out.println("Meters to feet: "+choice*meters_to_feet);
      System.out.println("Meters to inches: "+choice*meters_to_inches);
      




   }
}
