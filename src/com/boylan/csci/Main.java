package com.boylan.csci;
//Michael Boylan

public class Main {

    public static void main(String[] args) {
        Persona me = new Persona("The Joker", "tehjaker@wiffer.com");
        System.out.println(me.toString());
        Persona alsoMe = new businessContact("Phineas Joker", "pjoker546@jmail.com", "614-666-6276");
        System.out.println(alsoMe.toString());
        Collection myCollection = new Collection();
        myCollection.addContact(me);
        myCollection.addContact(alsoMe);
        System.out.println(myCollection.getList());
    }
}