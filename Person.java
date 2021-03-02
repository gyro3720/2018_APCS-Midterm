/**
 * Tommy Rusch
 * 3rd 9-Weeks project
 * Due Tuesday, March 5th 
 * Abstract class for the Invoice object
 */

public abstract class Person
{
    private String name;
    
    public Person(String n)
    {
        name = n;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String n)
    {
        name = n;
    }
    
    /**
     * Returns a toString version of the person subclass
     * @Return String the toString version
     */
    public abstract String toString();
}