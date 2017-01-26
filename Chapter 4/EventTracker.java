//who are you? see me for a solution to your error
//10/12
//***********************************************************************
//  BoosterEventTracker.java
//  Monitors two booster events
//***********************************************************************

import java.util.Scanner;

public class EventTracker
{
    public static void main (String[] args)
    {
        int inputBoxesSold = 0;
        String inputName;
        Scanner scan = new Scanner (System.in);
        // --------------------------------------------------------
        //  setting up the information for booster1
        // --------------------------------------------------------
       
        System.out.println("Enter name of first booster:");
        inputName = scan.nextLine();
        
        BandBooster booster1 = new BandBooster (inputName);
        
        System.out.print("\nEnter the number of boxes sold by "
            + inputName + " this week: ");  //inputName should be grabing the name from booster1  

        inputBoxesSold = (int) scan.nextDouble();
        booster1.updateSales(inputBoxesSold);
        
        System.out.println();
        
        
        // --------------------------------------------------------
        //  setting up the information for booster2
        //  (For some reason, there's a bug that I can't
        //      work out currently. I could figure it out
        //      if I had time, but I don't have time.)
        // --------------------------------------------------------
        System.out.println("Enter name of second booster:");
        inputName = scan.nextLine();
        
        BandBooster booster2 = new BandBooster (inputName);
        
        System.out.print("\nEnter the number of boxes sold by "
            + inputName + " this week: ");
        inputBoxesSold = (int)scan.nextDouble();
        booster2.updateSales(inputBoxesSold);
        
        // --------------------------------------------------------
        //  printing information for both boosters
        // --------------------------------------------------------
        System.out.println();
        System.out.println(booster1.getName() + "'s booster:\n"
            + booster1.toString());
        
        System.out.println();
        
        System.out.println(booster2.getName() + "'s booster:\n"
            + booster2.toString());
    }
}