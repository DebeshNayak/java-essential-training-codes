package com.example.java;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class Main {

    // default value of boolean data type is false
    static boolean bDef;

    public static void main(String[] args) {

        boolean b1 = true;
        boolean b2 = false;

        System.out.println("The value fo b1 is: " + b1);
        System.out.println("The value of b2 is: " + b2);
        System.out.println("The value of bDef is: " + bDef);

        boolean b3 = !b1;
        System.out.println("The value of b3 is: " + b3);

        int i1 = 0;
        boolean b4 = (i1 != 0);
        System.out.println("The value of b4 is: " + b4);

        String sBoolean = "true";
        boolean parsed = Boolean.parseBoolean(sBoolean);
        System.out.println("Parsed: " + parsed);
    }
}
