//10/12

// *****************************************************************
//  Author: Clay Sullivan 
//
//  Count.java
//
//   This program reads in strings (phrases) and counts the 
//   number of blank characters and certain other letters
//   in the phrase.
// *****************************************************************

import java.util.Scanner;

public class Count
{
  public static void main (String[] args)
  {
      String phrase;                        // a string of characters
      String phraseLowerCase;   // the entered phrase, in lower case
      int countBlank = 0;                // the number of blanks (spaces) in the phrase 
      int countA = 0;
      int countE = 0;
      int countS = 0;
      int countT = 0;
      int length;                                // the length of the phrase
      boolean noPrintTwiceBoolean = false;
      boolean continueProgram = true;

      Scanner scan = new Scanner(System.in);

      System.out.println ("Character Counter\n");
      
      System.out.print ("Enter a sentence or phrase and hit the 'return' key, or type 'quit' to quit the program: ");
      phrase = scan.nextLine();   //scans for a phrase that is typed by the user
      length = phrase.length();     //finds the length of the entered phrase, storing it in int length
      phraseLowerCase = phrase.toLowerCase();
      
      while ((phraseLowerCase.equals("quit")) == false)
      {
          countBlank = 0;
          countA = 0;
          countE = 0;
          countS = 0;
          countT = 0;
          
          if (noPrintTwiceBoolean == true)
          {
              System.out.print("\nEnter a sentence or phrase and hit the 'return' key, or type 'quit' to quit the program: ");//they already entered a phrase if it was not quit and if this is the first time (see above) double prompt
              phrase = scan.nextLine();
              length = phrase.length();
              phraseLowerCase = phrase.toLowerCase();
          }
          
          noPrintTwiceBoolean = true;        // makes sure the prompt for the phrase doesn't get printed twice the first time the program runs.
                                                              // setting it to true allows the phrase to be printed when the program loops back to the top again
          
          for (int i=0 ; i < length ; i++)
          {
                //should be else if's to avoid checking each condition
                if (phraseLowerCase.charAt(i) == ' ')
                {
                   countBlank++;
                }
                
                if (phraseLowerCase.charAt(i) == 'a')
                {
                    countA++;
                }
          
                if (phraseLowerCase.charAt(i) == 'e')
                {
                    countE++;
                }
          
                if (phraseLowerCase.charAt(i) == 's')
                {
                    countS++;
                }
          
                if (phraseLowerCase.charAt(i) == 't')
                {
                    countT++;
                }
          }
            
          if ((phraseLowerCase.equals("quit")) == true)
          {
              continueProgram = false;
          } 
            
          if (continueProgram == true)
          {
              System.out.println ("\nNumber of blank spaces: " + countBlank);
              System.out.println ("Number of \"a's\": " + countA);
              System.out.println ("Number of \"e's\": " + countE);
              System.out.println ("Number of \"s's\": " + countS);
              System.out.println ("Number of \"t's\": " + countT);
          }
      }
    }
}