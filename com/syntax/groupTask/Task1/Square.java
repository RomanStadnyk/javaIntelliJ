package com.syntax.groupTask.Task1;

public class Square implements Shape{
    double a;
    Square(double a){
        this.a=a;
    }

    @Override
    public void calculateArea() {
        System.out.println("The area of the square is "+a*a);
    }

    @Override
    public void calculatePerimetr() {
        System.out.println("The perimeter of the square is "+a*4);
    }
}
