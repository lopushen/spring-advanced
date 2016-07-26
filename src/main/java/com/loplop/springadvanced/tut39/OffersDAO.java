package com.loplop.springadvanced.tut39;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.namedparam.*;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by i.lopushen on 25/07/2016.
 */
@Component
public class OffersDAO {

    public static final int HAPPY_OUTCOME_CODE = 1;
    public static final String UPDATE = "UPDATE offers SET username=:username, email=:email, text=text where id=:id";
    public static final String CREATE = "insert into offers (username, text, email) values (:username, :text, :email)";
    private NamedParameterJdbcTemplate template;

    @Autowired
    public void setDataSource(DataSource source) {
        this.template = new NamedParameterJdbcTemplate(source);
    }

    public List<Offer> getOffers() {

        return template.query("select * from offers", (resultSet, i) -> {
            Offer offer = new Offer();
            offer.setId(resultSet.getInt(1));
            offer.setUsername(resultSet.getString(2));
            offer.setEmail(resultSet.getString(3));
            offer.setText(resultSet.getString(4));


            return offer;
        });
    }

    public Offer getOffer(String name) {
        MapSqlParameterSource source = new MapSqlParameterSource("name", name);
        ResultSetExtractor<Offer> extractor = resultSet -> {
            Offer offer = null;
            if (resultSet.next()) {
                offer = new Offer();
                offer.setId(resultSet.getInt("id"));
                offer.setText(resultSet.getString("text"));
                offer.setUsername(resultSet.getString("username"));
                offer.setEmail(resultSet.getString("email"));

            }

            return offer;
        };
        return template.query("select * from offers where username=:name", source, extractor
                //(resultSet, i) -> {
//            Offer offer = new Offer();
//            offer.setId(resultSet.getInt("id"));
//            offer.setText(resultSet.getString("text"));
//            offer.setUsername(resultSet.getString("username"));
//
//            return offer;
//        }
        );
    }

    public boolean deleteOffer(Integer id) {
        return template.update("delete from offers where id=:id", new MapSqlParameterSource("id", id)) == HAPPY_OUTCOME_CODE;
    }

    public boolean create(Offer offer) {
        BeanPropertySqlParameterSource source = new BeanPropertySqlParameterSource(offer);

        return template.update(CREATE, source) == HAPPY_OUTCOME_CODE;
    }

    public void updateOffer(Offer offer) {
        BeanPropertySqlParameterSource source = new BeanPropertySqlParameterSource(offer);
        template.update(UPDATE, source);
    }

    public int[] create(List<Offer> offers) {
       SqlParameterSource[] parameterSources = SqlParameterSourceUtils.createBatch(offers.toArray());

        return template.batchUpdate(CREATE,parameterSources);
    }
}

