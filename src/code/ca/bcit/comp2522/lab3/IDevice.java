package ca.bcit.comp2522.lab3;

/**
 * Represents a generic apple device with a defined purpose. Serves as a base class for more specific devices:
 * {@link IPod}, {@link IPhone16}, and {@link IPad}.
 *
 * @author Ryan Fiset, Larry Lin
 * @version 1.0
 */
public abstract class IDevice
{
    private final String purpose;

    /**
     * Constructs an {@code IDevice} with the specified purpose.
     *
     * @param purpose the intended purpose of this device
     * @throws IllegalArgumentException if {@code purpose} is {@code null} or blank
     */
    IDevice(String purpose)
    {
        Main.validateString(purpose);

        this.purpose = purpose;
    }

    /**
     * Returns the purpose of this device.
     *
     * @return the purpose of this device
     */
    public String getPurpose()
    {
        return purpose;
    }

    /**
     * Prints the details of this device.
     * <p>
     * Subclasses must provide their own implementation to display specific details.
     * </p>
     */
    public abstract void printDetails();
}
