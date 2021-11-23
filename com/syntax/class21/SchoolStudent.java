package com.syntax.class21;

public class SchoolStudent extends Student {
    @Override
    void weekday() {
        super.weekday();
    }

    @Override
    void weekend() {
        super.weekend();
    }

    @Override
    void annual() {
        super.annual();
    }
    void subjects() {
        System.out.println("Students are studying: Language Arts, Mathematics, Handwriting, Physical Education");
    }
}
