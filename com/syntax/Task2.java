package com.syntax.class28.HomeWork;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
    Create a map of Best Buy store. Place
    item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
    Retrieve all keys and values from a Best Buy map using EntrySet.
     */
public class Task2 {
        public static void main(String[] args) {
            HashMap<Integer,String> items=new HashMap<>();
            items.put(148563, "PC");
            items.put(148565, "Phone");
            items.put(148763, "Mouse");
            items.put(148543, "Printer");
            items.put(148561, "Microwave");
            items.put(148568, "Vacuum");

            Iterator<Map.Entry<Integer, String>> iterator=items.entrySet().iterator();
            while (iterator.hasNext()){
                Map.Entry<Integer,String> entry=iterator.next();
                System.out.println("Key: "+entry.getKey()+" --> Value: "+entry.getValue());
            }



        }
}
