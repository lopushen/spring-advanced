package com.loplop.springadvanced.tut25.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.Optional;

/**
 * Created by i.lopushen on 24/06/2016.
 */
public class Logger {

    private ConsoleWriter consoleWriter;

    private LogWriter fileWriter;

    @Inject
    public void setConsoleWriter(ConsoleWriter consoleWriter) {
        this.consoleWriter = consoleWriter;
    }
    @Inject
    @Named("mongoose")
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
