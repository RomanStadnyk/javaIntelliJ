package com.syntax.class19;

public class Employee {
    String name;
    int age;
    int baseSalary=30000;
    int baseNoDaysOff=20;

    void printSalary(){
        System.out.println(baseSalary);
    }
    void prNoDayaOff(){
        System.out.println("baseNoDaysOff");
    }
}
class Manager extends Employee {
    int bonus=10;
    int traveling=200;

    void printSalary(){
        super.printSalary();
        System.out.println(bonus+traveling);

    }

}