// **********************************************************************************************
//   RollingDice.java
//   Author: Clay Sullivan (10-02-14)
//   Summary: Simulates the rolling of a pair of 6-sided dice, printing the result
// **********************************************************************************************

import java.util.Random;

public class RollingDice
{
    public static void main(String[] args)
    {
        int dieOne;    // creates a die (dieOne)
        int dieTwo;    // creates another die (dieTwo)
        int diceTotal;    // the eventual sum of the dice, after they are "rolled" (dieSum)
        
        // simulates the rolling of the dice (returns int values in range 1-6 inclusive)
        System.out.println("Rolling...");
        Random random = new Random();
        dieOne = random.nextInt(6) + 1;
        dieTwo = random.nextInt(6) + 1;
        
        // sets the value of diceTotal to the sum of the values of dieOne and dieTwo
        diceTotal = dieOne + dieTwo;
        
        // print the result of the "roll" (the individual values and the total of the two)
        System.out.println("\nRoll Summary:");
        System.out.println("Die #2: " + dieOne);
        System.out.println("Die #1: " + dieTwo);
        System.out.println("Total: " + diceTotal);
    }
}