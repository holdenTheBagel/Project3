/**
 * Represents a Tier 2 employee, extending the Employee class with additional
 * information such as the employee's certification.
 * 
 * Tier 2 employees handle advanced tasks that require specific certifications.
 * 
 * @author [Holden Case]
 * @version 1.0
 * @since 2024-11-19
 */
public class Tier2Employee extends Employee {

    /**
     * The certification held by the Tier 2 employee.
     */
    private String certification;

    /**
     * Constructs a new Tier2Employee with the specified details.
     * 
     * @param firstName     the first name of the employee.
     * @param lastName      the last name of the employee.
     * @param address       the address of the employee.
     * @param phoneNumber   the phone number of the employee.
     * @param email         the email address of the employee.
     * @param employeeId    the unique identifier for the employee.
     * @param clockedIn     the clock-in status of the employee.
     * @param hiredDate     the hire date of the employee.
     * @param certification the certification held by the Tier 2 employee.
     */
    public Tier2Employee(String firstName, String lastName, String address, String phoneNumber, String email,
                         String employeeId, String clockedIn, String hiredDate, String certification) {
        super(firstName, lastName, address, phoneNumber, email, employeeId, clockedIn, hiredDate);
        this.certification = certification;
    }

    /**
     * Gets the certification held by the Tier 2 employee.
     * 
     * @return the certification.
     */
    public String getCertification() {
        return certification;
    }

    /**
     * Sets the certification held by the Tier 2 employee.
     * 
     * @param certification the new certification.
     */
    public void setCertification(String certification) {
        this.certification = certification;
    }

    /**
     * Returns a CSV-formatted string containing the employee's ID, full name, 
     * clock-in status, and certification.
     * 
     * @return a string formatted as "employeeId,firstName,lastName,clockedIn,certification".
     */
    @Override
    public String getFileData() {
        return super.getFileData() + "," + certification;
    }
}
