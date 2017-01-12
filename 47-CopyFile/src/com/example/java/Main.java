package com.example.java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class Main {

    public static void main(String[] args) {

        String sourceFile = "files/loremipsum.txt";
        String targetFile = "files/target.txt";

        try(
                FileReader fReader = new FileReader(sourceFile);
                BufferedReader bReader = new BufferedReader(fReader); // read one line at a time.
                FileWriter writer = new FileWriter(targetFile)// this file is used to create target file
                ){  // try with resources syntax, it was introduced in JavaSE 7
            while (true){
                String line = bReader.readLine();
                if(line == null){
                    break;
                }else{
                    writer.write(line + "\n");
                }
            }
            System.out.println("File copied!");
        } catch (Exception e){
            e.printStackTrace();
        }

    }
}
