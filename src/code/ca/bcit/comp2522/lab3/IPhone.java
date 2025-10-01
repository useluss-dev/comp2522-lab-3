package ca.bcit.comp2522.lab3;

import java.util.Objects;

/**
 * Represents an iPhone device with cellular capabilities, including
 * tracking remaining call minutes and carrier information.
 *
 * <p>
 * Extends {@link IDevice}.
 * </p>
 *
 * <p>
 * This class manages phone-specific attributes such as the number of
 * minutes remaining on a phone plan and the carrier service provider.
 * It provides methods for equality comparison, string representation,
 * and data access.
 * </p>
 *
 * @author Ryan Fiset, Larry Lin
 * @version 1.0
 */
public class IPhone extends IDevice
{
    private double minutesRemaining;
    private String carrier;

    /**
     * Constructs a new {@code IPhone} instance with the specified minutes remaining
     * and carrier information.
     *
     * @param minutesRemaining the number of minutes remaining on the phone plan
     * @param carrier          the name of the carrier service provider
     */
    public IPhone(final double minutesRemaining,
                  final String carrier)
    {
        super("talking");
        this.minutesRemaining = minutesRemaining;
        this.carrier          = carrier;
    }

    /**
     * Returns the number of minutes remaining on the phone plan.
     *
     * @return the minutes remaining
     */
    public double getMinutesRemaining()
    {
        return minutesRemaining;
    }

    /**
     * Sets the number of minutes remaining on the phone plan.
     *
     * @param minutesRemaining the new minutes remaining
     */
    public void setMinutesRemaining(final double minutesRemaining)
    {
        this.minutesRemaining = minutesRemaining;
    }

    /**
     * Returns the carrier name.
     *
     * @return the carrier string
     */
    public String getCarrier()
    {
        return carrier;
    }

    /**
     * Sets the carrier name.
     *
     * @param carrier the new carrier string
     */
    public void setCarrier(final String carrier)
    {
        this.carrier = carrier;
    }

    /**
     * Prints the details of this {@code IPhone}, including minutes remaining
     * and carrier information.
     */
    @Override
    public void printDetails()
    {
        System.out.println("Minutes Remaining: " + minutesRemaining);
        System.out.println("Carrier: " + carrier);
    }

    /**
     * Returns a string representation of this {@code IPhone}, including minutes
     * remaining and carrier information.
     *
     * @return a string describing this {@code IPhone}
     */
    @Override
    public String toString()
    {
        final StringBuilder builder;

        builder = new StringBuilder();
        builder.append("Minutes Remaining: ");
        builder.append(minutesRemaining);
        builder.append(", Carrier: ");
        builder.append(carrier);

        return builder.toString();
    }

    /**
     * Compares this {@code IPhone} with another object for equality.
     * Two iPhones are considered equal if they have the same number of minutes remaining.
     *
     * @param obj the object to compare with this iPhone
     * @return {@code true} if both objects are {@code IPhone} instances with the same minutes remaining;
     * {@code false} otherwise
     */
    @Override
    public boolean equals(final Object obj)
    {
        final IPhone iphone;

        if (this == obj)
        {
            return true;
        }

        if (obj == null || getClass() != obj.getClass())
        {
            return false;
        }

        iphone = (IPhone) obj;

        return iphone.minutesRemaining == minutesRemaining;
    }

    /**
     * Returns a hash code value for this {@code IPhone}, based on the minutes remaining.
     *
     * @return the hash code value for this {@code IPhone}
     */
    @Override
    public int hashCode()
    {
        return Objects.hash(minutesRemaining);
    }
}