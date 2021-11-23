package com.syntax.class21;

public class SyntaxStudent extends Student{
    @Override
    void weekday() {
        System.out.println("Students are studying 5 days a week, except Monday and Friday");
    }

    @Override
    void weekend() {
        System.out.println("Students are studying on Saturday and Sunday 5 hrs a day");
    }

    @Override
    void annual() {
        System.out.println("Students studying 6 month in a row and then come to hit the market");
    }

    void subjects() {
        System.out.println("Students learn coding in Java, Manual testing etc");
    }
}
