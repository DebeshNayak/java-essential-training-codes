package com.example.java;

public class Main {

    public static void main(String[] args) {
        String[] months = {"January", "February", "March",
                "April", "May", "June", "July",
                "August", "September", "Ocotober",
                "November", "December"};
//        for (int i = 0; i < months.length; i++) {// incrementing loop
//            System.out.println(months[i]);
//        }
//        for (int i = months.length - 1; i >= 0; i--) {// incrementing loop
//            System.out.println(months[i]);
//        }

//        for (String month : months){ // foreach loop
//            System.out.println(month);
//        }

//        int counter = 0;
//        while (counter < months.length){ // while loop
//            System.out.println(months[counter]);
//            counter++;
//        }

        int counter = 0;
        do { //do...while loop
            System.out.println(months[counter]);
            counter++;
        } while (counter < months.length);

    }
}
