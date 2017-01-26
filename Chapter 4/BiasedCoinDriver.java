//nice work 11/12

// ************************************************************************************
//  BiasedCoinDriver.java
//  A simple driver class for dealing with three biased coins
// ************************************************************************************
import java.util.Scanner;

public class BiasedCoinDriver
{
    public static void main(String[] args)
    {
        int coin1Heads = 0, coin2Heads = 0, coin3Heads = 0;
        double biasInput;
        Scanner scan = new Scanner (System.in);
    
        //-----------------------------------
        //  Creats a normal coin
        //-----------------------------------
        BiasedCoin coin1 = new BiasedCoin ();
    
        //-----------------------------------
        //  Creates a biased coin
        //-----------------------------------
        System.out.print("Enter a bias value between 0 and 1 (inclusive) for coin2: ");
        biasInput = scan.nextDouble();
        while (!(0 <= biasInput && biasInput <= 1))
        {
            System.out.println("Invalid value. Must be between 0 and 1 (inclusive).");
            System.out.print("\nEnter a bias value between 0 and 1 (inclusive) for coin2: ");
            biasInput = scan.nextDouble();
        }
        BiasedCoin coin2 = new BiasedCoin (biasInput);
    
        //-----------------------------------
        //  Creates another biased coin
        //-----------------------------------
        System.out.print("\nEnter a bias value between 0 and 1 (inclusive) for coin3: ");
        biasInput = scan.nextDouble();
        while (!(0 <= biasInput && biasInput <= 1))
        {
            System.out.println("Invalid value. Must be between 0 and 1 (inclusive).");
            System.out.print("\nEnter a bias value between 0 and 1 (inclusive) for coin3: ");
            biasInput = scan.nextDouble();
        }
        BiasedCoin coin3 = new BiasedCoin (biasInput);
        
        for (int i=0; i<100; i++)
        {
            coin1.flip();
            coin2.flip();
            coin3.flip();
            
            if (coin1.isHeads())
            {
                coin1Heads++;
            }
            
            if (coin2.isHeads())
            {
                coin2Heads++;
            }
            
            if (coin3.isHeads())
            {
                coin3Heads++;
            }
        }
        
        System.out.println("\ncoin1Heads: " + coin1Heads);
        System.out.println("coin2Heads: " + coin2Heads);
        System.out.println("coin3Heads: " + coin3Heads);
    }
}