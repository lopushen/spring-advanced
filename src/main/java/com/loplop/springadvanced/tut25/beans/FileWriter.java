package com.loplop.springadvanced.tut25.beans;

/**
 * Created by i.lopushen on 24/06/2016.
 */
public class FileWriter implements LogWriter {
    public void write(String text) {
        System.out.println("Writing to a file... "+text);
    }
}
