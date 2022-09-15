package model;

import java.util.Date;
import java.util.List;

public class Film {
    private Integer idFilm;
    private String name;
    private Date dateWatching;
    private List<Ticket> ticketList;

    public Film(Integer idFilm, String name, Date dateWatching, List<Ticket> ticketList) {
        this.idFilm = idFilm;
        this.name = name;
        this.dateWatching = dateWatching;
        this.ticketList = ticketList;
    }

    public Film() {
    }

    public Integer getIdFilm() {
        return idFilm;
    }

    public void setIdFilm(Integer idFilm) {
        this.idFilm = idFilm;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateWatching() {
        return dateWatching;
    }

    public void setDateWatching(Date dateWatching) {
        this.dateWatching = dateWatching;
    }

    public List<Ticket> getTicketList() {
        return ticketList;
    }

    public void setTicketList(List<Ticket> ticketList) {
        this.ticketList = ticketList;
    }
}
