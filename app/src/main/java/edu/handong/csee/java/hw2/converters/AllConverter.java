package edu.handong.csee.java.hw2.converters;

/**
 * This is a class that sets fromvalue and originalMeasure.
 * Also It converts fromvalue to what user wants to change and prints (a) result(s).
 */
public class AllConverter {

    private double value = 0;
    private double fromValue = 0;
    private String measure;

    /**
     * This is a method that sets fromValue.
     * @param fromValue
     * @return
     */
    public AllConverter setFromValue(double fromValue) {
        this.fromValue = fromValue;
        value = fromValue;
        return this;
    }

    /**
     * This is a method that sets originalMeasure.
     * @param originalMeasure
     * @return
     */
    public AllConverter setOriginalMeasure(String originalMeasure) {
        this.measure = originalMeasure;
        return this;
    }

    /**
     * This is a method that converts a fromvalue and prints the result(s).
     */
    public void convertAndPrintOut() {
        
        if(measure.equals("KM")) {

            KMToMConverter kmToMConverter = new KMToMConverter();
            kmToMConverter.setFromValue(fromValue);
            kmToMConverter.convert();
            value = kmToMConverter.getConvertedValue();
            System.out.println(fromValue + " " + measure + " to " + value + " M");

            KMToMILEConverter kmToMILEConverter = new KMToMILEConverter();
            kmToMILEConverter.setFromValue(fromValue);
            kmToMILEConverter.convert();
            value = kmToMILEConverter.getConvertedValue();
            System.out.println(fromValue + " " + measure + " to " + value + " MILE");
        }
        else if(measure.equals("MILE")) {
            MILEToKMConverter mileToKMConverter = new MILEToKMConverter();
            mileToKMConverter.setFromValue(fromValue);
            mileToKMConverter.convert();
            value = mileToKMConverter.getConvertedValue();
            System.out.println(fromValue + " " + measure + " to " + value + " KM");
        }
        else if(measure.equals("M") || measure.equals("G") || measure.equals("KG")){
            System.out.println("AllConverter cannot support the measure!");
        }
        else {
            TONToKGConverter tonToKGConverter = new TONToKGConverter();
            tonToKGConverter.setFromValue(fromValue);
            tonToKGConverter.convert();
            value = tonToKGConverter.getConvertedValue();
            System.out.println(fromValue + " " + measure + " to " + value + " KG");

            TONToGConverter tonToGConverter = new TONToGConverter();
            tonToGConverter.setFromValue(fromValue);
            tonToGConverter.convert();
            value = tonToGConverter.getConvertedValue();
            System.out.println(fromValue + " " + measure + " to " + value + " G");

        }

    }

    
}
