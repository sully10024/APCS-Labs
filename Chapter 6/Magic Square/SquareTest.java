// ****************************************************************
// SquareTest.java
//
// Uses the Square class to read in square data and tell if 
// each square is magic.
//          
// ****************************************************************

import java.util.Scanner;

public class SquareTest
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int count = 1;                 //count which square we're on
        int size = 0;     //size of next square

        //Expecting -1 at bottom of input file
        while (size != -1)
        {
            System.out.print("Enter the size of your square: ");
            size = (int)scan.nextDouble();
            
            Square squareCheck = new Square(size+1);

            System.out.println("\nEnter the square with dimensions " + 
                size + " by " + size);
            squareCheck.readSquare();
            
            for (int i = 0; i < size; i++)
            {
                System.out.println("Sum of row " + i + ": " + squareCheck.sumRow(i));
            }
            
            for (int i = 0; i < size; i++)
            {
                System.out.println("Sum of column " + i + ": " + squareCheck.sumCol(i));
            }
           
            System.out.println("Sum of main diagonal: " + squareCheck.sumMainDiag());
            System.out.println("Sum of other diagonal: " + squareCheck.sumOtherDiag());
            
            if (squareCheck.magic())
            {
                System.out.println("This is a magic square.");
            }
            else
            {
                System.out.println("This is not a magic square.");
            }

            System.out.println("\nIf you would like to enter another square, then set the size.");
            System.out.print("If you do not want to enter another square, then enter -1: ");
            size = scan.nextInt();
        }

   }
}