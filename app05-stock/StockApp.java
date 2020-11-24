
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

    /**
     * 
     */
    private void addProduct(Product item)
    {
        
    }

    /**
     * 
     */
    private void removeProduct(int id)
    {
        manager.removeProduct(id);
    }

    /**
     * 
     */
    private void printProducts()
    {
        manager.printAllProducts();
    }

    /**
     * executes the choices the user has inputed
     */
    private void executeMenuChoice(String choice)
    {
        if(choice.equals("ADD"))
        {
            
        }
        else if(choice.equals("REMOVE"))
        {
            
        }
        else if(choice.equals("PRINTALL"))
        {
            printProducts();
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
