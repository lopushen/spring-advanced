package com.loplop.springadvanced.tut39;

import com.loplop.springadvanced.tut32.Robot;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.CannotGetJdbcConnectionException;

import java.util.List;

/**
 * Created by i.lopushen on 25/07/2016.
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans39.xml");
        OffersDAO offersDAO = context.getBean("offersDAO", OffersDAO.class);
        try{
            offersDAO.getOffers().forEach(System.out::println);
        }
        catch (CannotGetJdbcConnectionException e) {
            System.out.println("There's been a problem in connecting to the DB");
            System.out.println(e.getMessage());
            System.out.println(e.getClass());
        }
        catch (DataAccessException e){
            System.out.println("There's been a problem in access of data");
            System.out.println(e.getMessage());
            System.out.println(e.getClass());
        }
        System.out.println(offersDAO.getOffer("Lovecraft"));


        ((ClassPathXmlApplicationContext) context).close();
    }
}
