/**
 * Tommy Rusch
 * 3rd 9-Weeks project
 * Due Tuesday, March 5th 
 * Class for the Inventory object
 */

import java.util.*;
import java.io.*;

public class Inventory
{
    private ArrayList<Item> inStock;
    /**
     * Constructor for objects of class Inventory
     */
    public Inventory(String fileName) throws IOException
    {
        inStock = new ArrayList<Item>();
        File file = new File(fileName);
        String path = file.getAbsolutePath();
        Scanner infile = new Scanner(new File(path));
             
        while(infile.hasNext())
        {
            String temp = infile.nextLine();
            int colon = temp.indexOf(":");
            int semicolon = temp.indexOf(";");
            int comma = temp.indexOf(",");
                
            int type = Integer.parseInt(temp.substring(0,colon));
            String title = temp.substring(colon+1,semicolon);
            String a = temp.substring(semicolon+1,comma);
            double price = Double.parseDouble(temp.substring(comma+1));
                
            if(type == 1)
                inStock.add(new Book(title, a, price));
            else if (type == 2)
                inStock.add(new Record(title,a,price));
            else
                inStock.add(new Poster(title, price));
        }
    }
    
    /**
     * Returns the index of an item if it matches a given keyword
     * @param String title the given keyword
     * @return int the given index, -1 if not found
     */
    public int searchItem(String title)
    {
        for(int i = 0; i < inStock.size(); i++)
        {
            if(inStock.get(i).getTitle().contains(title))
                return i;
        }
        return -1;
    }
    
    public ArrayList getInventory()
    {
        return inStock;
    }
    
    public void setInventory(ArrayList<Item> x)
    {
        inStock = x;
    }
    
    /**
     * Prints a toString version of the company's inventory
     */
    public void printInventory()
    {
        for(int i = 0; i < inStock.size(); i++)
        {
            System.out.println(inStock.get(i).toString());
        }
    }
}
