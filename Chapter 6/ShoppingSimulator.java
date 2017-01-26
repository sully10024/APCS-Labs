import java.util.Scanner;

public class ShoppingSimulator
{
    public static void main (String[] args)
    {
        boolean continueShopping = true;
        double pricePerUnit;
        int numUnits;
        
        // Creates two Scanner objects, because of a bug that exists
        //  in the Scanner class that would cause errors in this program
        //  if we used the same Scanner object.
        Scanner numScan = new Scanner (System.in);
        Scanner stringScan = new Scanner (System.in);
        ShoppingCart myCart = new ShoppingCart();
        String name;
        
        while (continueShopping == true)
        {
            System.out.print("Item Name: ");
            name = stringScan.nextLine();
            System.out.print("Item Price-per-Unit: $");
            pricePerUnit = numScan.nextDouble();
            System.out.print("Number of Units: ");
            numUnits = (int)numScan.nextDouble();
            
            myCart.addToCart(name, pricePerUnit, numUnits);
            System.out.println(myCart);
            
            System.out.print("Would you like add another Item? [Y/n]... ");
            if (stringScan.nextLine().equalsIgnoreCase("y"))
            {
                continueShopping = true;    // this isn't entirely necessary, but it helps to make sense
            }
            else
            {
                continueShopping = false;
                System.out.println("Please pay: $" + myCart.getTotalPrice());
            }
        }
    }
}