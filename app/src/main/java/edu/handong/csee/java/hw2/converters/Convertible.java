package edu.handong.csee.java.hw2.converters;

/**
 * This is interface that sets, gets and converts a value.
 */
public interface Convertible {

    /**
     * This is a method that sets fromValue.
     * @param fromValue
     */
    public void setFromValue(double fromValue);

    /**
     * This is a method that gets a value changed.
     * @return
     */
    public double getConvertedValue();

    /**
     * This is a method that converts a value.
     */
    public void convert();

}