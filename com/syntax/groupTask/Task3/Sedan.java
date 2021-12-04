package com.syntax.groupTask.Task3;

public class Sedan extends Car {
    double length;
    Sedan(double carPrice, String carColor, double length){
        this.carPrice=carPrice;
        this.carColor=carColor;
        this.length=length;
       }
    void calculateSalePrice(){
        if(length>20){
            carPrice=carPrice*0.95;
            System.out.println("Car price is "+carPrice);
        } else {
            carPrice=carPrice*0.90;
            System.out.println("Car price is "+carPrice);
        }
    }

}
