package com.syntax.class28;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class Demo03 {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> students=new LinkedHashMap<>();
        students.put(10, "Alexey");
        students.put(10, "Ahmet");//key should always be unique otherwise it'll replace the value
        students.put(20, "Denis");
        students.put(100, "Henok");
        students.put(10, "Alexey");
        System.out.println(students);
    }
}
