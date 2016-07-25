package com.loplop.springadvanced.tut39;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by i.lopushen on 25/07/2016.
 */
@Component
public class OffersDAO {

    private NamedParameterJdbcTemplate template;

    @Autowired
    public void setDataSource(DataSource source) {
        this.template = new NamedParameterJdbcTemplate(source);
    }

    public List<Offer> getOffers() {

        return template.query("select * from offers", (resultSet, i) -> {
            Offer offer = new Offer();
            offer.setId(resultSet.getInt(1));
            offer.setText(resultSet.getString(2));
            offer.setName(resultSet.getString(3));

            return offer;
        });
    }

    public Offer getOffer(String name) {
        MapSqlParameterSource source = new MapSqlParameterSource("name", name);
        return template.queryForObject("select * from offers where username=:name", source, (resultSet, i) -> {
            Offer offer = new Offer();
            offer.setId(resultSet.getInt("id"));
            offer.setText(resultSet.getString("text"));
            offer.setName(resultSet.getString("username"));

            return offer;
        });
    }
}
