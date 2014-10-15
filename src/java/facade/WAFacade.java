/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import controller.FlightManager;
import dto.ScheduleDTO;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Paul
 */
public class WAFacade {

    private FlightManager fm;

    public WAFacade() {
        fm = new FlightManager();
    }

    public ScheduleDTO getFlightsOnDate(String date, String airport1, String airport2) {
        try {
            Date parse = new SimpleDateFormat("dd/MM/yyyy").parse(date);
            System.out.println(parse);
        } catch (ParseException ex) {
            Logger.getLogger(WAFacade.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
