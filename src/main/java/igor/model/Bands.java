package igor.model;

import java.time.LocalDate;

public class Bands {
    
    private int id;
    private String name;
    private float ticket_price;
    private int band_members;
    private LocalDate show_date;

    public Bands(int id, String name, float ticket_price, int band_members, LocalDate show_date) {
        this.id = id;
        this.name = name;
        this.ticket_price = ticket_price;
        this.band_members = band_members;
        this.show_date = show_date;
    }
    
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getTicket_price() {
        return ticket_price;
    }

    public int getBand_members() {
        return band_members;
    }

    public LocalDate getShow_date() {
        return show_date;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setTicket_price(float ticket_price) {
        this.ticket_price = ticket_price;
    }

    public void setBand_members(int band_members) {
        this.band_members = band_members;
    }

    public void setShow_date(LocalDate show_date) {
        this.show_date = show_date;
    }
    
}
