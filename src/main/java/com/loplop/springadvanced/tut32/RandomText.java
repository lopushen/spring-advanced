package com.loplop.springadvanced.tut32;

import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * Created by Ievgenii on 7/24/2016.
 */
@Component
public class RandomText {
    private static String[] texts = {"I'll be back", "Get out!", "I want your clothes and motorcycle"};
    public String getText() {
        Random random = new Random();

        return texts[random.nextInt(texts.length)];
    }
}
