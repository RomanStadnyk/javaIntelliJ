package com.syntax.class25.collectionframework;

import java.util.ArrayList;

public class Demo4 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(45);
        System.out.println(numbers);

        ArrayList<Boolean> booleans=new ArrayList<>();
        booleans.add(true);
        booleans.add(false);

        ArrayList arrayList=new ArrayList();
        arrayList.add("Simon");
        arrayList.add(10);
        arrayList.add(false);

        for(Object arr:arrayList){
            System.out.println(((String)arr).length() ); // not a good practice
        }
    }
}
