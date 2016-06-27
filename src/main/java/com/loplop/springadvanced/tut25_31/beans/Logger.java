package com.loplop.springadvanced.tut25_31.beans;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;
import java.util.Optional;

/**
 * Created by i.lopushen on 24/06/2016.
 */
@Component
public class Logger {

    private LogWriter consoleWriter;

    private LogWriter fileWriter;

    @Inject
    public void setConsoleWriter(ConsoleWriter writer) {
        this.consoleWriter = writer;
    }
    @Inject
    public void setFileWriter(LogWriter fileWriter) {
        this.fileWriter = fileWriter;
    }

    public void writeFile(String text) {
        fileWriter.write(text);
    }

    public void writeConsole(String text) {
        Optional.ofNullable(consoleWriter).ifPresent(cw -> cw.write(text));
    }

    @PostConstruct
    public void init() {
        System.out.println("Init -------->");
    }


    @PreDestroy
    public void destroy() {
        System.out.println("Destroy -------->");
    }
}
