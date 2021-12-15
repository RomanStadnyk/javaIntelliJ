package com.syntax.class26.homework;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Task5 {
    public static void main(String[] args) {
        List<String> aList=new ArrayList<>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");
        Set<String> set=new LinkedHashSet<>(aList); //all duplicates removes
        aList=new ArrayList<>(set);
        System.out.println(aList);
    }
}
