import java.util.Scanner;

public class Annuity
{
   public static void main(String[] args)
   {
      Scanner s = new Scanner(System.in);
      double numInterest, numYears,numPMT;
      System.out.print ("Enter the periodic payment: ");
      numPMT = s.nextDouble();
      System.out.print ("Enter the periodic interest or compound rate(.1-.9): ");
      numInterest = s.nextDouble();
      System.out.print ("Enter the number of payments: ");
      numYears = s.nextDouble();
      double another =Math.pow(1+numInterest,(numYears-1))-1; 
      double another1= another/numInterest;
      double another2= another1/Math.pow(1+numInterest,(numYears-1));
      double numPVann = numPMT*(another2+1);
     
      
      System.out.println("The present value of annuity is: $"+numPVann);
   }
}
