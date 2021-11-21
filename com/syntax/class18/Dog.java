package com.syntax.class18;

public class Dog extends Animal {
    boolean loyal=true;
    void printItAll(){
        System.out.println(name+breed+color);
    }

    void bark(){
        System.out.println(name+" is barking");
    }
}
