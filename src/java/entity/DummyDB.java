/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Paul
 */
public class DummyDB {
    //holds arrays of dummy data for development
    private ArrayList<Plane> planes = new ArrayList<Plane>();
    private ArrayList<Seat> seat = new ArrayList<Seat>();
    private ArrayList<Timetable> timetable = new ArrayList<Timetable>();
    private ArrayList<Airport> airport = new ArrayList<Airport>();
    private FlightCarrier flightCarrier;
    
    public DummyDB() {
        flightCarrier = new FlightCarrier("OX");
        airport.add(new Airport(1,"CPH","GMT+3"));
        airport.add(new Airport(2,"LAX","GMT+9"));
        planes.add(new Plane(1,20));
        planes.add(new Plane(2,10));
        planes.add(new Plane(3,15));
        planes.add(new Plane(4,17));
        timetable.add(new Timetable(1,datepickerStringToDate("15/10/2014"), datepickerStringToDate("16/10/2014"),250,
                airport.get(0), airport.get(1), planes.get(2)));
    }
    
    private Date datepickerStringToDate(String date) {
        Date result = null;
        try {
            result = new SimpleDateFormat("dd/MM/yyyy").parse(date);
        } catch (ParseException ex) {
            System.out.println("Error  parsing date string in DummyDB");
        }
        return result;
    }

    public ArrayList<Plane> getPlanes() {
        return planes;
    }

    public void setPlanes(ArrayList<Plane> planes) {
        this.planes = planes;
    }

    public ArrayList<Seat> getSeat() {
        return seat;
    }

    public void setSeat(ArrayList<Seat> seat) {
        this.seat = seat;
    }

    public ArrayList<Timetable> getTimetable() {
        return timetable;
    }

    public void setTimetable(ArrayList<Timetable> timetable) {
        this.timetable = timetable;
    }

    public ArrayList<Airport> getAirport() {
        return airport;
    }

    public void setAirport(ArrayList<Airport> airport) {
        this.airport = airport;
    }
    
}
