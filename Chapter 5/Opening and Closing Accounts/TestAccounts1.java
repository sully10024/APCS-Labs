//***********************************************************
// TestAccounts1.java
// A simple program to test the numAccts method of the 
// Account class.  
//***********************************************************
import java.util.Scanner;

public class TestAccounts1
{
    public static void main(String[] args)
    {
    Account testAcct;

    Scanner scan = new Scanner(System.in);

    System.out.println("How many accounts would you like to create?");
    int num = scan.nextInt();

    for (int i=1; i<=num; i++)
        {
        testAcct = new Account(1, "Name" + i, 1234);
        System.out.println("\nCreated account " + testAcct);
        if (Account.getNumAccounts() == 1)
        {
            System.out.println("Now there is " + Account.getNumAccounts() +
                " account");
        }
        else
        {
            System.out.println("Now there are " + Account.getNumAccounts() + 
                   " accounts");
        }
    }
    }
}