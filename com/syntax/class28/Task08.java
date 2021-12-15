package com.syntax.class28;

import java.util.HashSet;
import java.util.Set;

public class Task08 {
    public static void main(String[] args) {
    Set<Student> students=new HashSet<>();
    students.add(new Student("Alexey", "Cow123"));
    students.add(new Student("Sorbon", "Poly123"));
    students.add(new Student("Aysha", "AllAuto123"));
    students.add(new Student("Sebastian", "Meme123"));
    for (Student stud:students)
    {
        stud.printName();
    }
    }
}
