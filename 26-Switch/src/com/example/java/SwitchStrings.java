package com.example.java;

import java.util.Scanner;

public class SwitchStrings {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String input = sc.nextLine();

        switch(input){
            case "Jan":
                System.out.println("This month is January");
                break;
            case "Feb":
                System.out.println("This month is February");
                break;
            case "Mar":
                System.out.println("This month is March");
                break;
            default:
                System.out.println("You choose incorrect value");
                break;
        }

    }
}
