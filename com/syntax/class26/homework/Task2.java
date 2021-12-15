package com.syntax.class26.homework;

import java.util.ArrayList;
import java.util.Iterator;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("Life");
        arrayList.add("Orange");
        arrayList.add("Car");
        arrayList.add("Lamp");
        arrayList.add("Purple");
        arrayList.add("Love");
        System.out.println(arrayList);
        System.out.println(arrayList.size());
        System.out.println("***************************************");

        for (int i = 0; i < arrayList.size(); i++) {
            String str=arrayList.get(i);
            if(str.toLowerCase().endsWith("e")){
                int size=str.length();
                int lastIndex=size-1;
                String newStr=str.substring(0, lastIndex);
                arrayList.set(i, newStr);
            }

        }
        System.out.println(arrayList);

        /*Iterator<String> iterator= arrayList.iterator();
        while (iterator.hasNext()){
            String word= iterator.next();
            if(word.toLowerCase().endsWith("e")){
                iterator.remove();
            }
        }
        System.out.println(arrayList);
        System.out.println(arrayList.size());*/
    }
}
