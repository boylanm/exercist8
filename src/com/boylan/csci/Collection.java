package com.boylan.csci;

import java.util.ArrayList;

/**
 * Created by 126131 on 3/12/2019.
 */
public class Collection {
    private ArrayList<Persona> list = new ArrayList<>();

    public Collection() {
    }

    public ArrayList<Persona> getList() {
        return list;
    }

    public void addContact(Persona person) {
        list.add(person);
    }
}
