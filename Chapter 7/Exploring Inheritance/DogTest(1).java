//10/12 - where did Canine come from?
//who are you?

// ****************************************************************
// DogTest.java
//
// A simple test class that creates a Dog and makes it speak.
// ****************************************************************

public class DogTest
{
    public static void main(String[] args)
    {
    	Dog canine = new Canine("Spike");
    	System.out.println(canine.getName() + " says " + canine.speak());
	
    	Yorkshire yorkie = new Yorkshire ("Chloe");
    	System.out.println(yorkie.getName() + " says " + yorkie.speak());
    	
    	Labrador lab = new Labrador ("Sally", "black");
    	System.out.println(lab.getName() + " says " + lab.speak());
    	
    	System.out.println("\nAverage Yorkshire Weight: " + yorkie.avgBreedWeight());
    	System.out.println("Average Labrador Weight: " + lab.avgBreedWeight());
    }
}