package ca.bcit.comp2522.lab3;

/**
 * Represents an iPod device capable of storing songs and playing music
 * at a specific maximum volume level.
 *
 * <p>
 * Extends {@link IDevice}.
 * </p>
 *
 * <p>
 * This class includes validation for the number of stored songs and
 * maximum volume decibels, ensuring values remain within safe and logical
 * thresholds. It also provides methods for equality comparison, string
 * representation, and data access.
 * </p>
 *
 * @author Ryan Fiset, Larry Lin
 * @version 1.0
 */
public class IPod extends IDevice
{
    // --- Validation Constants ---
    private final static int    MIN_STORED_SONGS              = 0;
    private final static double DECIBEL_VOLUME_PAIN_THRESHOLD = 120.0;
    private final static double MIN_VOLUME_DECIBELS           = 0.0;

    private final double maxVolumeDecibels;
    private       int    numStoredSongs;

    /**
     * Constructs a new {@code IPod} instance with the specified number of stored songs
     * and maximum volume level.
     *
     * @param numStoredSongs    the number of songs initially stored on the iPod
     * @param maxVolumeDecibels the maximum volume (in decibels) the device can reach
     * @throws IllegalArgumentException if {@code numStoredSongs} is negative or
     *                                  {@code maxVolumeDecibels} is outside the valid range
     */
    public IPod(final int numStoredSongs,
                final double maxVolumeDecibels)
    {
        super("music");

        validateNumSongs(numStoredSongs);
        validateMaxVolumeDecibels(maxVolumeDecibels);

        this.numStoredSongs    = numStoredSongs;
        this.maxVolumeDecibels = maxVolumeDecibels;
    }

    /**
     * Prints the details of this {@code IPod}, including the number of stored songs
     * and maximum volume decibels.
     */
    @Override
    public void printDetails()
    {
        System.out.println("Number of stored songs: " + numStoredSongs);
        System.out.println("Maximum volume decibels: " + maxVolumeDecibels);
    }

    /**
     * Returns a string representation of this {@code IPod}, including stored songs
     * and maximum volume information.
     *
     * @return a string describing this {@code IPod}
     */
    @Override
    public String toString()
    {
        final StringBuilder builder;

        builder = new StringBuilder();
        builder.append("Number of stored songs: ");
        builder.append(numStoredSongs);
        builder.append(", Maximum volume decibels: ");
        builder.append(maxVolumeDecibels);

        return builder.toString();
    }

    /**
     * Compares this {@code IPod} with another object for equality.
     * Two iPods are considered equal if they store the same number of songs.
     *
     * @param obj the object to compare with this iPod
     * @return {@code true} if both objects are {@code IPod} instances with the same number of stored songs;
     * {@code false} otherwise
     */
    @Override
    public boolean equals(final Object obj)
    {
        if (this == obj)
        {
            return true;
        }

        if (!(obj instanceof IPod))
        {
            return false;
        }

        IPod ipod;
        ipod = (IPod) obj;

        return this.numStoredSongs == ipod.numStoredSongs;
    }

    /**
     * Returns a hash code value for this {@code IPod}, based on the number of stored songs.
     *
     * @return the hash code value for this {@code IPod}
     */
    @Override
    public int hashCode()
    {
        return Integer.hashCode(numStoredSongs);
    }

    /**
     * Validates that the number of songs is non-negative.
     *
     * @param numSongs the number of songs to validate
     * @throws IllegalArgumentException if {@code numSongs} is negative
     */
    private static void validateNumSongs(final int numSongs)
    {
        if (numSongs < MIN_STORED_SONGS)
        {
            throw new IllegalArgumentException("Number of songs cannot be negative");
        }
    }

    /**
     * Validates that the maximum volume in decibels is within a reasonable and safe range.
     * <p>
     * The value must be between {@value #MIN_VOLUME_DECIBELS} and {@value #DECIBEL_VOLUME_PAIN_THRESHOLD}.
     * </p>
     *
     * @param maxVolumeDecibels the maximum volume to validate
     * @throws IllegalArgumentException if the value is less than {@value #MIN_VOLUME_DECIBELS}
     *                                  or greater than {@value #DECIBEL_VOLUME_PAIN_THRESHOLD}
     */
    private static void validateMaxVolumeDecibels(final double maxVolumeDecibels)
    {
        /*
        Decibels here cannot be negative because `maxVolumeDecibels` is not based on a reference point. And it
        would be a bad idea to have it higher than 120 because 120-140dB is when sound will begin to cause damage
        to most peoples ears.
         */
        if (maxVolumeDecibels < MIN_VOLUME_DECIBELS || maxVolumeDecibels > DECIBEL_VOLUME_PAIN_THRESHOLD)
        {
            throw new IllegalArgumentException("Max volume decibels cannot be less than " + MIN_VOLUME_DECIBELS);
        }
    }

    /**
     * Returns the number of songs currently stored on this {@code IPod}.
     *
     * @return the number of stored songs
     */
    public int getNumStoredSongs()
    {
        return numStoredSongs;
    }

    /**
     * Returns the maximum volume level (in decibels) for this {@code IPod}.
     *
     * @return the maximum volume in decibels
     */
    public double getMaxVolumeDecibels()
    {
        return maxVolumeDecibels;
    }

    /**
     * Adds the specified number of songs to the current count.
     *
     * @param numSongs the number of songs to add
     * @throws IllegalArgumentException if {@code numSongs} is negative
     */
    public void addSongs(final int numSongs)
    {
        validateNumSongs(numSongs);
        numStoredSongs += numSongs;
    }
}
