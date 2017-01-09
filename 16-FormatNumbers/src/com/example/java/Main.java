package com.example.java;

import java.text.NumberFormat;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        Locale local = new Locale("da", "DK");

	    double doubleValue = 1_234_567.89; // here underscore are for readibility and could be igonred

        NumberFormat numF = NumberFormat.getNumberInstance(local);
        System.out.println("Number: " + numF.format(doubleValue));

        NumberFormat curF = NumberFormat.getCurrencyInstance(local);
        System.out.println("Currencey: " + curF.format(doubleValue));

        NumberFormat intF = NumberFormat.getIntegerInstance();
        System.out.println("Integer: " + intF.format(doubleValue));
    }
}
