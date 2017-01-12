package com.example.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String s1 = getInput("Enter value 1: ");
        String s2 = getInput("Enter value 2: ");
        String s3 = getInput("Enter value 3: ");

        double result1 = addValues(s1, s2);
        System.out.println("The answer is: " + result1);

        double result2 = addValues(s1, s2, s3);
        System.out.println("The answer is: " + result2);

        double result3 = addValues(s1, s2, s3, s1, s2, s3);
        System.out.println("The answer is: " + result3);
    }

    static String getInput(String prompt){
        System.out.print(prompt);
        Scanner sc = new Scanner(System.in);

        return sc.nextLine();
    }

    static double addValues(String s1, String s2){
        double v1 = Double.parseDouble(s1);
        double v2 = Double.parseDouble(s2);
        double result = v1 + v2;
        return result;
    }

    static double addValues(String s1, String s2, String s3){
        double v1 = Double.parseDouble(s1);
        double v2 = Double.parseDouble(s2);
        double v3 = Double.parseDouble(s3);
        double result = v1 + v2 + v3;
        return result;
    }

    static double addValues(String ... values){ // three dots, an ellipse, means that the user can pass in as many values as they want
        double result = 0;
        double d = 0;
        for (String value : values){
            d = Double.parseDouble(value);
            result = result + d;
        }
        return result;
    }
}
