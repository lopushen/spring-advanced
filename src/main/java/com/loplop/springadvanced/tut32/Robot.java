package com.loplop.springadvanced.tut32;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by Ievgenii on 7/24/2016.
 */
@Component
public class Robot {
    private String id = "Default Robot";
    private String speech = "hello!";


    public void speak() {
        System.out.println(id+" "+speech);
    }

    @Autowired
    public void setId(@Value("#{randomText.getText()?.length()}")String id) {
        this.id = id;
    }

    //can also be @Value("#{new java.util.Date().toString()
    //
    @Autowired
    public void setSpeech(@Value("#{T(Math).sin(T(Math).PI/4)^2 eq 1 ? 2: 0}") String speech) {
        this.speech = speech;
    }
}
