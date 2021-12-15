package com.syntax.class26;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList<Fruit> fruits=new ArrayList<>();
        fruits.add(new Apple());
        fruits.add(new Orange());
        for (Fruit f:fruits){
            f.PrintName();
        }
    }

}

class Fruit {
    void PrintName() {
        System.out.println("I am a fruit");

    }
}
    class Apple extends Fruit{
        void PrintName(){
            System.out.println("I am an Apple");
    }
}
class Orange extends Fruit {
    void PrintName() {
        System.out.println("I am an Orange");
    }
}



