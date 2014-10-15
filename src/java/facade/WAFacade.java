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
import java.util.ArrayList;
import java.util.Date;
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
        Date parse = null;
        try {
            parse = new SimpleDateFormat("dd-MM-yyyy").parse(date);
            System.out.println(parse);
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        List<ScheduleDTO> schedules = new ArrayList<>();
        try {
            // Some dummy data to test JSP page with
            schedules.add(new ScheduleDTO(new SimpleDateFormat("dd-MM-yy:HH:mm:SS").parse(date + ":06:00:00"), new SimpleDateFormat("dd-MM-yy:HH:mm:SS").parse(date + ":10:00:00"), "AIR123", 35));
            schedules.add(new ScheduleDTO(new SimpleDateFormat("dd-MM-yy:HH:mm:SS").parse(date + ":08:00:00"), new SimpleDateFormat("dd-MM-yy:HH:mm:SS").parse(date + ":12:00:00"), "AIR123", 17));
            schedules.add(new ScheduleDTO(new SimpleDateFormat("dd-MM-yy:HH:mm:SS").parse(date + ":12:00:00"), new SimpleDateFormat("dd-MM-yy:HH:mm:SS").parse(date + ":16:00:00"), "AIR123", 93));
            schedules.add(new ScheduleDTO(new SimpleDateFormat("dd-MM-yy:HH:mm:SS").parse(date + ":14:00:00"), new SimpleDateFormat("dd-MM-yy:HH:mm:SS").parse(date + ":18:00:00"), "AIR123", 22));
            schedules.add(new ScheduleDTO(new SimpleDateFormat("dd-MM-yy:HH:mm:SS").parse(date + ":16:00:00"), new SimpleDateFormat("dd-MM-yy:HH:mm:SS").parse(date + ":20:00:00"), "AIR123", 7));
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return schedules;
    }
}
