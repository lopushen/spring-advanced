package com.loplop.springadvanced.tut39;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by i.lopushen on 26/07/2016.
 */
@Component
public class OffersProvider {

    public List<Offer> provideOffers() {
        List<Offer> offers = new ArrayList<>();
        offers.add(new Offer("Karen", "karen@gmail.com", "Karen's text"));
        offers.add(new Offer("Kim", "Kim@gmail.com", "Kim's text"));
        offers.add(new Offer("Steve", "Steve@gmail.com", "Steve's text"));
        offers.add(new Offer("Frank", "Frank@gmail.com", "Frank's text"));

        return offers;
    }

}
