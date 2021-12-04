package com.syntax.class24;

public interface Person {
    void eat();
    void sleep();

}
interface Employee {
    void work();
}
interface SyntaxEmployee extends Employee, Person{
    void teach();
}
class SDETInstructor implements SyntaxEmployee {
    @Override
    public void eat() {
        System.out.println("Eating");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping");
    }

    @Override
    public void work() {
        System.out.println("Working");
    }

    @Override
    public void teach() {
        System.out.println("Teaching");
    }
}

