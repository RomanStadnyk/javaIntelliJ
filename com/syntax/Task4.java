package com.syntax.class28.HomeWork;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Task4 {
    /*
    Create the collection that will store single uniques
    Objects of a String type in which order is preserved.
    Write a logic to concatenate all string from the collection.
     */
    public static void main(String[] args) {
        Collection<String> obj = new LinkedList<>();
        obj.add("milk");
        obj.add("water");
        obj.add("socks");
        obj.add("cream");
        obj.add("conditioner");

        for (String objects : obj) {
            System.out.println(objects);

        }
    }
}