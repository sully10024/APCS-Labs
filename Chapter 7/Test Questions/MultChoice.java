//***********************************************************************
//	MultChoice.java
//
//	Represents a multiple choice test question
//***********************************************************************

public class MultChoice extends TestQuestion
{
	private int numAnswers;
	private String[] choices;
	
	public MultChoice()
	{
		super();
	}
	
	// this is what is called when any TestQuestion is created
	public void readQuestion()
	{
		numAnswers = (int)numScan.nextDouble();
		choices = new String[numAnswers];
		
		question = stringScan.nextLine();
		for (int i = 0; i < numAnswers; i++)
		{
			choices[i] = stringScan.nextLine();
		}
	}
	
	// used in printing te question
	public String toString()
	{
		String returnString = question;
		for (int i = 0; i < numAnswers; i++)
		{
			returnString = returnString.concat("\n\t\t" + choices[i]);
		}
		
		return returnString;
	}
}