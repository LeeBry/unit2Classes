import java.util.Scanner;

public class NoComma
{
   public static void main (String[] args)
   {
       Scanner s = new Scanner(System.in);
       String  userString;

      System.out.print ("Enter a number 1,000 through 999,999: ");
      userString = s.next();
      String comma= userString;
      int index=comma.indexOf(",");

      int Tlength= comma.length();

      System.out.println(userString.substring(0,index)+userString.substring(index+1,Tlength));
      System.out.println(userString.substring(0,index)+userString.substring(index,Tlength));
      
   }
}
