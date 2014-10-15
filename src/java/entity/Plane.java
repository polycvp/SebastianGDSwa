/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entity;

/**
 *
 * @author Paul
 */
public class Plane {
    
    private String name;
    private int noOfSeats;
    private FlightCarrier carrier;
    
    public Plane(int id,int noOfSeats,FlightCarrier carrier) {
        // id has to have three digits
        this.name = carrier.getCarrierCode()+id;
        this.noOfSeats = noOfSeats;
        this.carrier = carrier;
    }

    public String getName() {
        return name;
    }

    public void setName(int id) {
        this.name = carrier.getCarrierCode()+id;
    }

    public FlightCarrier getCarrier() {
        return carrier;
    }

    public void setCarrier(FlightCarrier carrier) {
        this.carrier = carrier;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }
    
    
}
