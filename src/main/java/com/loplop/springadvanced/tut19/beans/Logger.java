package com.loplop.springadvanced.tut19.beans;

/**
 * Created by i.lopushen on 24/06/2016.
 */
public class Logger {
    private ConsoleWriter consoleWriter;
    private FileWriter fileWriter;

    public void setConsoleWriter(ConsoleWriter consoleWriter) {
        this.consoleWriter = consoleWriter;
    }

    public void setFileWriter(FileWriter fileWriter) {
        this.fileWriter = fileWriter;
    }

    public void writeFile(String text) {
        fileWriter.write(text);
    }

    public void writeConsole(String text) {
        consoleWriter.write(text);
    }
}
