package com.loplop.springadvanced.tut39;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by i.lopushen on 25/07/2016.
 */
@Component
public class OffersDAO {

    private JdbcTemplate template;

    @Autowired
    public void setDataSource(DataSource source) {
        this.template = new JdbcTemplate(source);
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
}
