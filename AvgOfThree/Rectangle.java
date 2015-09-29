import java.util.Scanner;

public class Rectangle
{
   public static void main (String[] args)
   {
       Scanner s = new Scanner(System.in);
       double length, width;

      System.out.print ("Enter the length: ");
      length = s.nextDouble();

      System.out.print ("Enter the width: ");
      width = s.nextDouble();

      // compute the average of the three numbers

      double area= length*width;
      double dia= Math.sqrt(length*length + width*width);
      
      
      System.out.println ("The average of this rectangle is: "+area+"\n"+
      "The diagonal of the rectangle is: "+dia );
   }
}
