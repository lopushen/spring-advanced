package com.loplop.springadvanced.tut25_31.beans;

import org.springframework.stereotype.Component;

/**
 * Created by i.lopushen on 24/06/2016.
 */
@Component
public class FileWriter implements LogWriter {
    public void write(String text) {
        System.out.println("Writing to a file... "+text);
    }
}
