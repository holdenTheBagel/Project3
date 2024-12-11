import java.util.*;

/**
 * This class represents the main logic for the Project 3 Work Order Generator.
 * It handles reading employee and ticket data, creating work orders, and writing them to a file.
 * 
 * @author [Holden Case]
 * @version 1.0
 * @since 2024-11-19
 */
public class Project3 {

	/**
	 * Constructs a new instance of the Project3 class. 
	 * This is the entry point for the application and is primarily used 
	 * to execute the main method.
	 */
	public Project3() {
		// Default constructor
	}

	/**
	 * Name of the file containing employee data.
	 */
	public static String employeeFileName = "employee_data.csv";

	/**
	 * Name of the file containing Tier 1 ticket data.
	 */
	public static String tier1TicketFileName = "tier1_ticket_data.csv";

	/**
	 * Name of the file containing Tier 2 ticket data.
	 */
	public static String tier2TicketFileName = "tier2_ticket_data.csv";

	/**
	 * Name of the file where work orders will be written.
	 */
	public static String workOrderFileName = "workorder_data.csv";

	/**
	 * List of all employees read from the file.
	 */
	public static ArrayList<Employee> employeeList = new ArrayList<Employee>();

	/**
	 * Queue containing Tier 1 tickets.
	 */
	public static Queue<Ticket> tier1TicketList;

	/**
	 * Queue containing Tier 2 tickets.
	 */
	public static Queue<Ticket> tier2TicketList;

	/**
	 * List of all generated work orders.
	 */
	public static ArrayList<WorkOrder> workOrderList = new ArrayList<WorkOrder>();
	/**
	 * Main method that serves as the entry point of the program. It initializes
	 * the work order generation process by reading employee and ticket data,
	 * creating work orders, and writing the output to a file.
	 *
	 * @param args Command-line arguments (not used in this application).
	 */
	public static void main(String[] args) {
		System.out.println("Project 3 Work Order Generator\n");	
		// Read employee and ticket data:
		FileHandler.readEmployeeData(employeeFileName);
		tier1TicketList = FileHandler.readTicketData(tier1TicketFileName);
		tier2TicketList = FileHandler.readTicketData(tier2TicketFileName);		
		// Logic to create, distribute and write work orders to file:
		createWorkOrders();
		FileHandler.writeData(workOrderFileName);
	}

	/**
	 * Creates work orders by assigning tickets to employees.
	 * Tier 2 tickets are assigned first to Tier 2 employees, followed by
	 * assigning Tier 1 tickets to remaining employees.
	 */
	public static void createWorkOrders() {
		// Process Tier 2 tickets
		while (!tier2TicketList.isEmpty()) {
			for (Employee employee : employeeList) {
				if (employee instanceof Tier2Employee && !tier2TicketList.isEmpty()) {
					Ticket ticket = tier2TicketList.poll();
					WorkOrder workOrder = new WorkOrder(employee, ticket, new Date().toString());
					workOrderList.add(workOrder);
				}
			}
		}
		// Process Tier 1 tickets
		while (!tier1TicketList.isEmpty()) {
			for (Employee employee : employeeList) {
				if (!(employee instanceof Tier2Employee) && !tier1TicketList.isEmpty()) {
					Ticket ticket = tier1TicketList.poll();
					WorkOrder workOrder = new WorkOrder(employee, ticket, new Date().toString());
					workOrderList.add(workOrder);
				}
			}
		}
	}

}
