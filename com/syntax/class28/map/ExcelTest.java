package com.syntax.class28.map;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.util.HashMap;

public class ExcelTest {
    public static void main(String[] args) {
        HashMap<String, Integer> fruit=new HashMap<>();
        fruit.put("Apple", 10); //instead of add meth. we use put meth. to insert data
        fruit.put("Mango", 15);
        fruit.put("Orange", 20);
        fruit.put("Kiwi", 18);
        fruit.put("Apricot", 50);
        System.out.println(fruit.get("Kiwi"));//returns the corresponding value of this key
        System.out.println(fruit.remove("Orange"));//removes the key and corresponding value
        System.out.println(fruit);//print all data of the map
        System.out.println(fruit.containsKey("Mango"));//checks if this key is present in map
        System.out.println(fruit.containsValue(10));// checks if this value is present in the map
        System.out.println(fruit.isEmpty());// returns boolean "true" if list is empty
        System.out.println(fruit.replace("Mango", 35));//replace the value of the specific key
        System.out.println(fruit);

    }
}
