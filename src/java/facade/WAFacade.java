/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import controller.FlightManager;
import dto.ScheduleDTO;

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
        return null;
    }
}
