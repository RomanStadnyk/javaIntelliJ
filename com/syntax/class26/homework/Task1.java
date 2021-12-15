package com.syntax.class26.homework;

import java.util.ArrayList;
import java.util.Iterator;

public class Task1 {
    public static void main(String[] args) {

        ArrayList<String> cars=new ArrayList<>();
        cars.add("Ford");
        cars.add("BMW");
        cars.add(1,"Audi");
        cars.add("Mercedes");
        System.out.println(cars);
        //First way to retrieve the data from an ArrayList

        for(String car:cars){
            System.out.println(car);
        }
        System.out.println("****************************");
        int i=0;
        while (i< cars.size()){
            System.out.println(cars.get(i));
            i++;

        }
        System.out.println("****************************");
        Iterator<String> iterator=cars.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
