package com.loplop.springadvanced.tut32;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Ievgenii on 7/24/2016.
 */

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans32.xml");
        Robot robot = context.getBean("robot", Robot.class);

        robot.speak();

        ((ClassPathXmlApplicationContext) context).close();
    }
}
