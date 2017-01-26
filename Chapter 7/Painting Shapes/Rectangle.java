//****************************************************************
//	Rectangle.java
//
//	Represents a rectangle.
//****************************************************************

public class Rectangle extends Shape
{
	private double length, width;
	
	public Rectangle (double inputLength, double inputWidth)
	{
		super("Rectangle");
		length = inputLength;
		width = inputWidth;
	}
	
	public double area()
	{
		return (length * width);	
	}
	
	public String toString()
	{
		return super.toString() + " of length " + length +
				" and width " + width;
	}
}