package com.example.java;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // take user input using Scanner class
        Scanner sc = new Scanner(System.in);

        // Translate String to numerical values
        System.out.print("Enter a numeric value: ");
        String num1 = sc.nextLine();
        BigDecimal n1 = new BigDecimal(num1);

        System.out.print("Enter a numeric value: ");
        String num2 = sc.nextLine();
        BigDecimal n2 = new BigDecimal(num2);

        // Execute a mathematical operation
        BigDecimal res = n1.add(n2);

        // Print the Result
        System.out.println("The answer is: " + res);
    }
}
