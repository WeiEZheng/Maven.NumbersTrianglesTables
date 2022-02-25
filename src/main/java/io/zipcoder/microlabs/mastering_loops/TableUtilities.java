package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        String table="";
        for (int i=1;i<=4;i++){
            for (int j=1; j<=4;j++){
                if (j==1)
                    table=table+"  "+(j*i);
                else
                    table=table+" |  "+(j*i);
            }
            table=table+"\n";
        }
        return table;
    }

    public static String getLargeMultiplicationTable() {
        String table="";
        for (int i=1;i<=9;i++){
            for (int j=1; j<=9;j++){
                if (j==1)
                    table=table+"  "+(j*i);
                else
                    table=table+" |  "+(j*i);
            }
            table=table+"\n";
        }
        return table;
    }

    public static String getMultiplicationTable(int tableSize) {
        String table="";
        for (int i=1;i<=tableSize;i++){
            for (int j=1; j<=tableSize;j++){
                if (j==1)
                    table=table+"  "+(j*i);
                else
                    table=table+" |  "+(j*i);
            }
            table=table+"\n";
        }
        return table;
    }
}
