package com.syntax.groupTask.Task3;

public class CarTester {
    public static void main(String[] args) {
        Car[] cars = {new Truck(35000, "White", 50000), new Sedan(15000, "Red", 36000)};
        for (Car c : cars) {
            c.calculateSalePrice();
        }
    }
}