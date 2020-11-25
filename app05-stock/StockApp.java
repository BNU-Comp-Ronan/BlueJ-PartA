
/**
 * This app provides a user interface to the
 * stock manager so that users can add, edit,
 * print and remove stock products
 *
 * @author Ronan DeMelo
 * @version 0.1 24/11/2020
 */
public class StockApp
{
    // Use to get user input
    private InputReader input;
    
    private StockManager manager;
    
    private StockDemo demo;

    /**
     * Constructor for objects of class StockApp
     */
    public StockApp()
    {
        input = new InputReader();
        manager = new StockManager();
        demo = new StockDemo(manager);
    }

    /**
     * 
     */
    public void run()
    {
        boolean finished = false;
        
        while(!finished)
        {
            printHeading();
            printMenuChoices();

            String choice = input.getCommand();

            //changes the string to uppercase.
            choice = choice.toUpperCase();
            if(choice.equals("QUIT"))
            {
                finished = true;
            }
            else
            {
                executeMenuChoice(choice);
            }
        }
    }
    
    private int enterID()
    {
        System.out.println("Enter a product ID");
        String value = input.getCommand();
        int id = Integer.parseInt(value);
        return id;
    }

    /**
     * This code allows the user to add a product by using the UI.
     */
    private void addProduct()
    {
        System.out.println("\nAdding a new product");
        System.out.println("Enter the product name");
        String name = input.getCommand();
        
        int id = enterID();
        
        
        Product product = new Product(id, name);
        
        manager.addProduct(product);
    }

    /**
     * This code allows the user to remove a product by using the UI.
     */
    private void removeProduct()
    {
        System.out.println("\nRemoving a product");
        int id = enterID();
        
        manager.removeProduct(id);
    }

    /**
     * This code allows the user to print all products by using the UI.
     */
    private void printProducts()
    {
        manager.printAllProducts();
    }
    
    /**
     * This code allows the user to deliver products by using the UI.
     */
    private void deliverProducts()
    {
        System.out.println("\nDelivering Products.");
        int id = enterID();
        
        System.out.println("Enter amount");
        String quantity = input.getCommand();
        int amount = Integer.parseInt(quantity);
        
        manager.delivery(id, amount);
    }

    /**
     * executes the choices the user has inputed
     */
    private void executeMenuChoice(String choice)
    {
        if(choice.equals("ADD"))
        {
            addProduct();
        }
        else if(choice.equals("REMOVE"))
        {
            removeProduct();
        }
        else if(choice.equals("PRINTALL"))
        {
            printProducts();
        }
        else if(choice.equals("DELIVER"))
        {
            deliverProducts();
        }
    }

    /**
     * Print out a menu of operation choices
     */
    private void printMenuChoices()
    {
        System.out.println();
        System.out.println("    Add:        Add a new product");
        System.out.println("    Remove:     Remove an old product");
        System.out.println("    PrintAll:   Print all products");
        System.out.println("    Deliver:    Deliver products");
        System.out.println("    Quit:       Quit the program");
        System.out.println();        
    }

    /**
     * Print the title of the program and the authors name
     */
    private void printHeading()
    {
        System.out.println("******************************");
        System.out.println(" Stock Management Application ");
        System.out.println("    App05: by Ronan DeMelo");
        System.out.println("******************************");
    }
}
