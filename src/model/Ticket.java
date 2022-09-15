package model;

import java.util.Date;

public class Ticket {
    private Integer idTicket;
    private String user;
    private String film;
    private Integer placeNumber;
    private String price;
    private Boolean sold;

    public Ticket() {
    }

    public Ticket(Integer idTicket, String user, String film, Integer placeNumber, String price, Boolean sold) {
        this.idTicket = idTicket;
        this.user = user;
        this.film = film;
        this.placeNumber = placeNumber;
        this.price = price;
        this.sold = sold;
    }

    public Integer getIdTicket() {
        return idTicket;
    }

    public void setIdTicket(Integer idTicket) {
        this.idTicket = idTicket;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getFilm() {
        return film;
    }

    public void setFilm(String film) {
        this.film = film;
    }

    public Integer getPlaceNumber() {
        return placeNumber;
    }

    public void setPlaceNumber(Integer placeNumber) {
        this.placeNumber = placeNumber;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Boolean getSold() {
        return sold;
    }

    public void setSold(Boolean sold) {
        this.sold = sold;
    }
}
