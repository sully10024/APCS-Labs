//nice job, but who are you?
//********************************************************************
//  Coin.java       Author: Lewis/Loftus/Cocking
//
//  Represents a coin with two sides that can be flipped.
//********************************************************************
public class BiasedCoin
{
   private final int HEADS = 0;
   private final int TAILS = 1;
   private int face;
   private double bias;
   
   //--------------------------------------------------------------------------------------
   //  Sets up the coin by flipping it initially.
   //--------------------------------------------------------------------------------------
   public BiasedCoin (double biasInput)
   {
       bias = biasInput;
       flip();
   }
   
   public BiasedCoin ()
   {
       bias = 0.5;
       flip();
   }
   //--------------------------------------------------------------------------------------
   //  Flips the coin by randomly choosing a face value.
   //--------------------------------------------------------------------------------------
   public void flip ()
   {
       if (Math.random() < bias)
       {
            face = HEADS;
       }
       else
       {
           face = TAILS;
       }
   }
   //--------------------------------------------------------------------------------------
   //  Returns true if the current face of the coin is heads.
   //--------------------------------------------------------------------------------------
   public boolean isHeads ()
   {
      return (face == HEADS);
   }
   //--------------------------------------------------------------------------------------
   //  Returns the current face of the coin as a string.
   //--------------------------------------------------------------------------------------
   public String toString()
   {
      String faceName;
      if (face == HEADS)
         faceName = "Heads";
      else
         faceName = "Tails";
      return faceName;
   }
}

