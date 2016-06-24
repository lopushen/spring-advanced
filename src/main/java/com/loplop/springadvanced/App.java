package com.loplop.springadvanced;

import com.loplop.springadvanced.beans.Address;
import com.loplop.springadvanced.beans.FruitBasket;
import com.loplop.springadvanced.beans.Jungle;
import com.loplop.springadvanced.beans.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by i.lopushen on 23/06/2016.
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Person person = context.getBean("person", Person.class);
        Person person2 = context.getBean("person2", Person.class);

        person.speak();
        System.out.println(person);
        System.out.println(person2);

        Address address = context.getBean("address", Address.class);

        System.out.println(address);

        Jungle fruitBasket = context.getBean("jungle", Jungle.class);

        System.out.println(fruitBasket);

        ((ClassPathXmlApplicationContext) context).close();
    }
}
