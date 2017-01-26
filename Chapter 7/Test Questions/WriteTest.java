import java.util.Scanner;

// ******************************************************************************
//	WriteTest.java (driver)
//
//	Responsible for reading in the test, its question, and if necessary,
//		their answers. It then prints the formatted versions of the input
//		questions to be printed out on paper for students
// ******************************************************************************

public class WriteTest
{
	public static void main (String[] args)
	{
		int numQuestions;
		char scanChar;
		
		Scanner stringScan = new Scanner(System.in);
		Scanner numScan = new Scanner(System.in);
		TestQuestion[] questions;
		
		numQuestions = (int)numScan.nextDouble();
		questions = new TestQuestion[numQuestions];
		
		for (int i = 0; i < numQuestions; i++)
		{
			scanChar = stringScan.nextLine().toLowerCase().charAt(0);
			
			if (scanChar == 'e' | scanChar == 'm')
			{
				if (scanChar == 'e')
					questions[i] = new Essay();
				if (scanChar == 'm')
					questions[i] = new MultChoice();
			}
			else
			{
				i--;
				System.out.print("Something went wrong, please try again: ");
			}
		}
		
		System.out.println("\nYour Test:");
		
		for (int i = 0; i < numQuestions; i++)
		{
			System.out.println("" + (i+1) + ".)\t" + questions[i]);
		}
	}
}