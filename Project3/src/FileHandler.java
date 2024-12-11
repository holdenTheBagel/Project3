import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Handles file operations such as reading employee and ticket data, writing work orders,
 * and logging messages. It serves as a utility class for file management in the application.
 * 
 * @author [Holden Case]
 * @version 1.0
 * @since 2024-11-19
 */
public class FileHandler {

	/**
	 * Constructs a new instance of the FileHandler class. 
	 * This class provides utility methods for file operations 
	 * such as reading and writing data, and logging messages.
	 */
	public FileHandler() {
		// Default constructor
	}


	/**
	 * Writes the generated work orders to a specified file.
	 * 
	 * @param workOrderFileName the name of the file to write work order data to.
	 */
	public static void writeData(String workOrderFileName) {
		logger("Writing Work Order Data to File");

		try (PrintWriter writer = new PrintWriter(new FileWriter(workOrderFileName))) {
			// Write header row
			writer.println("customer_id,customer_first_name,customer_last_name,ticket_id,ticket_createdAt,workorder_createdAt,employee_id,employee_first_name,employee_last_name,clocked_in,certification");
			// Write work order data
			for (WorkOrder workOrder : Project3.workOrderList) {
				logger(workOrder.getFileData());
				writer.println(workOrder.getFileData());
			}
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		logger("Work Orders Created. Program Exiting");

	}

	/**
	 * Reads employee data from a specified file and populates the employee list in the Project3 class.
	 * 
	 * @param employeeFileName the name of the file containing employee data.
	 */
	public static void readEmployeeData(String employeeFileName) {
		logger("Loading Employee Data");
		try (BufferedReader reader = new BufferedReader(new FileReader(employeeFileName))) {
			String line = reader.readLine(); // Skip the header row
			while ((line = reader.readLine()) != null) {
				String[] data = line.split(",");
				if (data[8].equalsIgnoreCase("tier2")) {
					Tier2Employee employee = new Tier2Employee(
							data[1], // firstName
							data[2], // lastName
							data[4], // address
							data[5], // phoneNumber
							data[3], // email
							data[0], // employeeId
							data[6], // clockedIn
							data[7],  // hiredDate
							data[9]  // certification
							);
					Project3.employeeList.add(employee);

				} else {
					Employee employee = new Employee(
							data[1], // firstName
							data[2], // lastName
							data[4], // address
							data[5], // phoneNumber
							data[3], // email
							data[0], // employeeId
							data[6], // clockedIn
							data[7]  // hiredDate
							);
					Project3.employeeList.add(employee);
				}
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Reads ticket data from a specified file and returns a linked list of tickets.
	 * 
	 * @param ticketFileName the name of the file containing ticket data.
	 * @return a linked list of tickets read from the file.
	 */
	public static LinkedList<Ticket> readTicketData(String ticketFileName) {
		logger("Loading Ticket Data");
		LinkedList<Ticket> tickets = new LinkedList<>();
		try (BufferedReader reader = new BufferedReader(new FileReader(ticketFileName))) {
			String line = reader.readLine(); // Skip the header row
			while ((line = reader.readLine()) != null) {
				String[] data = line.split(",");
				Customer customer = new Customer(
						data[1], // firstName
						data[2], // lastName
						data[4], // address
						data[5], // phoneNumber
						data[3], // email
						data[0], // customerId
						data[6]  // accountNumber
						);
				Ticket ticket = new Ticket(customer, data[8], data[7]); // createdAt, ticketId
				tickets.add(ticket);
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return tickets;
	}

	/**
	 * Logs a message to both the console and a log file.
	 * 
	 * @param log the message to log.
	 */
	private static void logger(String log) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		Date date = new Date();
		System.out.println(log);
		try (PrintWriter writer = new PrintWriter(new FileWriter("log.txt", true))) {
			writer.println("log : " + dateFormat.format(date) + " : " + log);
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
