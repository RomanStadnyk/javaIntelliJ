package com.syntax.class26.homework;

import java.util.ArrayList;

public class IncurenceTester {
    public static void main(String[] args) {
        ArrayList<Insurance> insuranceArrayList=new ArrayList<>();
        Car car=new Car("Geico", "Tesla S");
        Pet pet=new Pet("Geico", "Dog");
        Health health=new Health("Gaico");

        for (Insurance in:insuranceArrayList){
            in.getQuote();
            in.cancelInsurance();

        }
    }
}
