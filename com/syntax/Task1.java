package com.syntax.class28.HomeWork;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        /*
        Create a map of countries with its capital that will store countries in alphabetical order.
        Print all keys and values from a country map using for each loop and iterator.
        Print all values from a country map using for each loop and iterator.
         */
        TreeMap<String,String> countries=new TreeMap<>();
        countries.put("USA", "Washington");
        countries.put("Ukraine", "Kyiv");
        countries.put("Italy", "Rome");
        countries.put("Germany", "Berlin");
        countries.put("Argentina", "Buenos Aires");
        countries.put("Canada", "Toronto");
        countries.put("France", "Paris");
        countries.put("China", "Beijing");
        countries.put("Pakistan", "Islamabad");

        System.out.println(countries);

        Iterator<String> count=countries.keySet().iterator();
        System.out.println();
        System.out.println("All keys from the map:");
        while (count.hasNext()){
            System.out.println(count.next());
        }

        Iterator<String> capital= countries.values().iterator();
        System.out.println();
        System.out.println("All values from the map:");
        while (capital.hasNext()){
            System.out.println(capital.next());
        }

        Iterator<Map.Entry<String, String>> setOfVal=countries.entrySet().iterator();
        System.out.println();
        while (setOfVal.hasNext()){
            Map.Entry<String,String> entry=setOfVal.next();
            System.out.println("Key: "+entry.getKey()+". Value: "+entry.getValue());
        }

    }
}
