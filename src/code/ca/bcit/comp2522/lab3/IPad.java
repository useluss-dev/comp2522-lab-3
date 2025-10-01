package ca.bcit.comp2522.lab3;

import java.util.Objects;

/**
 * Represents an iPad device designed for learning and educational purposes,
 * with tracking for protective case status and operating system version.
 *
 * <p>
 * Extends {@link IDevice}.
 * </p>
 *
 * <p>
 * This class manages iPad-specific attributes such as whether the device
 * has a protective case and its operating system version. It provides
 * methods for equality comparison, string representation, and data access.
 * </p>
 *
 * @author Ryan Fiset, Larry Lin
 * @version 1.0
 */
public class IPad extends IDevice
{
    private boolean hasCase;
    private String  operatingSystemVersion;

    /**
     * Constructs a new {@code IPad} instance with the specified case status
     * and operating system version.
     *
     * @param hasCase                {@code true} if the iPad has a protective case; {@code false} otherwise
     * @param operatingSystemVersion the version of the operating system installed
     */
    public IPad(final boolean hasCase,
                final String operatingSystemVersion)
    {
        super("learning");
        this.hasCase                = hasCase;
        this.operatingSystemVersion = operatingSystemVersion;
    }

    /**
     * Returns whether this iPad has a protective case.
     *
     * @return {@code true} if it has a case; {@code false} otherwise
     */
    public boolean getHasCase()
    {
        return hasCase;
    }

    /**
     * Sets whether this iPad has a protective case.
     *
     * @param hasCase {@code true} if it has a case; {@code false} otherwise
     */
    public void setHasCase(final boolean hasCase)
    {
        this.hasCase = hasCase;
    }

    /**
     * Returns the operating system version installed on this iPad.
     *
     * @return the OS version string
     */
    public String getOperatingSystemVersion()
    {
        return operatingSystemVersion;
    }

    /**
     * Sets the operating system version for this iPad.
     *
     * @param operatingSystemVersion the new OS version string
     */
    public void setOperatingSystemVersion(final String operatingSystemVersion)
    {
        this.operatingSystemVersion = operatingSystemVersion;
    }

    /**
     * Prints the details of this {@code IPad}, including case status
     * and operating system version.
     */
    @Override
    public void printDetails()
    {
        System.out.println("Have case: " + hasCase);
        System.out.println("Operating System Version: " + operatingSystemVersion);
    }

    /**
     * Returns a string representation of this {@code IPad}, including case status
     * and operating system version.
     *
     * @return a string describing this {@code IPad}
     */
    @Override
    public String toString()
    {
        final StringBuilder builder;

        builder = new StringBuilder();
        builder.append("Has Case: ");
        builder.append(hasCase);
        builder.append(", Operating System Version: ");
        builder.append(operatingSystemVersion);

        return builder.toString();
    }

    /**
     * Compares this {@code IPad} with another object for equality.
     * Two iPads are considered equal if they have the same operating system version.
     *
     * @param obj the object to compare with this iPad
     * @return {@code true} if both objects are {@code IPad} instances with the same operating system version;
     * {@code false} otherwise
     */
    @Override
    public boolean equals(final Object obj)
    {
        final IPad ipad;

        if (this == obj)
        {
            return true;
        }

        if (obj == null || getClass() != obj.getClass())
        {
            return false;
        }

        ipad = (IPad) obj;

        return Objects.equals(operatingSystemVersion, ipad.operatingSystemVersion);
    }

    /**
     * Returns a hash code value for this {@code IPad}, based on the operating system version.
     *
     * @return the hash code value for this {@code IPad}
     */
    @Override
    public int hashCode()
    {
        return Objects.hash(operatingSystemVersion);
    }
}