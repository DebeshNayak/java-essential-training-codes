package com.example.java;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Madhapradesh");
        list.add("Maharastra");
        list.add("West Bangle");

        System.out.println(list);
        list.add("Goa");
        System.out.println(list);

        // remove from list based on its index position
        list.remove(0);
        System.out.println(list);

        // access single item from the list
        // ListArray has 0 based indexing
        String state = list.get(1);
        System.out.println("The second state is " + state);

        int pos = list.indexOf("Goa");
        System.out.println("Goa is at position " + pos);
    }
}
