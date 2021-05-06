package edu.handong.csee.java.hw2.converters;

/**
 * This is a class to convert KM value to M value.
 * @author Hyunwoo Chang
 */
public class KMToMConverter implements Convertible{
    private double value;

    /**
     * This is an encapsulation method to set input value
     * @param fromValue Input value to be converted
     */
    public void setFromValue(double fromValue){
        value = fromValue;
    }

    /**
     * This is a method to access the encapsulated input value.
     */
    public double getConvertedValue(){

        return value;
    }

    /**
     * This is a method to convert KM value to M.
     */
    public void convert(){
        value *= 1000;
    }
}
