package com.example.java.model;

/**
 * Created by debes on 12-01-2017.
 */
public enum OliveName {
    KALAMATA("Kalamata"), LIGURIAN("Ligurian");

    // in order to translate the identifier of the enumeration value into a string,
    // declare a string variable. Make it private to the enumeration.
    private String name;

    // create a constructor for the enum
    // we can't add public keyword in it.
    OliveName(String name){
        this.name = name;
    }

    // now to display the String
    // we need to override the toString()
    // every java class and enum has toString()

    @Override
    public String toString() {
        return name;
    }
}
