//***************************************************************
//	Cylinder.java
//
//	Represents a cylinder.
//***************************************************************

public class Cylinder extends Shape
{
	private double radius;
	private double height;
	
	public Cylinder (double inputRadius, double inputHeight)
	{
		super("Cylinder");
		radius = inputRadius;
		height = inputHeight;
	}
	
	public double area()
	{
		return 2*(Math.PI * Math.pow(radius, 2) * height);
	}
	
	public String toString()
	{
		return super.toString() + " of height " + height +
				" and radius " + radius;
	}
}