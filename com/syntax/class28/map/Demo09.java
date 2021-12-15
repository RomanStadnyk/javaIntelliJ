package com.syntax.class28.map;

import java.util.*;

public class Demo09 {
    public static void main(String[] args) {
        HashMap<String, Double> grocery=new LinkedHashMap<>();
        grocery.put("egg", 5.5);
        grocery.put("rice", 4.5);
        grocery.put("milk", 4.3);
        grocery.put("tomato", 6.5);

        System.out.println(grocery);

        Iterator<Map.Entry<String, Double>> iterator=grocery.entrySet().iterator();// both key and values

        while (iterator.hasNext()){
            Map.Entry<String, Double> entry=iterator.next();
            if(entry.getKey().equals("milk") && entry.getValue()==4.3){
                iterator.remove();
            }
        }

    }
}
