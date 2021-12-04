package com.syntax.groupTask.Task3;

public class Truck extends Car {
    double weight;
    Truck(double carPrice, String carColor, double weight){
        this.carPrice=carPrice;
        this.carColor=carColor;
        this.weight=weight;
    }
    void calculateSalePrice(){
        if(weight>2000){
            carPrice=carPrice*0.9;
            System.out.println("Car price is "+carPrice);
        } else {
            carPrice=carPrice*0.80;
            System.out.println("Car price is "+carPrice);
        }
    }

}
