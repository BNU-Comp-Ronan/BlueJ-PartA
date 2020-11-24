import java.util.Random;
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
    
    //Creates a rng.
    private Random generator = new Random();
    
    private int amount = 0;
    /**
     * This holds a few demo products to test the stock manager.
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
        manager.addProduct(new Product(109,  "Jaffa Cakes"));
        manager.addProduct(new Product(110,  "Milk"));
    }
    
    /**
     * Provide a very simple demonstration of how a StockManager
     * might be used. Details of one product are shown, the
     * product is restocked in random amounts, and then the details are shown again.
     */
    public void runDemo()
    {
        manager.printAllProducts();
        
        int noProducts = manager.numberProductsInStock();
        
        System.out.println("Number of products in stock: " + noProducts + "\n");
        
        demoDelivery();
        demoSellProducts();
        manager.printLowStock();
    }
    
    /**
     * Sells a random number of products.
     */
    private void demoSellProducts()
    {
        printSelling();
        
        for(int id = 101; id <= 110; id++)
        {
            amount = generator.nextInt(20);
            manager.sellProduct(id, amount);
        }
       
        manager.printAllProducts();
    }
    
    private void printSelling()
    {
        System.out.println("--------------------");
        System.out.println("Selling Products");
        System.out.println("--------------------");
    }
    
    /**
     * Delivers a random number of products.
     */
    private void demoDelivery()
    {
        printDelivery();
        
        for(int id = 101; id <= 110; id++)
        {
            amount = generator.nextInt(20);
            manager.delivery(id, amount);
        }
        
        manager.printAllProducts();
    }
    
    private void printDelivery()
    {
        System.out.println("--------------------");
        System.out.println("Delivering Products");
        System.out.println("--------------------");
    }
}
