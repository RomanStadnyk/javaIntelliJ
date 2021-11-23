package com.syntax.class21;

public class MethodOverloadingDemo {
    void method(int number, int m){
        System.out.println(number);
    }
    int method(int number){
        int a=0;
        System.out.println(number);
        System.out.println("hello");
        System.out.println("java");
        return number;
    }

    public static void main(String[] args) {
        MethodOverloadingDemo md=new MethodOverloadingDemo();


    }
}
