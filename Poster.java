/**
 * Tommy Rusch
 * 3rd 9-Weeks project
 * Due Tuesday, March 5th 
 * Class for the Poster object
 */

public class Poster implements Item
{
    private String title;
    private double price;
    
    public Poster(String t, double p)
    {
        title = t;
        price = p;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public double getPrice()
    {
        return price;
    }
    
    public void setTitle(String x)
    {
        title = x;
    }
    
    public void setPrice(double x)
    {
        price = x;
    }
    
    /**
     * Returns a toString version of the poster object's attributes
     * @return String toString version of attributes
     */
    public String toString()
    {
        return("This poster is " + title + " and costs " + price + ".");
    }
}