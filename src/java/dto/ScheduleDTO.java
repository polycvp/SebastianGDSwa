/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import java.util.Date;

/**
 *
 * @author Paul
 */
public class ScheduleDTO {

    private Date departureDate;
    private Date arrivalDate;
    private String carrierCode;
    private int noOfFreeSeats;

    public ScheduleDTO(Date departureDate, Date arrivalDate, String carrierCode, int noOfFreeSeats) {
        this.departureDate = departureDate;
        this.arrivalDate = arrivalDate;
        this.carrierCode = carrierCode;
        this.noOfFreeSeats = noOfFreeSeats;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }

    public Date getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(Date arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public String getCarrierCode() {
        return carrierCode;
    }

    public void setCarrierCode(String carrierCode) {
        this.carrierCode = carrierCode;
    }

    public int getNoOfFreeSeats() {
        return noOfFreeSeats;
    }

    public void setNoOfFreeSeats(int noOfFreeSeats) {
        this.noOfFreeSeats = noOfFreeSeats;
    }

}
