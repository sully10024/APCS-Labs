//11/12 who are you?
//********************************************************************
//  MiniQuiz.java       Author: Lewis/Loftus
//
//  Demonstrates the use of a class that implements an interface.
//********************************************************************

import java.util.Scanner;

public class MiniQuiz
{
   //-----------------------------------------------------------------
   //  Presents a short quiz.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      Question q1, q2;

      q1 = new Question ("What is the capital of Jamaica?",
                         "Kingston");
      q1.setComplexity (4);

      q2 = new Question ("Which is worse, ignorance or apathy?",
                         "I don't know and I don't care");
      q2.setComplexity (10);

      askQuestion (q1);
      askQuestion (q2);
   }
   
   private static Scanner scan = new Scanner (System.in);
   
   private static void askQuestion(Question questionInput)
   {
      String possible;
      
      System.out.print (questionInput.getQuestion());
      System.out.println (" (Level: " + questionInput.getComplexity() + ")");
      possible = scan.nextLine();
      if (questionInput.answerCorrect(possible))
      {
         System.out.println ("Correct");
      }
      else
      {
        System.out.println ("No, the answer is " + questionInput.getAnswer());
      }
    }
}