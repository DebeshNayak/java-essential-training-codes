package com.example.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1 + ", " + str2 + "!"; // this will create memory management problem
        System.out.println(str3);

        // Instead we have to use StringBuilder class to put strings together at rutime,
        // while minimizing the number of objects creating in memory
        StringBuilder sb = new StringBuilder("Hello")
                .append(", ")
                .append("World")
                .append("!");
        System.out.println(sb);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value: ");
        String input = scanner.nextLine();
        System.out.println(input);

        sb.delete(0, sb.length());
        for (int i = 0; i < 3; i++) {
            input = scanner.nextLine();
            sb.append(input + "\n");
        }

        System.out.println(sb.toString());
    }
}
