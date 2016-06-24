package com.loplop.springadvanced.tut1_18.beans;

import java.util.Map;

/**
 * Created by i.lopushen on 24/06/2016.
 */
public class FoodBeanMap {
    private Map<String, Animal> animalMap;

    public Map<String, Animal> getAnimalMap() {
        return animalMap;
    }

    public void setAnimalMap(Map<String, Animal> animalMap) {
        this.animalMap = animalMap;
    }

    @Override
    public String toString() {
        return "FoodBeanMap{" +
                "animalMap=" + animalMap +
                '}';
    }
}
