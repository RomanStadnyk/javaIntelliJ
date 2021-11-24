package com.syntax.class22.HW;

public class Computer {
    String brandName;
    Computer(String brandName){
        this.brandName=brandName;
    }
    void OpSys(){
        System.out.println("Computer has to have Operation System");
    }
}
class Apple extends Computer{
    Apple(String brandName){
        super(brandName);
    }

    @Override
    void OpSys() {
        System.out.println(brandName+" runs with MacOS");
    }
    void arch(){
        System.out.println(brandName+" has closed architecture");
    }
}
class HP extends Computer{
    HP (String brandName){
        super(brandName);
    }

    @Override
    void OpSys() {
        System.out.println(brandName+" runs with Widows");
    }
    void eff(){
        System.out.println(brandName+" works really fast and decent");
    }
}

class Lenovo extends Computer{
    Lenovo (String brandName){
        super(brandName);
    }

    @Override
    void OpSys() {
        System.out.println(brandName+" runs with Widows");
    }
    void work(){
        System.out.println(brandName+" is really efficient in solving problems");
    }
}

class Dell extends Computer{
    Dell (String brandName){
        super(brandName);
    }

    @Override
    void OpSys() {
        System.out.println(brandName+" runs with Widows");
    }
    void price(){
        System.out.println(brandName+" is really cheap");
    }
}
