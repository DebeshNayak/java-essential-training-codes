package com.example.java;

public class Main {

    public static void main(String[] args) {
	    String s1 = "This is a String!";
        System.out.println(s1);

        // string creation using string class
        String s2 = new String("This is also a String!");
        System.out.println(s2);

        // string concatenation
        String s3 = "Shirt size: ";
        String s4 = "M";
        int n4 = 4;
        String s5 = s3 + s4 + " Qty: " + n4;
        System.out.println(s5);

        // string creation from char array
        char[] chars = {'H', 'e', 'l', 'l', 'o'};
        String s6 = new String(chars);
        System.out.println(s6);

        // string into char array
        char[] chars2 = s6.toCharArray();
        for (char c : chars2 ) { // java style foreach loop
            System.out.println(c);
        }
    }
}
