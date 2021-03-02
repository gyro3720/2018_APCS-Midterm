/**
 * Tommy Rusch
 * 3rd 9-Weeks project
 * Due Tuesday, March 5th 
 * Class for the Employee object
 */

public class Employee extends Person
{
    private double amountSold;
    
    public Employee(String n)
    {
        super(n);
        amountSold = 0;
    }
    
    public double getAmountSold()
    {
        return amountSold;
    }
    
    public void setAmountSold(double x)
    {
        amountSold += x;
    }
    
    /**
     * Calculates and returns 10% of amountSold and resets amountSold to 0
     * @return double 10% of amountSold
     */
    public double calcCommission()
    {
        double com = (.1 * amountSold);
        amountSold = 0;
        return (com);
    }
    
    /**
     * Returns a toString version of the given Employee class
     * @return String the toString version
     */
    public String toString()
    {
        return(getName() + " is an employee with " + amountSold + "$ in sales");
    }
}