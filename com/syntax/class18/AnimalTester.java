package com.syntax.class18;

public class AnimalTester {
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.name="Bobby";
        dog.bark();
        dog.sleep();
        Cat cat=new Cat();
        cat.name="Texy";
        System.out.println(dog.name);
        System.out.println(cat.name);

    }
}
