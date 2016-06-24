package com.loplop.springadvanced.tut1_18.beans;

import java.util.Set;

/**
 * Created by i.lopushen on 24/06/2016.
 */
public class FruitBasket {
    private String name;
    private Set<String> fruits;

    public FruitBasket(String name, Set<String> fruits) {
        this.name = name;
        this.fruits = fruits;
    }

    @Override
    public String toString() {
        return "FruitBasket{" +
                "fruits=" + String.join(",", fruits) +
                ", name='" + name + '\'' +
                '}';
    }
}
