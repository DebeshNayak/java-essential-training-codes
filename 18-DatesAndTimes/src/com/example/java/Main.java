package com.example.java;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {
        // Java SE 7 version of date representation.
        Date d = new Date();
        System.out.println(d);

        GregorianCalendar gc = new GregorianCalendar(2009, 1, 28);  // month numbering goes from 0 to 11
        gc.add(GregorianCalendar.DATE, 1);
        Date d2 = gc.getTime();
        System.out.println(d2);

        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println(df.format(d2));

        // Java SE 8 version of date representation
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        LocalDate ld = LocalDate.of(2009, 1, 28);
        System.out.println(ld);

        DateTimeFormatter  dtf = DateTimeFormatter.ISO_DATE;
        System.out.println(dtf.format(ld));

        DateTimeFormatter  dtsf = DateTimeFormatter.ofPattern("d/M/yyyy");
        System.out.println(dtsf.format(ldt));

    }
}
