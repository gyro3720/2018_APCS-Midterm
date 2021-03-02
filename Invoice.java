/**
 * Tommy Rusch
 * 3rd 9-Weeks project
 * Due Tuesday, March 5th 
 * Class for the Invoice object
 */

import java.util.*;

public class Invoice
{
    private static int nextID = 10001;
    private final int number;
    private Customer cust;
    private Employee emp;
    private Date date;
    private ArrayList<Item> itemsSold;
    private double totalPrice;
    private boolean shipping;
    
    public Invoice(Customer c, Employee e, int y, int m, int d, boolean x)
    {
        cust = c;
        emp = e;
        date = new Date(y,m,d);
        shipping = x;
        number = nextID;
        nextID++;
        itemsSold = new ArrayList<Item>();
        totalPrice = 0;
        if(shipping)
            totalPrice += 10;
    }
    
    /**
     * Adds a given item x to an inventory a if found
     * @param Inventory a the given inventory
     * @param String x title of the item
     */
    public void addItem(Inventory a, String x)
    {
        ArrayList<Item> inv = a.getInventory();
        if(a.searchItem(x) != -1)
        {            
             totalPrice -= inv.get(a.searchItem(x)).getPrice();
             emp.setAmountSold(emp.getAmountSold() + inv.get(a.searchItem(x)).getPrice());           
             itemsSold.add(inv.get(a.searchItem(x)));
             inv.remove(inv.get(a.searchItem(x))); 
             a.setInventory(inv);
        }
        else
        {
             System.out.println("Out of Stock");
        }
    }
    
    /**
     * Returns a tostring version of the invoice's number and price
     * @Return String toString mentioned above
     */
    public String toString()
    {
        return("Invoice:" + number + "| Total Price:" + totalPrice);
    }
    
    /**
     * Prints a toString version of the invoice
     */
    public void printInvoice()
    {
        System.out.println("-------------INVOICE-START-------------");
        System.out.println("Invoice Number:"  + number + "\n" + "Date:" + date);
        System.out.println("Employee: " + emp.getName());
        System.out.println("Client: " + cust.getName());
        for(int i = 0; i < itemsSold.size(); i++)
        {
            System.out.println(itemsSold.get(i).toString());
        }
        System.out.println("Total price: $" + (-1 * totalPrice));
        System.out.print("Shipping(Y/N): ");
        if(shipping)
            System.out.println("YES");
        else
            System.out.println("NO");
        System.out.println("-------------INVOICE-END-------------");
    }   
}