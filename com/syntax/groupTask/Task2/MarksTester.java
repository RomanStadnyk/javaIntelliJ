package com.syntax.groupTask.Task2;

public class MarksTester {
    public static void main(String[] args) {
        Marks[] mark={new StudentA(20.23,15.1,9.99), new StudentB(8,11,4,25)};
        for (Marks m:mark){
            m.getPercentage();
        }
    }
}
