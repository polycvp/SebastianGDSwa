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
        airport.add(new Airport(3,"BUD","GMT+2"));
        airport.add(new Airport(4,"MMX","GMT+1"));
        airport.add(new Airport(5,"JFK","GMT-6"));
        airport.add(new Airport(6,"LHR","GMT"));
        airport.add(new Airport(7,"AMS","GMT+1"));
        airport.add(new Airport(8,"MUC","GMT+2"));
        airport.add(new Airport(9,"PHX","GMT-11"));
        airport.add(new Airport(10,"MIA","GMT-9"));
        planes.add(new Plane(1,20));
        planes.add(new Plane(2,10));
        planes.add(new Plane(3,15));
        planes.add(new Plane(4,17));
        planes.add(new Plane(5,56));
        planes.add(new Plane(6,34));
        planes.add(new Plane(7,41));
        planes.add(new Plane(8,35));
        timetable.add(new Timetable(1,datepickerStringToDate("20/10/2014"), datepickerStringToDate("21/10/2014"),250,airport.get(0), airport.get(1), planes.get(2)));
        timetable.add(new Timetable(2,datepickerStringToDate("19/10/2014"), datepickerStringToDate("19/10/2014"),150,airport.get(1), airport.get(2), planes.get(3)));
        timetable.add(new Timetable(3,datepickerStringToDate("30/10/2014"), datepickerStringToDate("30/11/2014"),215,airport.get(0), airport.get(0), planes.get(5)));
        timetable.add(new Timetable(4,datepickerStringToDate("17/10/2014"), datepickerStringToDate("17/10/2014"),281,airport.get(1), airport.get(6), planes.get(2)));
        timetable.add(new Timetable(5,datepickerStringToDate("17/10/2014"), datepickerStringToDate("18/10/2014"),109,airport.get(1), airport.get(4), planes.get(2)));
        timetable.add(new Timetable(6,datepickerStringToDate("19/10/2014"), datepickerStringToDate("20/10/2014"),98,airport.get(7), airport.get(8), planes.get(1)));
        timetable.add(new Timetable(7,datepickerStringToDate("30/10/2014"), datepickerStringToDate("31/10/2014"),350,airport.get(8), airport.get(1), planes.get(0)));
        timetable.add(new Timetable(8,datepickerStringToDate("20/10/2014"), datepickerStringToDate("26/10/2014"),783,airport.get(5), airport.get(0), planes.get(0)));
        timetable.add(new Timetable(9,datepickerStringToDate("25/10/2014"), datepickerStringToDate("25/10/2014"),244,airport.get(3), airport.get(1), planes.get(4)));
    
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
