//**********************************************************
//	Essay.java
//
//	Represents an essay question
//**********************************************************

public class Essay extends TestQuestion
{
	private int numLines;
	
	public Essay()
	{
		super();
	}
	
	// this iswhat is called when any TestQuestion is created
	public void readQuestion()
	{
		numLines = (int)numScan.nextDouble();
		question = stringScan.nextLine();
	}
	
	// used in printing the question
	public String toString()
	{
		String returnString = question;
		for (int i = 0; i < numLines; i++)
		{
			returnString = returnString.concat("\n");
		}
		
		return returnString;
	}	
}