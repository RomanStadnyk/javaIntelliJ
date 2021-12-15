package com.syntax.class26.homework;

import java.util.ArrayList;
import java.util.Iterator;

public class Task4 {
    public static void main(String[] args) {

        ArrayList<Integer> evenNumbers=new ArrayList<>();
        for (int i = 2; i < 50; i=i+2) {
            evenNumbers.add(i);
        }
        System.out.println(evenNumbers);
        Iterator<Integer> iterator=evenNumbers.iterator();
        while (iterator.hasNext()){
            Integer number=iterator.next();
            if(number%5==0){
                iterator.remove();
            }
        }
        System.out.println(evenNumbers);
    }
}
