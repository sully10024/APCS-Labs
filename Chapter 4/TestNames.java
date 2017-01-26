//nice work, but I don't know who you are. 11/12
// **********************************************************************
//  TestNames.java
//  Tests the Name class
// **********************************************************************

import java.util.Scanner;

public class TestNames
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Enter a full name, and press "
            + "'return' after the first, middle, and last names:");
        String first = scan.nextLine();
        String middle = scan.nextLine();
        String last = scan.nextLine();
        Name name1 = new Name (first, middle, last);
        
        System.out.println("\nEnter another full name, and press "
            + "'return' after the first, middle, and last names:");
        first = scan.nextLine();
        middle = scan.nextLine();
        last = scan.nextLine();
        Name name2 = new Name (first, middle, last);
        
        nameTest(name1);
        nameTest(name2);
        
        if (name1.equals(name2))
        {
            System.out.println("\nThese names are the same.");
        }
        else
        {
            System.out.println("\nThese names are not the same.");
        }
    }
    
    public static void nameTest(Name standin)
    {
        System.out.print("\nFirst-Middle-Last: ");
        System.out.println(standin.firstMiddleLast());
        System.out.print("Last-First-Middle: ");
        System.out.println(standin.lastFirstMiddle());
        System.out.print("Initials: ");
        System.out.println(standin.initials());
        System.out.print("Length: ");
        System.out.println(standin.length());
    }
}