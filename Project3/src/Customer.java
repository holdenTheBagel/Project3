/**
 * Represents a customer, extending the basic details of a person with additional
 * customer-specific information such as customer ID and account number.
 * 
 * @author [Holden Case]
 * @version 1.0
 * @since 2024-11-19
 */
public class Customer extends Person {

    /**
     * The unique variables associated with the customer.
     */
    private String customerId;
    private String accountNumber;

    /**
     * Constructs a new Customer with the specified details.
     * 
     * @param firstName     the first name of the customer.
     * @param lastName      the last name of the customer.
     * @param address       the address of the customer.
     * @param phoneNumber   the phone number of the customer.
     * @param email         the email address of the customer.
     * @param customerId    the unique identifier for the customer.
     * @param accountNumber the account number associated with the customer.
     */
    public Customer(String firstName, String lastName, String address, String phoneNumber, String email,
                    String customerId, String accountNumber) {
        super(firstName, lastName, address, phoneNumber, email);
        this.customerId = customerId;
        this.accountNumber = accountNumber;
    }

    /**
     * Gets the customer ID.
     * 
     * @return the customer ID.
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * Sets the customer ID.
     * 
     * @param customerId the new customer ID.
     */
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    /**
     * Gets the account number of the customer.
     * 
     * @return the account number.
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the account number of the customer.
     * 
     * @param accountNumber the new account number.
     */
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * Returns a CSV-formatted string containing the customer's ID and full name.
     * 
     * @return a string formatted as "customerId,firstName,lastName".
     */
    @Override
    public String getFileData() {
        return customerId + "," + super.getFileData();
    }
}
