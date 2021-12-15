package com.syntax.class28.HomeWork;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Task3 {
    /*
    Create a Map that will store Employee name and salary.
    Write a logic to retrieve an employee who gets the highest salary.
    Output should be in the below format
    John Smith=$100000
     */
    public static void main(String[] args) {
        Integer bigestSalary=0;
        String nameOfEmployee="";

        HashMap<String, Integer> employee=new HashMap<>();
        employee.put("John Smith", 35000);
        employee.put("Jack Sole", 38000);
        employee.put("Brad Feels", 45000);
        employee.put("Kevin Hoke", 22000);
        employee.put("Elizabeth Carry", 55000);
        employee.put("Helen Soap", 33000);

        Iterator<Map.Entry<String, Integer>> iterator=employee.entrySet().iterator();

        while (iterator.hasNext()){
            Map.Entry<String,Integer> entry=iterator.next();

            if (bigestSalary<entry.getValue()){
                bigestSalary=entry.getValue();
                nameOfEmployee=entry.getKey();
            }
        }
        System.out.println("The richest employee in the company is: "+nameOfEmployee+"=$"+bigestSalary);

    }
}
