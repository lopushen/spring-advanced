package com.loplop.springadvanced.beans;

import java.util.List;

/**
 * Created by i.lopushen on 24/06/2016.
 */
public class Jungle {
    private Animal largest;
    private List<Animal> animals;

    public Animal getLargest() {
        return largest;
    }

    public void setLargest(Animal largest) {
        this.largest = largest;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }

    @Override
    public String toString() {
        return "Jungle{" +
                "largest=" + largest +
                ", animals=" + animals +
                '}';
    }
}
