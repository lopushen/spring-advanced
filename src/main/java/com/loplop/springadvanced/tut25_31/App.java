package com.loplop.springadvanced.tut25_31;


import com.loplop.springadvanced.tut25_31.beans.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by i.lopushen on 23/06/2016.
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans3.xml");
        Logger logger = context.getBean("logger", Logger.class);
        logger.writeConsole("Hello");
        logger.writeFile("Hello again");

        ((ClassPathXmlApplicationContext)context).close();
    }
}
