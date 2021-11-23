package com.syntax.class21;

public class StudentTester {
    public static void main(String[] args) {
        SyntaxStudent st1=new SyntaxStudent() ;
        CollegeStudent st2=new CollegeStudent();
        SchoolStudent st3=new SchoolStudent();

        st1.weekday();
        st1.weekend();
        st1.annual();
        st1.subjects();


        st2.weekday();
        st2.weekend();
        st2.annual();
        st2.subjects();


        st3.weekday();
        st3.weekend();
        st3.annual();
        st3.subjects();
    }
}
