import java.util.*;


public class Sales
{
    private ArrayList<Invoice> companySales;
    
    public Sales()
    {
        companySales = new ArrayList<Invoice>();
    }
    
    /**
     * Prints a toString version of the company's sales
     */
    public void printSales()
    {
        System.out.println("SALES BELOW:");
        for(int i = 0; i < companySales.size(); i++)
        {
            companySales.get(i).printInvoice();
            System.out.println();
        }
    }
    
    public ArrayList<Invoice> getCompanySales()
    {
        return companySales;
    }
    
    public void setCompanySales(ArrayList<Invoice> x)
    {
        companySales = x;
    }
}

