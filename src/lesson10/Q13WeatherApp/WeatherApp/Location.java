package lesson10.Q13WeatherApp.WeatherApp;

import java.sql.Date;

public class Location {
    private int id;
    private String favlocation;
    private Date date;

    public Location(int id, String favlocation, Date date) {

        this.id = id;
        this.favlocation = favlocation;
        this.date = date;

    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setfavlocation(String favlocation) {
        this.favlocation = favlocation;
    }

    public String getfavlocation() {
        return favlocation;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
}
