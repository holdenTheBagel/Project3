/**
 * Represents a ticket, which is associated with a customer and includes 
 * details such as the ticket ID and the creation date.
 * 
 * This class implements the Printable interface to provide CSV-formatted data.
 * 
 * @author [Holden Case]
 * @version 1.0
 * @since 2024-11-19
 */
public class Ticket implements Printable {

    /**
     * The customer associated with the ticket.
     */
    private Customer customer;

    /**
     * The date and time when the ticket was created.
     */
    private String createdAt;

    /**
     * The unique identifier for the ticket.
     */
    private String ticketId;

    /**
     * Constructs a new Ticket with the specified customer, creation date, and ticket ID.
     * 
     * @param customer  the customer associated with the ticket.
     * @param createdAt the date and time when the ticket was created.
     * @param ticketId  the unique identifier for the ticket.
     */
    public Ticket(Customer customer, String createdAt, String ticketId) {
        this.customer = customer;
        this.createdAt = createdAt;
        this.ticketId = ticketId;
    }

    /**
     * Gets the customer associated with the ticket.
     * 
     * @return the customer.
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * Sets the customer associated with the ticket.
     * 
     * @param customer the new customer.
     */
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    /**
     * Gets the date and time when the ticket was created.
     * 
     * @return the creation date and time.
     */
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * Sets the date and time when the ticket was created.
     * 
     * @param createdAt the new creation date and time.
     */
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Gets the unique identifier for the ticket.
     * 
     * @return the ticket ID.
     */
    public String getTicketId() {
        return ticketId;
    }

    /**
     * Sets the unique identifier for the ticket.
     * 
     * @param ticketId the new ticket ID.
     */
    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    /**
     * Returns a CSV-formatted string containing customer data, ticket ID,
     * and creation date.
     * 
     * @return a string formatted as "customerData,ticketId,createdAt".
     */
    @Override
    public String getFileData() {
        return this.customer.getFileData() + "," + ticketId + "," + createdAt;
    }
}
