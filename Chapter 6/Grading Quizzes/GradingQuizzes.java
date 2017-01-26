//who are you?
//11/12

import java.util.Scanner;
import java.text.DecimalFormat;

public class GradingQuizzes
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner (System.in);
        DecimalFormat fmt = new DecimalFormat("0.00");
        int[] answerKey;
        int[] studentQuiz;
        int numQuestions, numCorrect = 0, numIncorrect = 0;
        double gradePercent = 0;
        boolean doAnother = true;
        
        System.out.print("How many questions are on the quiz? ");
        numQuestions = (int) Math.abs(scan.nextDouble());
        answerKey = new int[numQuestions];
        
        System.out.print("Enter all of the answers for the answer key on one line: ");
        for (int i = 0; i < numQuestions; i++)
        {
            answerKey[i] = (int)scan.nextDouble();
        }
        
        studentQuiz = new int[numQuestions];
        
        while (doAnother == true)
        {
            numCorrect = 0;
            System.out.print("\nEnter the answers to the quiz you are grading on one line: ");
            for (int i = 0; i < numQuestions; i++)
            {
                if ((int)scan.nextDouble() == answerKey[i])
                {
                    numCorrect++;
                }
            }
        
            gradePercent = ((double)numCorrect/numQuestions)*100;
        
            System.out.println("Percentage Correct: " + fmt.format(gradePercent) + "%");
        
            System.out.print("\nWould you like to grade another quiz based on this answer key? (Y/n) ");
            if (scan.next().toLowerCase().charAt(0) == 'n')
            {
                doAnother = false;
                System.out.println("\n\n[exiting]");
            }
        }
    }
}