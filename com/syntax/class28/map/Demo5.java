package com.syntax.class28.map;

import java.util.*;

public class Demo5 {
    public static void main(String[] args) {
        HashMap<String, Double> grocery=new LinkedHashMap<>();
        grocery.put("egg", 5.5);
        grocery.put("rice", 4.5);
        grocery.put("milk", 4.3);
        grocery.put("tomato", 6.5);

        Iterator<String> iterator = grocery.keySet().iterator();
        while (iterator.hasNext()){
            String key= iterator.next();
            if (key.contains("e")) {
                iterator.remove();
            }
            System.out.println(iterator.next());
        }


    }
}
