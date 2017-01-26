//who are you?
// ********************************************************************************
//   Student.java
//
//   Define a student class that stores name, score on test 1, and
//   score on test 2.  Methods prompt for and read in grades, 
//   compute the average, and return a string containing student’s info. 
// ********************************************************************************
import java.util.Scanner;

public class Student
{
    private String name;
    private int test1Score, test2Score;
    
    Scanner scan = new Scanner(System.in);

    public Student(String studentName)
    {
        name = studentName;
        //initialize remaining instance data
    }

    public void inputGrades()
    {
        System.out.print("Enter " + name + "'s score for test1: ");
        test1Score = (int)scan.nextDouble();
        
        System.out.print("Enter " + name + "'s score for test2: ");
        test2Score = (int)scan.nextDouble();
    }

    public int getAverage()
    {
        double testAverage = (double)(test1Score + test2Score)/2;
        return (int)testAverage;//this doesn't round... mean teacher
    }

    public String getName()
    {
        return name;
    }
    
    public String toString()
    {
        String testSummary;
        testSummary = "Name: " + name + "\tTest1: " + test1Score
            + "\tTest2: " + test2Score;
            
        return testSummary;
    }
}