//who are you?
// ********************************************************************************
//  Name.java
//  A person's name, represented in Java. With extra methods.
//  (how programmers introduce themselves)
// ********************************************************************************

public class Name
{
    private String firstName, middleName, lastName;
    
    //  construct crude name data
    public Name (String first, String middle, String last)
    {
        firstName = first;
        middleName = middle;
        lastName = last;
    }
    
    //  return first name
    public String getFirst ()
    {
        return firstName;
    }
    
    //  return middle name
    public String getMiddle()
    {
        return middleName;
    }
    
    //  return last name
    public String getLast()
    {
        return lastName;
    }
    
    //  return name in format "Sarah Jane Smith"
    public String firstMiddleLast()
    {
        String returnString;
        returnString = firstName + " " + middleName + " " + lastName;
        
        return returnString;
    }
    
    // return name in format "Smith, Sarah Jane"
    public String lastFirstMiddle()
    {
        String returnString;
        returnString = lastName + ", " + firstName + " " + middleName;
        
        return returnString;
    }
    
    //  non case-sensitive comparision between two name objects
    public boolean equals (Name otherName)
    {
        if (firstMiddleLast().equalsIgnoreCase(otherName.firstMiddleLast()))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    // returns initials in format "SJS"
    public String initials ()
    {
        String firstInitial, middleInitial, lastInitial, returnString;
        firstInitial = firstName.substring(0,1).toUpperCase();
        middleInitial = middleName.substring(0,1).toUpperCase();
        lastInitial = lastName.substring(0,1).toUpperCase();
        
        returnString = (firstInitial.concat(middleInitial.concat(lastInitial)));
        return returnString;
    }
    
    //  returns int length of number of characters, not including spaces
    public int length()
    {
        int firstLength = firstName.length();
        int middleLength = middleName.length();
        int lastLength = lastName.length();
        
        int totalLength = firstLength + middleLength + lastLength;
        
        return totalLength;
    }
}