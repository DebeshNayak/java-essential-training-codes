package com.example.java;

import com.example.java.model.Olive;

import java.util.List;

/**
 * Created by debes on 11-01-2017.
 */
public class OlivePress {

    public int getOil(List<Olive> olives){

        int totalOil = 0;
        for (Olive o : olives){
            System.out.println(o.getName() +": "+ o.crush() + " units");
            totalOil += o.crush();
        }

        return totalOil;

    }

}
