package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        String evennumbers="";
        for (int i=start;i<stop;i++){
            if (i%2==0){
                evennumbers = evennumbers + i;
            }
        }
        return evennumbers;
    }


    public static String getOddNumbers(int start, int stop) {
        String oddnumbers="";
        for (int i=start;i<stop;i++){
            if (i%2==1){
                oddnumbers = oddnumbers + i;
            }
        }
        return oddnumbers;
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        String squarednumber ="";
        int storage;
        for (int i=start;i<stop;i+=step){
            storage = (int) Math.pow(i,2);
            squarednumber = squarednumber + storage;
            }
        return squarednumber;
    }

    public static String getRange(int start) {
        return null;
    }

    public static String getRange(int start, int stop) {
        return null;
    }


    public static String getRange(int start, int stop, int step) {
        return null;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        return null;
    }
}
