package edu.handong.csee.java.hw2.converters;

/**
 * This is a class of AllConverter that converts KM to M and MILE, or TON to G and KG.
 * @author Hyunwoo Chang
 */
public class AllConverter {
    private double value;
    private String measure;

    private double MValue;
    private double MILEValue;
    private double GValue;
    private double KGValue;

    /**
     * This is an encapsulation method to set Input value.
     * @param fromValue  Input Value to be converted
     * @return this class to use method chaining 
     */
    public AllConverter setFromValue(double fromValue){
        value = fromValue;
        return this;
    }

    /**
     * This is an encapsulation method to set what measure it is converting from
     * @param originalMeasure  Input measure from which this class will convert
     * @return this class to use method chaining
     */
    public AllConverter setOriginalMeasure(String originalMeasure){
        measure = originalMeasure;
        return this;
    }

    /**
     * This is a method to convert TON or KM value to corresponding values.
     */
    public void convertAndPrintOut(){
        if(measure.equals("TON"))
        {
            KGValue = value * 1000;
            System.out.println(value + " TON to " + KGValue + " KG");
            System.out.println(value + " TON to " + value * 1000000 + " G");
        }
        else if(measure.equals("KM"))
        {
            MValue = value * 1000;
            MILEValue = value/1.6;
            System.out.println(value + " KM to " + MValue + " M");
            System.out.println(value + " KM to " + MILEValue + " MILE");
        }
        else{
            System.out.println("This measure is not supported by AllConverter!");
        }
        
    }
}
