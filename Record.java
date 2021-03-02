/**
 * Tommy Rusch
 * 3rd 9-Weeks project
 * Due Tuesday, March 5th 
 * Class for the Record object
 */

public class Record implements Item
{
    private String title;
    private String artist;
    private double price;
    
    public Record(String t, String a, double p)
    {
        title = t;
        artist = a;
        price = p;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public String getArtist()
    {
        return artist;
    }
    
    public double getPrice()
    {
        return price;
    }
    
    public void setTitle(String x)
    {
        title = x;
    }
    
    public void setArtist(String x)
    {
        artist = x;
    }
    
    public void setPrice(double x)
    {
        price = x;
    }
    
    /**
     * Converts the Record object's attributes to a string
     * @return String the toString version of said attributes
     */
    public String toString()
    {
        return("This record is " + title + " by " + artist + " and has a price of " + price + ".");
    }
}