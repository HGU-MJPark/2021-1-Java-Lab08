package edu.handong.csee.java.hw2.converters;

/**
 * This is a class that converts 'Ton' to 'G'
 */
public class TONToGConverter implements Convertible{
    
    private double value = 0;

    /**
     * This is a method that sets fromValue.
     */
    public void setFromValue(double fromValue) {
        value = fromValue;
    }
    /**
     * This is a method that gets value changed.
     */
    public double getConvertedValue() {
        return value;
    }
    /**
     * This is a method that converts value.
     */
    public void convert() {
        value *= 1000000; 
    }
}
