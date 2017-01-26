//12/12
// *********************************
//      REVISIT THIS ONE
// *********************************

import java.util.Scanner;

public class ArrayReverse
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner (System.in);
        int[] reverseMe;
        
        int numEntries;
        
        System.out.print("How many numbers would you like to enter? ");
        numEntries = (int)scan.nextDouble();
        reverseMe = new int[numEntries];
        int temp;
        
        System.out.println("Now enter the numbers that you would like to switch on one line: ");
        System.out.println("(when you are done, press [return].");
        for (int i = 0; i < numEntries; i++)
        {
            reverseMe[i] = (int)scan.nextDouble();
        }
        
        for (int i = 0; i < numEntries/2; i++)
        {
            temp = reverseMe[i];
            reverseMe[i] = reverseMe[(numEntries-1)-i];
            reverseMe[(numEntries-1)-i] = temp;
        }
        
        for (int i = 0; i < numEntries; i++)
        {
            System.out.print(reverseMe[i] + " ");
        }
    }
}