package il.co.bat.shlomi.javaproject.model.entities;

import android.location.Location;

import java.sql.Time;
import java.util.Timer;

public class Ride {

    TypeOfRide typeOfRide;
    Location startLocation;
    Location endLocation;
    Time startTime;
    Time endTime;
    String name;
    int celNumber;
    String email;
    public Ride(TypeOfRide typeOfRide, Location startLocation, Location endLocation, Time startTime, Time endTime, String name, int celNumber, String email) {
        this.typeOfRide = typeOfRide;
        this.startLocation = startLocation;
        this.endLocation = endLocation;
        this.startTime = startTime;
        this.endTime = endTime;
        this.name = name;
        this.celNumber = celNumber;
        this.email = email;
    }

    public Location getStartLocation() {

        return startLocation;
    }

    public void setStartLocation(Location startLocation) {
        this.startLocation = startLocation;
    }

    public Location getEndLocation() {
        return endLocation;
    }

    public void setEndLocation(Location endLocation) {
        this.endLocation = endLocation;
    }


    public TypeOfRide getTypeOfRide() {
        return typeOfRide;
    }

    public void setTypeOfRide(TypeOfRide typeOfRide) {
        this.typeOfRide = typeOfRide;
    }


    public Time getStartTime() {
        return startTime;
    }

    public void setStartTime(Time startTime) {
        this.startTime = startTime;
    }

    public Time getEndTime() {
        return endTime;
    }

    public void setEndTime(Time endTime) {
        this.endTime = endTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCelNumber() {
        return celNumber;
    }

    public void setCelNumber(int celNumber) {
        this.celNumber = celNumber;
    }

    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }



}
