import java.util.Scanner;

public class TestAccounts2
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner (System.in);
        String name1, name2, name3;
        Account  account1, account2, account3;
        
        System.out.print("Enter a name followed by <return>: ");
        name1 = scan.nextLine();
        
        System.out.print("Enter a name followed by <return>: ");
        name2 = scan.nextLine();
        
        System.out.print("Enter a name followed by <return>: ");
        name3 = scan.nextLine();
        
        account1 = new Account (100, name1, 872348);
        account2 = new Account (100, name2, 345876);
        account3 = new Account (100, name3, 127365);
        
        System.out.println(account1);
        System.out.println(account2);
        System.out.println(account3);
        
        Account account4 = Account.consolidate(account2, account3);
        if (account4 != null)
        {
            System.out.println(account1);
            System.out.println(account2);
            System.out.println(account3);
            System.out.println(account4);
        }
        else
        {
            System.out.println(account1);
            System.out.println(account2);
            System.out.println(account3);
        }
        
    }
}