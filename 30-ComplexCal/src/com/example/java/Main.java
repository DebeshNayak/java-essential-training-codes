package com.example.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // enter two number
        String num1 = getValue("Enter a numeric value: ");
        String num2 = getValue("Enter a numeric value: ");
        // enter a operator
        String opr = getValue("Enter an operation(+ - * /): ");
        calculate(num1, num2, opr);
    }

    /**
     * This method get the message and prompt for an user input
     * @return value entered by user
     */
    private static String getValue(String prompt){
        Scanner sc = new Scanner(System.in);
        String value = null;
        System.out.print(prompt);
        value = sc.nextLine();

        return value;
    }

    /**
     * This method check which type of calculation to do
     * @return double result of the calculation
     */
    private static void calculate(String num1, String num2, String opr){

        // check if the number are valid integer
        if(isNum(num1) && isNum(num2)){
            double n1 = Double.parseDouble(num1);
            double n2 = Double.parseDouble(num2);

            switch (opr){
                case "+":
                    System.out.println("The answer is: " + (n1 + n2));
                    break;
                case "-":
                    System.out.println("The answer is: " + (n1 - n2));
                    break;
                case "*":
                    System.out.println("The answer is: " + (n1 * n2));
                    break;
                case "/":
                    System.out.println("The answer is: " + (n1 / n2));
                    break;
                default:
                    System.out.println("Unrecognized operation!");
                    break;
            }
        }


        // check if the entered operator is a valid operator

    }

    /**
     * This method check whether the entered value is a valid number or not
     * @return boolean true if it is a valid number, false if it is a invalid
     */
    private static boolean isNum(String num){
        try {
            double num1 = Double.parseDouble(num);
            return true;
        } catch (NumberFormatException e) {
            System.out.println("Number formatting exception " + e.getMessage());
            return false;
        }
    }

}
