package com.loplop.springadvanced.beans;

import java.util.List;
import java.util.Set;
import java.util.StringJoiner;
import java.util.stream.Collectors;

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
