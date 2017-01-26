// ****************************************************************************************
//
//   StringManips
//
//   Test several methods for manipulating String objects
//
// *****************************************************************************************

import java.util.Scanner;

public class StringManips
{
    public static void main(String[] args)
    {
        String phrase = new String ("This is a String test.");
        int phraseLength;       // number of characters in the phrase String
        int middleIndex;        // index of the middle character in the String
        String firstHalf;       // first half of the phrase String
        String secondHalf;      // second half of the phrase String
        String switchedPhrase;  // a new phrase with original halves switched
        String middle3;         // middle three indices in phrase String
        String city, state;     // used later for user input of their city and state
        String originalCity, originalState; //used in manipulating Strings city and state
        
        // compute the length and middle index of the phrase
        phraseLength = phrase.length();
        middleIndex = phraseLength / 2;
        
        // get the substring for each half of the phrase
        firstHalf = phrase.substring(0,middleIndex);
        secondHalf = phrase.substring(middleIndex, phraseLength);
        
        // concatenate the firstHalf at the end of the secondHalf and
        // replace blank characters with asterces
        switchedPhrase = secondHalf.concat(firstHalf);
        switchedPhrase = switchedPhrase.replace(' ', '*');
        
        // assign information to middle3
        middle3 = phrase.substring((middleIndex - 1), (middleIndex + 2));
        
        // prompts user for their city and state
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the name of the city you're from and press return:\n");
        city = scan.nextLine();
        
        System.out.print("\nNow enter the name of the state you're from:\n");
        state = scan.nextLine();
        
        // print information about the phrase
        System.out.println ("\nOriginal phrase: " + phrase);
        System.out.println ("Length of the phrase: " + phraseLength + " characters");
        System.out.println ("Character at the middle index: " + middleIndex);
        System.out.println ("Switched phrase: " + switchedPhrase);
        System.out.println ("Middle three characters: " + middle3 + "\n");
        
        // print things about city and state of homework of the user
        //      in this format: "NEW YORKtarrytownNew York"
        System.out.print ("Hometown manipulation: ");
        System.out.print (state.toUpperCase() + city.toLowerCase() + state.toUpperCase());
    }
}