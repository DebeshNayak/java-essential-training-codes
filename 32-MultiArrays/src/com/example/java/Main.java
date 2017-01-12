package com.example.java;

public class Main {

    public static void main(String[] args) {
	    String[][] states = new String[3][2];
	    states[0][0] = "Odisha";
        states[0][1] = "Bhubaneswar";
        states[1][0] = "Karnataka";
        states[1][1] = "Banbalore";
        states[2][0] = "Chhattishgarh";
        states[2][1] = "Raipur";

        for (int i = 0; i < states.length; i++){
            StringBuilder sb = new StringBuilder();
            sb.append("The capital of ")
                    .append(states[i][0])
                    .append(" is ")
                    .append(states[i][1]);
            System.out.println(sb);
        }
    }
}
