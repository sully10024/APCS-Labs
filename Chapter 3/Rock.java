//11/12
//nice thought process!

// ****************************************************************
//   Author: Clay Sullivan
//   Rock.java
//   Play Rock, Paper, Scissors with the user
// ****************************************************************
import java.util.Scanner;
import java.util.Random;

public class Rock
{
    public static void main(String[] args)
    {
        String personPlay;
        String computerPlay;
        int computerInt;
        boolean validMove;
        
        String computerMove;
        String personMove;
        char personCharMove;
    
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
    
        computerInt = random.nextInt(2);//generates number 0-1
        if (computerInt == 0)
        {
            computerPlay = "R";
        }
        else if (computerInt == 1)
        {
            computerPlay = "P";
        }
        else if (computerInt == 2)
        {
            computerPlay = "S";
        }
        else
        {
            computerPlay = "error";
        }
    
        System.out.print("Player, enter your move, and hit \"return\" [r, p, s + return]: ");
        personPlay = ((scan.nextLine()).toUpperCase());
        
        //error management
        if(personPlay.equals("R") || personPlay.equals("P") || personPlay.equals("S"))
        {
            validMove = true;
        }
        else if ((personPlay.equals("R") || personPlay.equals("P") || personPlay.equals("S")) == false)
        {
            validMove = false;
        }
        else
        {
            validMove = false;
        }
    
        System.out.println("\nComputer, enter your move, and hit \"return\" [r, p, s + return]: " + computerPlay.toLowerCase() + "\n");
        
        // error management
        if (validMove == false)
        {
            System.out.println("Invalid move. Computer wins because '" + computerPlay + "' is superior to stupidity.");
        }
        
        if (validMove == true)
        {
            if (personPlay.equals(computerPlay))
            {
                System.out.println("It's a tie!!");
            }
            
            else if (personPlay.equals("R"))
            {
                if (computerPlay.equals("P"))
                {
                    System.out.println("Paper covers rock. Computer wins!!");
                }
                if(computerPlay.equals("S"))
                {
                    System.out.println("Rock crushes scissors. You win!!");
                }
            }
            
            else if (personPlay.equals("P"))
            {
                if (computerPlay.equals("R"))
                {
                    System.out.println("Paper covers rock. You win!!");
                }
                if (computerPlay.equals("S"))
                {
                    System.out.println("Scissors cut paper. Computer wins!!");
                }
            }
            
            else if (personPlay.equals("S"))
            {
                if (computerPlay.equals("R"))
                {
                    System.out.println("Rock crushes scissors. Computer wins!!");
                }
                if (computerPlay.equals("P"))
                {
                    System.out.println("Scissors cut paper. You win!!");
                }
            }
        }
    }
}