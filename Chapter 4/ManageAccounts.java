//nice job, but who are you?? (-1)
//11/12

// ****************************************************************
//   ManageAccounts.java
//
//   Use Account class to create and manage Sally and Joe's 
//   bank accounts       
// ****************************************************************

public class ManageAccounts
{
    public static void main(String[] args)
    {
        Account acct1, acct2;
        acct1 = new Account(1000, "Sally", 1111);
        acct2 = new Account(500, "Joe", 2222);
    
        acct2.deposit(100);
        System.out.println("Joe's Balance: "
            + acct2.getBalance());

        acct1.withdraw(50);
        System.out.println("Sally's Balance: "
            + acct1.getBalance());
            
        System.out.println();
        System.out.println("acct1 balance after fee: "
            + acct1.chargeFee());
        System.out.println("acct2 balance after fee: "
            + acct2.chargeFee());
        
        acct2.changeName("Joseph");
        
        System.out.println();
        System.out.println(acct1.toString());
        System.out.println(acct2.toString());
    }
}