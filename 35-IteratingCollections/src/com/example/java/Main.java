package com.example.java;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("Ordered data");
        List<String> list = new ArrayList<>();
        list.add("Uttra Pradesh");
        list.add("Bihar");
        list.add("Jharakhand");

        System.out.println("toString() output");
        System.out.println(list);
        System.out.println("");

        System.out.println("ArrayList iterator");
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            String value = iterator.next();
            System.out.println(value);
        }
        System.out.println("");

        System.out.println("ArrayList ForEach");
        for (String value : list){
            System.out.println(value);
        }
        System.out.println("");

        System.out.println("Java 8 method reference");
        list.forEach(System.out::println); // not support in JavaSE 7 and Android version of Java
        System.out.println("");

        //----------------------------

        System.out.println("Unordered data");
        Map<String, String> map = new HashMap<>();

        map.put("Odisha", "Bhubaneswar");
        map.put("Tamilnadu", "Chennai");
        map.put("Kerala", "Thiruanantapuram");
        System.out.println("otString() output");
        System.out.println(map);
        System.out.println("");

        System.out.println("Hashmap Iterator");
        Set<String> keys = map.keySet();
        Iterator<String> iterator1 = keys.iterator();
        while(iterator1.hasNext()){
            String key = iterator1.next();
            System.out.println("The capital of " + key + " is " + map.get(key));
        }
        System.out.println("");

        System.out.println("Hashmap ForEach");
        for(String key : keys){
            System.out.println("The capital of " + key + " is " + map.get(key));
        }
        System.out.println("");
    }
}
