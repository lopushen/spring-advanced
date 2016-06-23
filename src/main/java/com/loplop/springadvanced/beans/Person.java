package com.loplop.springadvanced.beans;

/**
 * Created by i.lopushen on 23/06/2016.
 */
public class Person {
    private int id;
    private String name;
    private int taxId;
    private Address address;

    private Person() {
    }

    public static Person getInstance(int id, String name) {
        System.out.println("Creating person through factory method");
        return new Person(id, name);
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setTaxId(int taxId) {
        this.taxId = taxId;
    }

    public void speak() {
        System.out.println("Hello, I am a person");
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void onCreate() {
        System.out.println("Person created: "+this);
    }

    public void onDestroy() {
        System.out.println("Person destroyed: "+this);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", taxId=" + taxId +
                ", address=" + address +
                '}';
    }
}
