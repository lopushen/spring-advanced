package com.loplop.springadvanced.tut1_18;

import com.loplop.springadvanced.tut1_18.beans.Address;
import com.loplop.springadvanced.tut1_18.beans.FoodBeanMap;
import com.loplop.springadvanced.tut1_18.beans.FoodMapJungle;
import com.loplop.springadvanced.tut1_18.beans.Person;
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

        FoodMapJungle jungleFoods = context.getBean("jungleFoods", FoodMapJungle.class);

        System.out.println(jungleFoods);
        FoodBeanMap foodBeanMap = context.getBean("jungleAnimalFoods", FoodBeanMap.class);

        System.out.println(foodBeanMap);
        ((ClassPathXmlApplicationContext) context).close();
    }
}
