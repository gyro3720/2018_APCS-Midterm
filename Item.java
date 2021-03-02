/**
 * Tommy Rusch
 * 3rd 9-Weeks project
 * Due Tuesday, March 5th 
 * Interface for the item object
 */

public interface Item
{
    public abstract String getTitle();
    public abstract double getPrice();
    /**
     * Returns a toString version of the subclass
     * @return String the toString version
     */
    public abstract String toString();
}