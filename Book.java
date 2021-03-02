/**
 * Tommy Rusch
 * 3rd 9-Weeks project
 * Due Tuesday, March 5th 
 * Class for the Book object
 */

public class Book implements Item
{
    private String title;
    private String author;
    private double price;
    
    public Book(String t, String a, double p)
    {
        title = t;
        author = a;
        price = p;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public String getAuthor()
    {
        return author;
    }
    
    public double getPrice()
    {
        return price;
    }
    
    public void setTitle(String x)
    {
        title = x;
    }
    
    public void setAuthor(String x)
    {
        author = x;
    }
    
    public void setPrice(double x)
    {
        price = x;
    }
    
    /**
     * Returns a toString version of the Book object's attributes
     * @return String toString version of the attributes
     */
    public String toString()
    {
        return("This book is " + title + " by " + author + " and costs " + price + ".");
    }
}