package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        return getMultiplicationTable(5);
        //Readme says 4 by 4 but sample output is 5 by 5 and same with test
    }

    public static String getLargeMultiplicationTable() {
        return getMultiplicationTable(10);
        //Readme says 9 by 9 but sample output is 10 by 10 and same with test
    }

    public static String getMultiplicationTable(int tableSize) {
        String table="";
        for (int i=1;i<=tableSize;i++){
            for (int j=1; j<=tableSize;j++){
                table=table+String.format("%3d |",j*i);
            }
            table=table+"\n";
        }
        return table;
    }
}
