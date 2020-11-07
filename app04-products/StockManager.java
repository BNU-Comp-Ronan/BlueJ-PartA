import java.util.ArrayList;

/**
 * Manage the stock in a business.
 * The stock is described by zero or more Products.
 * 
 * @author Ronan DeMelo
 * @version (06/11/2020)
 */
public class StockManager
{
    // A list of the products.
    private ArrayList<Product> stock;

    /**
     * Initialise the stock manager.
     */
    public StockManager()
    {
        stock = new ArrayList<>();
    }

    /**
     * Add a product to the list.
     * @param item The item to be added.
     */
    public void addProduct(Product item)
    {
        stock.add(item);
    }
    
    /**
     * Receive a delivery of a particular product.
     * Increase the quantity of the product by the given amount.
     * @param id The ID of the product.
     * @param amount The amount to increase the quantity by.
     */
    public void delivery(int id, int amount)
    {
        Product product = findProduct(id);
        
        if(product != null)
        {
            product.deliver(amount);
        }
        
        else
        {
            System.out.println("Cannot find product id: " + id + "\n");
        }
    }

    
    /**
     * Sells a given amount of products.
     */
    public void sellProduct(int id, int quantity)
    {
        Product product = findProduct(id);
        
        if(product != null)
        {
            product.sell(quantity);
        }
    }
    
    /**
     * Try to find a product in the stock with the given id.
     * @return The identified product, or null if there is none
     *         with a matching ID.
     */
    public Product findProduct(int id)
    {
        for(Product product : stock)
        {
            if(product.getID() == id)
            {
                return product;
            }
        }
        return null;
    }
    
    /**
     * Locate a product with the given ID, and return how
     * many of this item are in stock. If the ID does not
     * match any product, return zero.
     * @param id The ID of the product.
     * @return The quantity of the given product in stock.
     */
    public int numberProductsInStock()
    {
        return stock.size();
    }
    
    /**
     * This will print out all the stock.
     */
    public void printAllProducts()
    {
        printHeading();
        
        for(Product product : stock)
        {
            System.out.println(product);
        }
        System.out.println();
    }
    
    /**
     * Holds the heading for the print method.
     */
    private void printHeading()
    {
        System.out.println();
        System.out.println("===================");
        System.out.println("DeMelo's Stock List");
        System.out.println("===================");
        System.out.println();
    }
    
    /**
     * Show details of the given product. If found,
     * its name and stock quantity will be shown.
     * @param id The ID of the product to look for.
     */
    public void printDetails(int id)
    {
        Product product = findProduct(id);
        
        if(product != null) 
        {
            System.out.println(product.toString());
        }
    }
    
    /**
     * Prints out what items are low on stock.
     */
    public void printLowStock()
    {
        for(Product product : stock)
        {
            if(product.getQuantity() < 5)
            {
                System.out.println("This Product is low on stock " + product.toString());
            }
        }
        System.out.println();
    }
}
