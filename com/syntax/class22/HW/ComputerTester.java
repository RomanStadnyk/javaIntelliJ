package com.syntax.class22.HW;


public class ComputerTester {
    public static void main(String[] args) {
        Computer[] computers={new Apple("Apple"), new HP("HP"), new Lenovo("Lenovo"), new Dell("Dell")};
        for(Computer comp:computers){
            comp.OpSys();
            if(comp instanceof Apple){
                ((Apple) comp).arch();
            }

            if(comp instanceof HP){
                ((HP) comp).eff();
            }

            if(comp instanceof Lenovo){
                ((Lenovo) comp).work();
            }

            if(comp instanceof Dell){
                ((Dell) comp).price();
            }
        }
    }

}
