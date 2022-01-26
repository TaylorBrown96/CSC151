/*
    Fix this program
    Taylor J. Brown
    25JAN22
*/
package bugged_01;
import java.util.Scanner;
public class Bugged_01
{
   public static void main(String[] args)
   {
      final double GUEST_PRICE = 35.00;
      double price;
      int guests;
      Scanner input = new Scanner(System.in);
      System.out.print("Enter number of guests >> ");
      guests = input.nextInt();
      System.out.println("***************************************************");
      System.out.println("*                                                 *");
      System.out.println("*  Jim's food makes the party great.              *");
      System.out.println("*                                                 *");
      System.out.println("***************************************************");
      price = guests * GUEST_PRICE;
      System.out.println("The price for an event with " + guests +
         " guests at $" + GUEST_PRICE + " per guest is $" + price);
   }
}