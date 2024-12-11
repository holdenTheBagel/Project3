/**
 * Represents a person with basic contact information. This class serves as a 
 * base for other classes that extend its functionality.
 * 
 * @author [Holden Case]
 * @version 1.0
 * @since 2024-11-19
 */
public class Person implements Printable {

	/**
	 * General information applicable to any person.
	 */
	private String firstName;	
	private String lastName;	
	private String address;	
	private String phoneNumber;
	private String email;

	/**
	 * Constructs a new Person with the specified details.
	 * 
	 * @param firstName   the first name of the person.
	 * @param lastName    the last name of the person.
	 * @param address     the address of the person.
	 * @param phoneNumber the phone number of the person.
	 * @param email       the email address of the person.
	 */
	public Person(String firstName, String lastName, String address, String phoneNumber, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}

	/**
	 * Gets the first name of the person.
	 * 
	 * @return the first name.
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Sets the first name of the person.
	 * 
	 * @param firstName the new first name.
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Gets the last name of the person.
	 * 
	 * @return the last name.
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Sets the last name of the person.
	 * 
	 * @param lastName the new last name.
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Gets the address of the person.
	 * 
	 * @return the address.
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * Sets the address of the person.
	 * 
	 * @param address the new address.
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * Gets the phone number of the person.
	 * 
	 * @return the phone number.
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * Sets the phone number of the person.
	 * 
	 * @param phoneNumber the new phone number.
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * Gets the email address of the person.
	 * 
	 * @return the email address.
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Sets the email address of the person.
	 * 
	 * @param email the new email address.
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Returns a CSV-formatted string containing the first and last name of the person.
	 * 
	 * @return a string formatted as "firstName,lastName".
	 */
	@Override
	public String getFileData() {
		return firstName + "," + lastName;
	}
}
