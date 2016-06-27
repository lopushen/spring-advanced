package com.loplop.springadvanced.tut25.beans;

import org.springframework.beans.factory.annotation.Qualifier;

/**
 * Created by i.lopushen on 24/06/2016.
 */
@Qualifier("toConsole")
public class ConsoleWriter implements LogWriter {
    public void write(String text) {
        System.out.println("Writing to a console... "+text);
    }
}
