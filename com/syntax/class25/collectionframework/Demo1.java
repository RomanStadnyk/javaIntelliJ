package com.syntax.class25.collectionframework;

import java.util.ArrayList;

public class Demo1 {
    public static void main(String[] args) {


        String name = "Hasim";
        String[] names = {"Roman", "Asgar", "Bogdana"};

        ArrayList<String> listOfNames = new ArrayList<>(10);
        System.out.println("Size of list "+listOfNames.size());
        listOfNames.add("roman");
        listOfNames.add("asgar");
        System.out.println("Size of list"+listOfNames.size());

    }
}