package com.syntax.class23;

public class Parent {
    private final String NAME="Fatma";
    protected final int AGE=20;
    public final double WEIGHT=30;
    final double HEIGHT=5.4;
    static final int NoOfLeGS=2;
    String hairColor;
    private void prinName(){
        System.out.println(NAME);
    }
    final void printAge(){
        System.out.println(AGE);
    }
    protected final void printHeight(){
        System.out.println(HEIGHT);
    }
    protected final void printWeight(){
        System.out.println(WEIGHT);
    }
    public static void printNoLegs(){
        System.out.println(NoOfLeGS);
    }

    void printHairColor(){
        System.out.println(hairColor);
    }
}

class Child extends Parent{

}

class Tester{
    public static void main(String[] args) {
        Child child=new Child();
        child.printHairColor();
        child.printNoLegs();
    }
}