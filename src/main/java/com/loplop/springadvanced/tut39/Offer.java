package com.loplop.springadvanced.tut39;

/**
 * Created by i.lopushen on 25/07/2016.
 */
public class Offer {
    private Integer id;
    private String username;
    private String email;
    private String text;

    public Offer() {
    }

    public Offer(String username, String email, String text) {
        this.username = username;
        this.email = email;
        this.text = text;
    }

    public Offer(Integer id, String username, String email, String text) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.text = text;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String name) {
        this.username = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Offer{" +
                "id=" + id +
                ", name='" + username + '\'' +
                ", email='" + email + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
