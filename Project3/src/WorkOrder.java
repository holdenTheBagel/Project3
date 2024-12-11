/**
 * Represents a work order, which links an employee to a ticket and records
 * the date and time when the work order was created.
 * 
 * This class implements the Printable interface to provide CSV-formatted data.
 * 
 * @author [Holden Case]
 * @version 1.0
 * @since 2024-11-19
 */
public class WorkOrder implements Printable {

    /**
     * The employee assigned to the work order.
     */
    private Employee employee;

    /**
     * The ticket associated with the work order.
     */
    private Ticket ticket;

    /**
     * The date and time when the work order was created.
     */
    private String createdAt;

    /**
     * Constructs a new WorkOrder with the specified employee, ticket, and creation time.
     * 
     * @param employee  the employee assigned to the work order.
     * @param ticket    the ticket associated with the work order.
     * @param createdAt the date and time when the work order was created.
     */
    public WorkOrder(Employee employee, Ticket ticket, String createdAt) {
        this.employee = employee;
        this.ticket = ticket;
        this.createdAt = createdAt;
    }

    /**
     * Gets the employee assigned to the work order.
     * 
     * @return the employee.
     */
    public Employee getEmployee() {
        return employee;
    }

    /**
     * Sets the employee assigned to the work order.
     * 
     * @param employee the new employee.
     */
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    /**
     * Gets the ticket associated with the work order.
     * 
     * @return the ticket.
     */
    public Ticket getTicket() {
        return ticket;
    }

    /**
     * Sets the ticket associated with the work order.
     * 
     * @param ticket the new ticket.
     */
    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    /**
     * Gets the date and time when the work order was created.
     * 
     * @return the creation date and time.
     */
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * Sets the date and time when the work order was created.
     * 
     * @param createdAt the new creation date and time.
     */
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Returns a CSV-formatted string containing ticket data, creation date,
     * and employee data.
     * 
     * @return a string formatted as "ticketData,createdAt,employeeData".
     */
    @Override
    public String getFileData() {
        return ticket.getFileData() + "," + createdAt + "," + employee.getFileData();
    }
}
