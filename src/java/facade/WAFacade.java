/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import controller.FlightManager;
import dto.ScheduleDTO;
import java.util.List;

/**
 *
 * @author Paul
 */
public class WAFacade {

    private FlightManager fm;

    public WAFacade() {
        fm = new FlightManager();
    }

    public List<ScheduleDTO> getFlightsOnDate(String date, String airport1, String airport2) {
        System.out.println("here");
        return fm.getFlightsOnDate(date, airport1, airport2);
    }
}
