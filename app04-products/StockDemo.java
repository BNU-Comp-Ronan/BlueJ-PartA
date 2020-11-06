/**
 * Demonstrate the StockManager and Product classes.
 * The demonstration becomes properly functional as
 * the StockManager class is completed.
 * 
 * @author David J. Barnes and Michael Kölling.
 * @version 2016.02.29
 * Modified by Ronan DeMelo
 */
public class StockDemo
{
    // The stock manager.
    private StockManager manager;

    /**
     * Create a StockManager and populate it with a few
     * sample products.
     */
    public StockDemo(StockManager manager)
    {
        this.manager = manager;
        
        manager.addProduct(new Product(101, "Cookies"));
        manager.addProduct(new Product(102,  "Poptart"));
        manager.addProduct(new Product(103,  "Walkers"));
        manager.addProduct(new Product(104,  "Pringles"));
        manager.addProduct(new Product(105,  "Rocky Road"));
        manager.addProduct(new Product(106,  "Cheese Puffs"));
        manager.addProduct(new Product(107,  "Milka"));
        manager.addProduct(new Product(108,  "RTX 3090 FE"));
    }
    
    /**
     * Provide a very simple demonstration of how a StockManager
     * might be used. Details of one product are shown, the
     * product is restocked, and then the details are shown again.
     */
    public void runDemo()
    {
        // Show details of all of the products.
        manager.printAllProducts();
        
        manager.printAllProducts();
    }
    
}
