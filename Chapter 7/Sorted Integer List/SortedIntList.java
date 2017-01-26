//who are you - 11/12
//******************************************************************************
//  SortedIntList.java
//
//  Represents a sorted list of integers
//******************************************************************************


public class SortedIntList extends IntList
{
	public SortedIntList(int size)
	{
		super(size);
	}
	
	public void add(int value)
    {
		if(numElements == list.length)
    	{    		
    		System.out.println("Can't add, list is full");
    	}
        else
    	{	
        	int locationIndex = 0;
        	
        	// sequential search to find where to place the number	
        	while (numElements > 0 && list[locationIndex] <=
                value && locationIndex < numElements)
        	{
        		locationIndex++;
        	}
        
       		// move all numbers to the right greater than locationIndex
        	for (int i = numElements; i > locationIndex; i--)
        	{
        		list[i] = list[i-1];
        	}
        		
        	list[locationIndex] = value;
        	numElements++;
        }
    }
}