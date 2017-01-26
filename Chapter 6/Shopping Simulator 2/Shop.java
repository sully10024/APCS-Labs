//10/12
// ***************************************************************
//   Shop.java
//
//   Uses the Item class to create items and add them to a shopping
//   cart stored in an ArrayList.
// ***************************************************************

import java.util.ArrayList;
import java.util.Scanner;

public class Shop
{
    public static void main (String[] args)
    {

    Item2 item;
    String itemName;
    double itemPrice, totalCost = 0;
    int quantity;

    Scanner scan = new Scanner(System.in);
    Scanner stringScan = new Scanner(System.in);

    String keepShopping = "y";
    
    ArrayList cart = new ArrayList(0);

    do 
        {
        System.out.print ("Enter the name of the item: "); 
        itemName = stringScan.nextLine();

        System.out.print ("Enter the unit price: $");
        itemPrice = scan.nextDouble();

        System.out.print ("Enter the quantity: ");
        quantity = (int)scan.nextDouble();

        item = new Item2 (itemName, itemPrice, quantity);
        cart.add(item);
        
        // i know i was supposed to use the two methods, but this works too
        totalCost+= (itemPrice*quantity);//too bad, you needed to use those!! 
        //this is an example of something you wouldn't get credit for on the AP
        //because you didn't do exactly what they wanted and went with what
        //you wanted!!! Can't do that.

        System.out.println("NAME\tPRICE\tQUANTITY\tTOTAL");
        for (int i = 0; i < cart.size(); i++)
        {
            System.out.println(cart.get(i));
        }

        System.out.print ("Continue shopping (y/n)? ");
        keepShopping = stringScan.nextLine();
        }
    while (keepShopping.equalsIgnoreCase("y"));

    System.out.println("Total Amount Due:\t$" + totalCost);
    }
}