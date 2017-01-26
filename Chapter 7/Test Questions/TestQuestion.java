import java.util.Scanner;

//**************************************************************
//	TestQuestion.java
//
//	Represents any arbitrary test question
//**************************************************************

public abstract class TestQuestion
{
	protected String question;
	// extends to subclasses
	protected Scanner stringScan = new Scanner(System.in);
	// deals with the Scanner bug with Strings and numbers
	protected Scanner numScan = new Scanner (System.in);
	
	// --------------------------------------------------
	// readQuestion()
	// 		every TestQuestion must have a readQuestion
	//		method, which is called in the constructor.
	//		
	// toString()
	//		also, each one has a toString method,
	//		which is necessary for the formatting and
	//		printint of each type of quesetion.
	// --------------------------------------------------
	protected abstract void readQuestion();
	public abstract String toString();
	
	public TestQuestion()
	{
		readQuestion();
	}
}