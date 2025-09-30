package ca.bcit.comp2522.lab3;

import java.util.Objects;

/**
 * Represents an iPhone 16 device with advanced features including
 * high-resolution camera capabilities and enhanced memory capacity.
 *
 * <p>
 * Extends {@link IPhone}.
 * </p>
 *
 * <p>
 * This class adds iPhone 16-specific features such as high-resolution camera
 * support and configurable memory size in gigabytes. It inherits basic phone
 * functionality from the IPhone class and provides methods for equality
 * comparison, string representation, and data access.
 * </p>
 *
 * @author Ryan Fiset, Larry Lin
 * @version 1.0
 */
public class IPhone16 extends IPhone
{
    private boolean highResolutionCamera;
    private int gigabytesOfMemory;

    /**
     * Constructs a new {@code IPhone16} instance with the specified minutes remaining,
     * carrier, camera capabilities, and memory size.
     *
     * @param minutesRemaining      the number of minutes remaining on the phone plan
     * @param carrier               the name of the carrier service provider
     * @param highResolutionCamera  {@code true} if the device has a high-resolution camera; {@code false} otherwise
     * @param gigabytesOfMemory     the amount of memory in gigabytes
     */
    public IPhone16(final double minutesRemaining, final String carrier,
                    final boolean highResolutionCamera, final int gigabytesOfMemory)
    {
        super(minutesRemaining, carrier);
        this.highResolutionCamera = highResolutionCamera;
        this.gigabytesOfMemory = gigabytesOfMemory;
    }

    /**
     * Returns whether this iPhone 16 has a high-resolution camera.
     *
     * @return {@code true} if it has a high-resolution camera; {@code false} otherwise
     */
    public boolean isHighResolutionCamera()
    {
        return highResolutionCamera;
    }

    /**
     * Sets whether this iPhone 16 has a high-resolution camera.
     *
     * @param highResolutionCamera {@code true} if it has a high-resolution camera; {@code false} otherwise
     */
    public void setHighResolutionCamera(final boolean highResolutionCamera)
    {
        this.highResolutionCamera = highResolutionCamera;
    }

    /**
     * Returns the amount of memory in gigabytes.
     *
     * @return the memory in gigabytes
     */
    public int getGigabytesOfMemory()
    {
        return gigabytesOfMemory;
    }

    /**
     * Sets the amount of memory in gigabytes.
     *
     * @param gigabytesOfMemory the new memory in gigabytes
     */
    public void setGigabytesOfMemory(final int gigabytesOfMemory)
    {
        this.gigabytesOfMemory = gigabytesOfMemory;
    }

    /**
     * Prints the details of this {@code IPhone16}, including minutes remaining,
     * carrier, camera capabilities, and memory size.
     */
    @Override
    public void printDetails()
    {
        System.out.println("Minutes Remaining: " + getMinutesRemaining());
        System.out.println("Carrier: " + getCarrier());
        System.out.println("High Resolution Camera: " + highResolutionCamera);
        System.out.println("Gigabytes of Memory: " + gigabytesOfMemory + " GB");
    }

    /**
     * Returns a string representation of this {@code IPhone16}, including all inherited
     * properties from IPhone plus camera and memory information.
     *
     * @return a string describing this {@code IPhone16}
     */
    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder(super.toString());

        builder.append(", High Resolution Camera: ").append(highResolutionCamera);
        builder.append(", Gigabytes of Memory: ").append(gigabytesOfMemory).append(" GB");

        return builder.toString();
    }

    /**
     * Compares this {@code IPhone16} with another object for equality.
     * Two iPhone 16 devices are considered equal if they have the same minutes remaining
     * and the same camera resolution capability.
     *
     * @param obj the object to compare with this iPhone 16
     * @return {@code true} if both objects are {@code IPhone16} instances with the same
     *         minutes remaining and camera resolution; {@code false} otherwise
     */
    @Override
    public boolean equals(final Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj == null || getClass() != obj.getClass())
        {
            return false;
        }
        final IPhone16 iphone16;
        iphone16 = (IPhone16) obj;

        return iphone16.getMinutesRemaining() == getMinutesRemaining() &&
               highResolutionCamera == iphone16.highResolutionCamera;
    }

    /**
     * Returns a hash code value for this {@code IPhone16}, based on the minutes remaining
     * and camera resolution capability.
     *
     * @return the hash code value for this {@code IPhone16}
     */
    @Override
    public int hashCode()
    {
        return Objects.hash(getMinutesRemaining(), highResolutionCamera);
    }
}