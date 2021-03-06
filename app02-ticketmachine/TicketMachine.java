/**
 * TicketMachine models a ticket machine that issues
 * flat-fare tickets.
 * The price of a ticket is specified via the constructor.
 * Instances will check to ensure that a user only enters
 * sensible amounts of money, and will only print a ticket
 * if enough money has been input.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 * 
 * Modified by Ronan Demelo
 */
public class TicketMachine
{
    // The price of a ticket from this machine.
    private int price;
    // The amount of money entered by a customer so far.
    private int balance;
    // The total amount of money collected by this machine.
    private int total;
    
    //The amount of money the customer has inserted.
    private int amount;
    
    //Get the information of each ticket from the Ticket class.
    private Ticket ticketToAylesbury;
    private Ticket ticketToAmersham;
    private Ticket ticketToHighWycombe;
    
    //The ticket that the customer has selected.
    private String issuedTicket;
    
    
    /**
     * Create a machine that issues tickets.
     */
    public TicketMachine()
    {
        balance = 0;
        total = 0;
        createTickets();
    }
    
    /**
     * This holds the ticket information so it can be printed out
     * or used to select what ticket you want to buy.
     */
    private void createTickets()
    {
        ticketToAylesbury = new Ticket("Aylesbury", 220);
        ticketToAmersham = new Ticket("Amersham" , 300);
        ticketToHighWycombe = new Ticket("High Wycombe" , 330);
    }
    
    
    /**
     * @Return The price of a ticket.
     */
    public int getPrice()
    {
        return price;
    }

    /**
     * Return The amount of money already inserted for the
     * next ticket.
     */
    public int getBalance()
    {
        return balance;
    }
    
    /**
     * These methods allow the customer to insert coins into the ticket machine.
     */
    public void insertTenP()
    {
        //Adds 10 pence to balance.
        balance = balance + 10;
        
        //Prints out how much balance the user has entered and the total balance.
        System.out.println("Amount added: 10 pence");
        System.out.println("Current Balance: " + balance);
    }
    
    public void insertTwentyP()
    {
        balance = balance + 20;
        System.out.println("Amount added: 20 pence");
        System.out.println("Current Balance: " + balance);
    }
    
    public void insertHundredP()
    {
        balance = balance + 100;
        System.out.println("Amount added: 100 pence");
        System.out.println("Current Balance: " + balance);
    }
    
    public void insertTwoHundredP()
    {
        balance = balance + 200;
        System.out.println("Amount added: 200 pence");
        System.out.println("Current Balance: " + balance);
    }
    
    /**
     * Print a ticket if enough money has been inserted, and
     * reduce the current balance by the ticket price. Print
     * an error message if more money is required.
     */
    public void printTicket()
    {
        if(balance >= price) 
        {
            // Simulate the printing of a ticket.
            System.out.println("##################");
            System.out.println("# The BlueJ Line");
            System.out.println("# Ticket: " + issuedTicket);
            System.out.println("# " + price + " pence");
            System.out.println("##################");
            System.out.println();

            // Update the total collected with the price.
            total = total + price;
            // Reduce the balance by the price.
            balance = balance - price;
        }
        else 
        {
            System.out.println("You must insert at least: " +
                               (price - balance) + " more pence.");
                    
        }
    }
    
    public void printAllTickets()
    /**
     * This will print all the tickets and their price that the customers can buy.
     */
    {
        
        System.out.print("Destination: " + ticketToAylesbury.destination + " ,");
        System.out.println("Price: " + ticketToAylesbury.price + " pence");
        
        System.out.print("Destination: " + ticketToAmersham.destination + " ,");
        System.out.println("Price: " + ticketToAmersham.price + " pence");
        
        System.out.print("Destination: " + ticketToHighWycombe.destination + " ,");
        System.out.println("Price: " + ticketToHighWycombe.price + " pence");
    }
    
    /**
     * This alowes the customer to select what ticket they want to buy.
     */
    public void destination(String stop)
    {
        if (stop == "Aylesbury")
        {
            issuedTicket = ticketToAylesbury.destination;
            price = ticketToAylesbury.price;
        }
        else if (stop == "Amersham")
        {
            issuedTicket = ticketToAmersham.destination;
            price = ticketToAmersham.price;
        }
        else if (stop == "High Wycombe")
        {
            issuedTicket = ticketToHighWycombe.destination;
            price = ticketToHighWycombe.price;
        }
        else
        {
            System.out.println("Please select a valid ticket from All Tickets.");
        }
    }

    /**
     * Return the money in the balance.
     * The balance is cleared.
     */
    public int refundBalance()
    {
        int amountToRefund;
        amountToRefund = balance;
        balance = 0;
        return amountToRefund;
    }
}
