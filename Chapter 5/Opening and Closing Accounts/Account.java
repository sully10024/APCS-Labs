//who are you? 11/12
import java.util.Random;

//*******************************************************
// Account.java
//
// A bank account class with methods to deposit to, withdraw from,
// change the name on, and get a String representation
// of the account.
//*******************************************************

public class Account
{
  private double balance;
  private String name;
  private long acctNum;
  public static int numAccounts = 0;

  //----------------------------------------------
  //Constructor -- initializes balance, owner, and account number
  //----------------------------------------------
  public Account(double initBal, String owner, long number)
  {
    balance = initBal;
    name = owner;
    acctNum = number;
    Account.numAccounts++;
  }
  
  public static Account consolidate (Account acct1, Account acct2)
  {
      if (acct1.getName().equals(acct2.getName()) &&
        acct2.acctNum() != acct1.acctNum())
      {
         double returnBalance = acct1.getBalance() + acct2.getBalance();
         String returnName = acct1.getName();
         long returnNumber = (acct1.acctNum() + acct2.acctNum)/2;
            // averaging the two original numbers always/usually creates a new
         Account returnAccount = new Account (returnBalance, returnName, returnNumber);   // and unique number
         return returnAccount;
      }
      else
      {
          System.out.println("bruh you can't have two" +
            " accounts that have different names or the same numbers...");
          return null;
      }
  } 
  
  public String getName()
  {
      return name;
  }
  
  public long acctNum()
  {
      return acctNum;
  }
  
  public static int getNumAccounts()
  {
      return numAccounts;
  }
  
  public void close()
  {
      this.name.concat("CLOSED");
      this.balance = 0;
      Account.numAccounts--;
  }

  //----------------------------------------------
  // Checks to see if balance is sufficient for withdrawal.
  // If so, decrements balance by amount; if not, prints message.
  //----------------------------------------------
  public void withdraw(double amount)
  {
    if (balance >= amount)
    {
       balance -= amount;
    }
    else
    {
       System.out.println("Insufficient funds");
    }
  }   

  //----------------------------------------------
  // Adds deposit amount to balance.
  //----------------------------------------------
  public void deposit(double amount)
  {
    balance += amount;
  }

  //----------------------------------------------
  // Returns balance.
  //----------------------------------------------
  public double getBalance()
  {
    return balance;
  }
  //----------------------------------------------
  // Returns a string containing the name, account number, and balance.
  //----------------------------------------------
  public String toString()
  {
    return "Name:" + name +
    "\nAccount Number: " + acctNum + 
    "\nBalance: " + balance; 
  }
}