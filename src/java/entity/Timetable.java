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
public class Timetable {
    
    private int id;
    private double price;
    private String arrivalDate,departureDate;
    private Airport arrivalAirport,departureAirport;
    private Plane plane;
    
    public Timetable(int id, String arrivalDate, String departureDate, float price, 
            Airport arrivalAirport,Airport departureAirport,Plane plane) {
        
    }
}
