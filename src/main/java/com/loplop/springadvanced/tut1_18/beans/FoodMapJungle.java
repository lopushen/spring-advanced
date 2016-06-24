package com.loplop.springadvanced.tut1_18.beans;

import java.util.Map;

/**
 * Created by i.lopushen on 24/06/2016.
 */
public class FoodMapJungle {
    private Map<String, String> foods;

    public Map<String, String> getFoods() {
        return foods;
    }

    public void setFoods(Map<String, String> foods) {
        this.foods = foods;
    }

    @Override
    public String toString() {
        return "FoodMapJungle{" +
                "foods=" + foods +
                '}';
    }
}
