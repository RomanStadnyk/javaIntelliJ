package com.syntax.class28.HomeWork;

import java.util.Collection;
import java.util.LinkedList;

public class Task5 {
    /*
    Create a collection of integers in which you can keep duplicates.
    Write a logic to find sum of all integers
     */
    public static void main(String[] args) {
        Collection<Integer> num=new LinkedList<>();
        num.add(15);
        num.add(11);
        num.add(18);
        num.add(22);
        num.add(78);
        num.add(1);
        Integer sum=0;

        for (Integer number:num){
            sum=sum+number;
        }
        System.out.println(sum);
    }
}
