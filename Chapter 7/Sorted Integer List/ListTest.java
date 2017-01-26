// ****************************************************************
// ListTest.java
//
// A simple test program that creates an IntList, puts some 
// ints in it, and prints the list.
//          
// ****************************************************************

public class ListTest
{
    public static void main(String[] args)
    {
    	IntList myList1 = new IntList(10);
    	myList1.add(100);
    	myList1.add(50);
    	myList1.add(200);
    	myList1.add(25);
    	System.out.println(myList1);
    	
    	SortedIntList myList2 = new SortedIntList(10);
    	myList2.add(100);
    	myList2.add(50);
    	myList2.add(200);
    	myList2.add(25);
    	System.out.println(myList2);
    }
}