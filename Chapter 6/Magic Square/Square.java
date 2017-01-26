//11/12
import java.util.Scanner;

// ****************************************************************
// Square.java
//
// Define a Square class with methods to create and read in
// info for a square matrix and to compute the sum of a row,
// a col, either diagonal, and whether it is magic.
//          
// ****************************************************************

import java.util.Scanner;

public class Square
{
    int[][] square;
    int squareSize;
    
    Scanner scan = new Scanner (System.in);//unnecessary

    //--------------------------------------
    //create new square of given size
    //--------------------------------------
    public Square(int size)
    {
        square = new int[size][size];
        squareSize = size;
    }

    //--------------------------------------
    //return the sum of the values in the given row
    //--------------------------------------
    public int sumRow(int row)
    {
        int sum = 0;
        for (int i = 0; i < square.length; i++)
        {
            sum += square[row][i];
        }
        return sum;
    }

    //--------------------------------------
    //return the sum of the values in the given column
    //--------------------------------------
    public int sumCol(int col)
    {
        int sum = 0;
        for (int i = 0; i < square.length; i++)
        {
            sum += square[i][col];
        }
        return sum;
    }

    //--------------------------------------
    //return the sum of the values in the main diagonal
    //--------------------------------------
    public int sumMainDiag()
    {
        int sum = 0; 
        for (int i = 0; i < square.length; i++)
        {
            sum += square[i][i];
        }
        return sum;
    }

    //--------------------------------------
    //return the sum of the values in the other ("reverse") diagonal
    //--------------------------------------
    public int sumOtherDiag()
    {
        int sum = 0;
        for (int i = square.length-1; i >= 0; i--)
        {
            sum += square[i][i];//inaccurate
        }
        return sum;
    }

    //--------------------------------------
    //return true if the square is magic (all rows, cols, and diags have
    //same sum), false otherwise
    //--------------------------------------
    public boolean magic()
    {
        boolean columns, rows, diags;
        int checkToThis;
        boolean isSquare = true;
        checkToThis = sumRow(0);
        for (int i = 0; i <= square.length; i++)
        {
            if (sumRow(i) != checkToThis)
            {
                isSquare = false;
            }
        }
        
        for (int i = 0; i <= square.length; i++)
        {
            if (sumCol(i) != checkToThis)
            {
                isSquare = false;
            }
        }
        
        if (sumMainDiag() != checkToThis)
        {
            isSquare = false;;
        }
        
        if (sumOtherDiag() != checkToThis)
        {
            isSquare = false;
        }
        
        return isSquare;
    }

    //--------------------------------------
    //read info into the square from the input stream associated with the 
    //Scanner parameter
    //--------------------------------------
    public void readSquare()
    {
        for (int x = 0; x < square.length-1; x++)
        {
            for (int y = 0; y < square.length-1; y++)
            {
                square[x][y] = (int)scan.nextDouble();
            }
        }
    }

    //--------------------------------------
    //print the contents of the square, neatly formatted
    //--------------------------------------
    public void printSquare()
    {
        for (int x = 0; x < squareSize-1; x++)
        {
            for (int y = 0; y < squareSize-1; y++)
            {
                System.out.print(square[x][y] + "  ");
            }
            System.out.println("");
        }
    }
}