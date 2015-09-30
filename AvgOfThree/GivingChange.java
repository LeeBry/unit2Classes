import java.util.Scanner;
public class GivingChange
{
    public static void main (String[] args)
    {
        Scanner change = new Scanner(System.in);
        int amount;
        int customer_pay;
        int total;
        System.out.println("How many pennies are needed to pay: ");
        amount= change.nextInt();
        System.out.println("How many pennies was given to the cashier: ");
        customer_pay= change.nextInt();
        total= customer_pay-amount;
        int dollars= total/100;
        System.out.println("You get "+dollars+" dollars");
        total-=dollars*100;
        int quarters= total/25;
        System.out.println("You get "+quarters+" quarters");
        total-=quarters*25;
        int dimes= total/10;
        System.out.println("You get "+dimes+" dimes");
        total-=dimes*10;
        int nickles= total/5;
        System.out.println("You get "+nickles+" nickles");
        System.out.println("and "+total+" pennies back");
        
    }
}