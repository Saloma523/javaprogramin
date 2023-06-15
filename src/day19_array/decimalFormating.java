package day19_array;

import java.text.DecimalFormat;

public class decimalFormating {
    public static void main(String[] args) {

        double d = 10.645445;
        DecimalFormat df = new DecimalFormat( "0.00");

        System.out.println(df.format(d));
    }
}
