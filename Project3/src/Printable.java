/**
 * Represents an interface for objects that can provide their data in a 
 * printable, CSV-formatted string.
 * 
 * Classes implementing this interface must define the {@code getFileData()} method.
 * 
 * @author [Holden Case]
 * @version 1.0
 * @since 2024-11-19
 */
public interface Printable {

    /**
     * Returns the data of the implementing class in a CSV-formatted string.
     * 
     * @return a string containing the data in CSV format.
     */
    String getFileData();
}
