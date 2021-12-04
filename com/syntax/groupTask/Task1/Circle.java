package com.syntax.groupTask.Task1;

public class Circle implements Shape {
    double radius;
    double pie;

    Circle(double radius, double pie) {
        this.radius = radius;
        this.pie = pie;
    }

    @Override
    public void calculateArea() {
        System.out.println("the area of a circle is "+(pie*(radius*radius)));
        }



    @Override
    public void calculatePerimetr() {
        System.out.println("the perimeter of a circle is "+(2*pie*radius));

    }
}
