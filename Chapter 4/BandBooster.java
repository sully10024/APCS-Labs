//********************************************************************
//  BandBooster.java
//  A class that provides a structure for tracking booster events
//********************************************************************

public class BandBooster
{
    private String name;
    private int boxesSold;
    
    public BandBooster(String nameBooster)
    {
        name = nameBooster;
        boxesSold = 0;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void updateSales(int updateSold)
    {
        boxesSold += updateSold;
    }
    
    public String toString()
    {
        String returnString;
        if (boxesSold == 1)//LOL! Nice job
        {
            returnString = name + ":\t" + boxesSold + " box";
        }
        else
        {
            returnString = name + ":\t" + boxesSold + " boxes";
        }
        
        return returnString;//unnecessary
    }
}