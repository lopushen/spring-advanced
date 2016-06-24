package com.loplop.springadvanced.tut25.beans;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by i.lopushen on 24/06/2016.
 */
public class Logger {
    @Autowired
    private ConsoleWriter consoleWriter;

    private FileWriter fileWriter;

    public void setConsoleWriter(ConsoleWriter consoleWriter) {
        this.consoleWriter = consoleWriter;
    }
    @Autowired
    public void setFildasdaseWriter(FileWriter fileWriter) {
        this.fileWriter = fileWriter;
    }

    public void writeFile(String text) {
        fileWriter.write(text);
    }

    public void writeConsole(String text) {
        consoleWriter.write(text);
    }
}
