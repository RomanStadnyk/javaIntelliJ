package com.syntax.class21;

public class CollegeStudent extends Student{
    @Override
    void annual() {
        super.annual();

    }

    @Override
    void weekday() {
        super.weekday();
        System.out.println("They have a lot facultatives");
    }

    @Override
    void weekend() {
        super.weekend();
    }

    void subjects() {
        System.out.println("Students studying: Computer Science, Government/Political Science, Business");
    }
}
