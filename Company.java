
/**
 * Amy Lewis
 */

import java.util.*;
import java.io.*;

public class Company
{
    public static void main(String[] args) throws IOException
    {
        Customer c001 = new Customer ("Brianna Ladiero", "555-555-5555");
        Customer c002 = new Customer ("Jamir Malone", "555-555-5555");
        Customer c003 = new Customer ("Jasmine Perarson", "555-555-5555");
        Employee e001 = new Employee ("Brandon Jones");
        Employee e002 = new Employee ("Kai Nesmith");
        Employee e003 = new Employee ("Matthew Peterson");
        Inventory bnI = new Inventory("inv.txt");
        Sales bnS = new Sales();
        ArrayList<Item> inStock = new ArrayList<Item>();
        bnS.getCompanySales().add(new Invoice(c001, e001, 2, 14, 29, true));
        bnS.getCompanySales().get(0).addItem(bnI, "Sticky Fingers");
        bnS.getCompanySales().get(0).addItem(bnI, "Nirvana");
        bnS.getCompanySales().get(0).addItem(bnI, "Lamb");
        bnS.getCompanySales().get(0).printInvoice();
        bnS.getCompanySales().add(new Invoice(c002, e001, 2, 15, 29, false));
        bnS.getCompanySales().get(1).addItem(bnI, "Jane Eyre");
        bnS.getCompanySales().get(0).printInvoice();
        bnS.getCompanySales().add(new Invoice(c003, e002, 2, 18, 29, true));
        bnS.getCompanySales().get(2).addItem(bnI, "Potter");
        bnS.getCompanySales().get(2).addItem(bnI, "Hogwarts");
        bnS.getCompanySales().get(0).printInvoice();
        bnS.printSales();
        bnI.printInventory();
        System.out.println(e001.getName() + " commissions: $" + e001.calcCommission());
        System.out.println(e001.getName() + " commissions: $" + e001.calcCommission());
        
}
}