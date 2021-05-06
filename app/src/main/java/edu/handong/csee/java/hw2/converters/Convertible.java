package edu.handong.csee.java.hw2.converters;

/**
 * This is an interface that sets guideline for all converters.
 * @author JC
 */
public interface Convertible {
    /**
     * This is a guide method to encapsulate input value.
     * @param fromValue input value
     */
    public void setFromValue(double fromValue);

    /**
     * This is a guide method to access encapsulated value
     * @return encapsulated value
     */
    public double getConvertedValue();

    /**
     * This is a guide method to convert
     */
    public void convert();

}