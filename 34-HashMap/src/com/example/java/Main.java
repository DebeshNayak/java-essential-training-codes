package com.example.java;

import java.util.HashMap;
import java.util.Map; // interface

public class Main {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        // add item to the map we have to use the method of the Map interface
        map.put("Punjab", "Chandigarh");
        map.put("Jammu & Kasmir", "Srinagar");
        map.put("Himachal Pradesh", "Shimla");
        System.out.println(map); // the toString() method of the object is responsible for formatting
        map.put("Manipur", "Imphal");
        System.out.println(map); // the order of the output is not gurrenty
        // get item from a map
        String cap = map.get("Punjab");
        System.out.println("The capital of Punjab is " + cap);

        // remove item from a map
        map.remove("Jammu & Kasmir");
        System.out.println(map);
    }
}
