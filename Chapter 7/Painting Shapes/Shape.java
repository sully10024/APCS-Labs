//********************************************************
//	Shape.java
//
//	Represents a generic shape with a name and area
//*********************************************************

public abstract class Shape
{
	protected String name;
	
	public abstract double area();
	
	public Shape (String inputName)
	{
		name = inputName;
	}
	
	public String toString()
	{
		return name;
	}
}