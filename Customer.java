/**
 * Tommy Rusch
 * 3rd 9-Weeks project
 * Due Tuesday, March 5th 
 * Class for the Customer object
 */

public class Customer extends Person
{
    private String phone;
    
    public Customer(String n, String p)
    {
        super(n);
        phone = p;
    }
    
    public void setPhone(String p)
    {
        phone = p;
    }
    
    public String getPhone()
    {
        return phone;
    }
    
    /**
     * Returns a toString version of the given Customer object
     * @return String the toString version
     */
    public String toString()
    {
        return(getName() + " is a customer with the phone: " + phone);
    }
}