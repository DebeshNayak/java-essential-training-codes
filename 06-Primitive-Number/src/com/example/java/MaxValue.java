package com.example.java;

/**
 * Created by debes on 06-01-2017.
 */
public class MaxValue {
    public static void main(String[] args){

        byte b = 127;
        System.out.println("Byte: " + b);

        if( b < Byte.MAX_VALUE){
            b++;
        }

        System.out.println("Byte: " + b);
    }
}
