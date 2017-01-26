//12/12
// ===========================
//      Author: Clay Sullivan
//      Stats.java
// ===========================

import java.util.Scanner;
import java.text.DecimalFormat;

public class Stats
{
    public static void main (String[] args)
    {
        boolean repeat = true;
        int numOuts, numWalks, numHits, numSacrificeFlys;
        double average;
       
        while(repeat == true)
        {
            Scanner scan1 = new Scanner(System.in);
            
            System.out.print("\nEnter statistics in shorthand (everything will be converted to lower case, including the name): ");
            Scanner scan2 = new Scanner(scan1.nextLine().toLowerCase());
            scan2.useDelimiter(",");

            String name = scan2.next();
            System.out.println(name);
            numOuts = 0;
            numWalks = 0;
            numHits = 0;
            numSacrificeFlys = 0;
            average = 0;
            while(scan2.hasNext())
            {
                String atBat = scan2.next();
                if(atBat.equals("h"))
                {
                    numHits++;
                }
                else if(atBat.equals("w"))
                {
                    numWalks++;
                }
                else if(atBat.equals("o"))
                {
                    numOuts++;
                }
                else
                {
                    numSacrificeFlys++;
                }
                average = 100 * (double)numHits/(numHits + numOuts);
            }
            System.out.println ("Hits: " + numHits);
            System.out.println ("Outs: " + numOuts);
            System.out.println ("Walks: " + numWalks);
            System.out.println ("Sacrifice Flys: " + numSacrificeFlys);
            System.out.println ("Batting Average: " + average);
        
            Scanner scanAgain = new Scanner(System.in);
            System.out.print ("\nMore statistics to enter? [y/n]: ");
            
            if(scanAgain.nextLine().toUpperCase().charAt(0) == 'Y')
            {
                repeat = true;
            }
            else
            {
                repeat = false;
            }
        }
    }
}