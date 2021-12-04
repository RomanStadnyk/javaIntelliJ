package com.syntax.groupTask.Task1;

public class ShapeTester {
    public static void main(String[] args) {
        Shape[] sh={new Circle(5,3.14), new Square(5) };
        for (Shape s:sh){
            s.calculateArea();
            s.calculatePerimetr();
        }
    }
}
