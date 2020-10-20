import java.util.Date;
/**
 * This class hold the information about all the tickets and their prices.
 *
 * @author Ronan DeMelo
 * @version 12/10/2020
 */
public class Ticket
{
    //The Location of where the ticket will take you.
    public String destination;
    
    // How much the ticket costs in pence.
    public int price;
    
    //This add the date of when the ticket was purched.
    private Date datePruchased;
    
    /**
     * This creats the ticket. When a ticket is created it will
     * ask you need to ass the destination and price of the ticket.
     */
    public Ticket(String ticketName, int price)
    {
        this.destination = ticketName;
        this.price = price;
        datePruchased = new Date();
    }
}
