package com.syntax.class28;

import java.util.Iterator;
import java.util.TreeSet;

public class Task06 {
    public static void main(String[] args) {
        TreeSet<String> countries=new TreeSet<>();
        countries.add("Ukraine");
        countries.add("Italy");
        countries.add("France");
        countries.add("Spain");
        countries.add("Belgium");
        countries.add("Germany");
        countries.add("Turkey");

        System.out.println(countries);
        for (String co:countries){
            System.out.println(co);
        }
        System.out.println("*********************************");
        Iterator iterator=countries.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
