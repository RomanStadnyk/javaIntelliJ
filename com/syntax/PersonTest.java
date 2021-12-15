package com.syntax.class28.HomeWork;

import java.util.Collection;
import java.util.TreeMap;

public class PersonTest {
    public static void main(String[] args) {
        Person p1=new Person("Roman","Stadnyk", 38, 42000);
        Person p2=new Person("Bob","Silent", 41, 82000);
        Person p3=new Person("Bohdana","Smyrnova", 43, 22000);
        Person p4=new Person("Andrey","Stadnyk", 35, 65000);

        TreeMap<Integer, Person> personTreeMap= new TreeMap<>();
        personTreeMap.put(1,p1);
        personTreeMap.put(2,p2);
        personTreeMap.put(3,p3);
        personTreeMap.put(4,p4);
        Collection<Person> value=personTreeMap.values();
        for (Person values:value){
            values.printUserDetail();
        }


    }
}
