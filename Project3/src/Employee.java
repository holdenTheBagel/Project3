/**
 * Represents an employee, extending the basic details of a person with additional
 * information specific to employees such as employee ID, clock-in status, and hire date.
 * 
 * @author [Holden Case]
 * @version 1.0
 * @since 2024-11-19
 */
public class Employee extends Person {

	/**
	 * The unique variables for the employee.
	 */
	private String employeeId;
	private String clockedIn;
	private String hiredDate;

	/**
	 * Constructs a new Employee with the specified details.
	 * 
	 * @param firstName   the first name of the employee.
	 * @param lastName    the last name of the employee.
	 * @param address     the address of the employee.
	 * @param phoneNumber the phone number of the employee.
	 * @param email       the email address of the employee.
	 * @param employeeId  the unique identifier for the employee.
	 * @param clockedIn   the clock-in status of the employee.
	 * @param hiredDate   the date the employee was hired.
	 */
	public Employee(String firstName, String lastName, String address, String phoneNumber, String email,
			String employeeId, String clockedIn, String hiredDate) {
		super(firstName, lastName, address, phoneNumber, email);
		this.employeeId = employeeId;
		this.clockedIn = clockedIn;
		this.hiredDate = hiredDate;
	}

	/**
	 * Gets the employee ID.
	 * 
	 * @return the employee ID.
	 */
	public String getEmployeeId() {
		return employeeId;
	}

	/**
	 * Sets the employee ID.
	 * 
	 * @param employeeId the new employee ID.
	 */
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	/**
	 * Gets the clock-in status of the employee.
	 * 
	 * @return the clock-in status.
	 */
	public String getClockedIn() {
		return clockedIn;
	}

	/**
	 * Sets the clock-in status of the employee.
	 * 
	 * @param clockedIn the new clock-in status.
	 */
	public void setClockedIn(String clockedIn) {
		this.clockedIn = clockedIn;
	}

	/**
	 * Gets the hire date of the employee.
	 * 
	 * @return the hire date.
	 */
	public String getHiredDate() {
		return hiredDate;
	}

	/**
	 * Sets the hire date of the employee.
	 * 
	 * @param hiredDate the new hire date.
	 */
	public void setHiredDate(String hiredDate) {
		this.hiredDate = hiredDate;
	}

	/**
	 * Returns a CSV-formatted string containing the employee's ID, full name, and clock-in status.
	 * 
	 * @return a string formatted as "employeeId,firstName,lastName,clockedIn".
	 */
	@Override
	public String getFileData() {
		return employeeId + "," + super.getFileData() + "," + clockedIn;
	}
}
