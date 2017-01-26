//12/12

// ****************************************************************************************
//   Name: StringManips
//   Author: Clay Sullivan (10-07-14)
//   Summary: Test several methods for manipulating String objects
// *****************************************************************************************

import java.util.Scanner;

public class StringManips
{
    public static void main(String[] args)
    {
        String phrase;
        int phraseLength;
        int middleIndex;
        String firstHalf;
        String secondHalf;
        String switchedPhrase;
        String middle3;
        String city, state;
        Scanner scan = new Scanner(System.in);
        
        // input a String using scan.nextLine()
        System.out.println("Enter a string you want to be manipulated: ");
        phrase = scan.nextLine();
        System.out.print("\nNow enter the name of the state you're from:\n");//nice and clear prompts for a user
        state = scan.nextLine();
        System.out.print("\nEnter the name of the city you're from and press return:\n");
        city = scan.nextLine();
        
        // do the manipulations
        phraseLength = phrase.length();
        middleIndex = phraseLength / 2;
        firstHalf = phrase.substring(0,middleIndex);
        secondHalf = phrase.substring(middleIndex, phraseLength);
        switchedPhrase = secondHalf.concat(firstHalf);
        switchedPhrase = switchedPhrase.replace(' ', '*');
        middle3 = phrase.substring((middleIndex - 1), (middleIndex + 2));

        // print the things
        System.out.println ("\nOriginal phrase: " + phrase);
        System.out.println ("Length of the phrase: " + phraseLength + " characters");
        System.out.println ("Character at the middle index: " + phrase.charAt(middleIndex));
        System.out.println ("Switched phrase: " + switchedPhrase);
        System.out.println ("Middle three characters: " + middle3 + "\n");
        System.out.print ("Hometown manipulation: ");
        System.out.print (state.toUpperCase() + city.toLowerCase() + state.toUpperCase());
    }
}