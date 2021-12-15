package com.syntax.class28;
    /*
    Create a map of a building. Store floor number and it is associated company name.
    (Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values.
    Check how many entries you have?
    Update company on a 4th floor
    Remove company on the 7th floor
    Print your map
     */


import java.util.TreeMap;

public class Task01 {
    public static void main(String[] args) {
        TreeMap<Integer, String> companies=new TreeMap<>();
        companies.put(1, "Google");
        companies.put(2, "Facebook");
        companies.put(3, "Syntax");
        companies.put(4, "eBay");
        companies.put(5, "Amazon");
        companies.put(6, "Starbucks");
        companies.put(7, "Yahoo");
        System.out.println(companies);
        System.out.println("You have "+companies.size()+" entries in here");
        System.out.println("*********************");

        companies.replace(7,"eBay", "Etsy");
        companies.replace(7, "Yahoo", "Yandex");
        System.out.println(companies);





    }
}
