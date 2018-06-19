package questions;

import java.util.Date;

public class User {
    private String [] phones;

    private int Id;

    private Date date;

    public String[] getPhones() {
        if (phones.length != 0)
        return phones;
        //logic
        else return null;
    }

    public void setPhones(String[] phones) {
        this.phones = phones;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        Date date1 = new Date();
        this.date = date;
    }
}
