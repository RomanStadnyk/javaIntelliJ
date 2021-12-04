package com.syntax.groupTask.Task2;

public class StudentB extends Marks{
    double mark1;
    double mark2;
    double mark3;
    double mark4;
    StudentB(double mark1, double mark2, double mark3, double mark4){
        this.mark1=mark1;
        this.mark2=mark2;
        this.mark3=mark3;
        this.mark4=mark4;
    }

    @Override
    public void getPercentage() {
        double averagePercentage=(mark1+mark2+mark3+mark4)/4;
        System.out.println("Average percentage of marks is "+averagePercentage);
    }
}
