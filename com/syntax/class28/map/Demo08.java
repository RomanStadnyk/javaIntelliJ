package com.syntax.class28.map;

import java.util.*;

public class Demo08 {
    public static void main(String[] args) {
        HashMap<String, Double> grocery=new LinkedHashMap<>();
        grocery.put("egg", 5.5);
        grocery.put("rice", 4.5);
        grocery.put("milk", 4.3);
        grocery.put("tomato", 6.5);

        System.out.println(grocery);

        Set<Map.Entry<String, Double>> entrySet=grocery.entrySet();// both key and values
        for (Map.Entry<String, Double> entry:entrySet){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }


    }

}
