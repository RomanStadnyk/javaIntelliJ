package com.syntax.groupTask.Task2;

public class StudentA extends Marks {
    double mark1;
    double mark2;
    double mark3;
    StudentA(double mark1, double mark2, double mark3){
        this.mark1=mark1;
        this.mark2=mark2;
        this.mark3=mark3;
    }

    @Override
    public void getPercentage() {
        double averagePercentage=(mark1+mark2+mark3)/3;
        System.out.println("Average percentage of marks is "+averagePercentage);
    }
}
