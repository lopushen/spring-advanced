package com.loplop.springadvanced.tut1_18.beans;

/**
 * Created by i.lopushen on 23/06/2016.
 */
public class PersonFactory {
    public Person createPerson(int id, String name) {
        System.out.println("Using factory to create person");
        return new Person(id, name);
    }
}
