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
        String numbers=""; //the parameter for getRange is stop based on readme
        for (int i=0;i<start;i++){
            numbers = numbers + i;
        }
        return numbers;
    }

    public static String getRange(int start, int stop) {
        String numbers="";
        for (int i=start;i<stop;i++){
            numbers = numbers + i;
        }
        return numbers;
    }


    public static String getRange(int start, int stop, int step) {
        String numbers="";
        for (int i=start;i<stop;i+=step){
            numbers = numbers + i;
        }
        return numbers;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String powernumber ="";
        int storage;
        for (int i=start;i<stop;i+=step){
            storage = (int) Math.pow(i,exponent);
            powernumber = powernumber + storage;
        }
        return powernumber;
    }
}
