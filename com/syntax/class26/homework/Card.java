package com.syntax.class26.homework;

public abstract class Card {
    /*
    Create a Card class that will have implemented  and unimplemented methods
    and a constructor that will initializes credit card type.  Create 3 subclasses
    of a Card card. Create 3 objects of different card and store them into LinkedList.
    Using for loop/advanced for loop/ iterator access all methods of the class.
     */
    String cardType;

    public Card(String cardType){
        this.cardType = cardType;
    }
    public void issueCard(){
        System.out.println(cardType+" Issued");
    }
    public abstract void calculateInterest();
}

