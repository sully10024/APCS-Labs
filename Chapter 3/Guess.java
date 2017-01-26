//your code is tough to follow. You don't need to tell the user you will truncate.
//don't extend your lines further than the delimiter line in your header
//12/12

// *************************************************************************************
//      Author: Clay Sullivan (10-30-14)
//      
//      Guess.java
//
//      Play a game where the user guesses a number from 1 to 10
//
// **************************************************************************************
import java.util.Random;
import java.util.Scanner;

public class Guess
{
    public static void main(String[] args)
    {
        int computerSelection;
        int userGuess = 100;        //has to be any number outside the range of generation by the computer, or the code won't work
        int numberOfGuesses = 0;
        int numberGreater = 0;
        int numberLower = 0;
        boolean validGuess = true;
        
        Scanner scan = new Scanner (System.in);
        Random generator = new Random();
        
        computerSelection = generator.nextInt(9) + 1;//generates between 1 and 9
        
        System.out.println("Enter an integer number between 1 and 10. All non-integers will be truncated to the ones place.");
       
        // Uncomment the below line for testing the program, or for cheating.
        //System.out.println("\nYou must be cheating, or you must be testing my code: " + computerSelection);
        
        while(userGuess != computerSelection && validGuess == true)
        {
            userGuess = (int)scan.nextDouble();
            
            // sets the "validGuess" boolean to true or false depending on the range of valid guesses (1 - 10 inclusive)
            if (1 <= userGuess && userGuess <= 10)
            {
                validGuess = true;
            }
            else
            {
                validGuess = false;
            }        
            
            numberOfGuesses++;    // counts how many guesses you have made
            
            if (userGuess > computerSelection && validGuess == true)
            {
               numberGreater++;
               System.out.println("\nToo high. Try again.");
            }
            
            if (userGuess < computerSelection && validGuess == true)
            {
                numberLower++;
                System.out.println("\nToo low. Try again.");
            }
        }
        
        // error management
        if (validGuess == false)
        {
            System.out.println("\nInvalid Guess. Must be a number between 1 and 10. Your computer will now self-destruct.");
        }
         // this happens when you got the right answer
        else
        {
            System.out.println("\nCorrect!!\n");
            System.out.println("Your last guess: " + userGuess);
            System.out.println("Total Guesses: " + numberOfGuesses);
            System.out.println("Guesses greater than the right choice: " + numberGreater);
            System.out.println("Guesses less than the right choice: " + numberLower);
            System.out.println("Guesses equal to the right choice: 1");     // this is obvious and doesn't need to be calculated
        }
    }
}