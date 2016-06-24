package com.loplop.springadvanced.tut1_18.beans;

/**
 * Created by i.lopushen on 23/06/2016.
 */
public class Address {
    private String street;
    private String postCode;

    public Address() {
    }

    public Address(String street, String postCode) {
        this.street = street;
        this.postCode = postCode;
    }

    public String getStreet() {
        return street;
    }

    public String getPostCode() {
        return postCode;
    }

    public void init() {
        System.out.println("Init address "+this);
    }

    public void destroy() {
        System.out.println("Destroy address "+this);
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", postCode='" + postCode + '\'' +
                '}';
    }
}
