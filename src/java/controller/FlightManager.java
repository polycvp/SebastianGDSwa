/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import dto.ScheduleDTO;
import entity.Airport;
import entity.DbContext;
import entity.DummyDB;
import entity.Timetable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Paul
 */
public class FlightManager extends AbstractController
{
    private List<ScheduleDTO> timeSchedules;
    
    public FlightManager()
    {
    }
    
    public List<ScheduleDTO> getFlightsOnDate(String date, String departure, String arrival)
    {
        timeSchedules = new ArrayList<ScheduleDTO>();
        Date departureDate = null;
        try {
            departureDate = new SimpleDateFormat("dd-MM-yyyy").parse(date);
            System.out.println(departureDate);
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        try {
            // Some dummy data to test JSP page with
            timeSchedules.add(new ScheduleDTO(new SimpleDateFormat("dd-MM-yy:HH:mm:SS").parse(date + ":06:00:00"), new SimpleDateFormat("dd-MM-yy:HH:mm:SS").parse(date + ":10:00:00"), "AIR123", 34));
            timeSchedules.add(new ScheduleDTO(new SimpleDateFormat("dd-MM-yy:HH:mm:SS").parse(date + ":08:00:00"), new SimpleDateFormat("dd-MM-yy:HH:mm:SS").parse(date + ":12:00:00"), "AIR123", 34));
            timeSchedules.add(new ScheduleDTO(new SimpleDateFormat("dd-MM-yy:HH:mm:SS").parse(date + ":12:00:00"), new SimpleDateFormat("dd-MM-yy:HH:mm:SS").parse(date + ":16:00:00"), "AIR123", 34));
            timeSchedules.add(new ScheduleDTO(new SimpleDateFormat("dd-MM-yy:HH:mm:SS").parse(date + ":14:00:00"), new SimpleDateFormat("dd-MM-yy:HH:mm:SS").parse(date + ":18:00:00"), "AIR123", 34));
            timeSchedules.add(new ScheduleDTO(new SimpleDateFormat("dd-MM-yy:HH:mm:SS").parse(date + ":16:00:00"), new SimpleDateFormat("dd-MM-yy:HH:mm:SS").parse(date + ":20:00:00"), "AIR123", 34));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        try
        {
            DbContext context = new DbContext();
            DummyDB em = context.getEntityManager();
            ArrayList<Timetable> timetables = em.getTimetable();
            /*here process the timetable array into a scheduleDTO validate it with the 
            required criteria departureDate, departure and arrival and pass it forward
            */
            for (Timetable t : timetables)
            {
                if(isOnSameDepartureDate(departureDate, t.getDepartureDate()) 
                        && t.getDepartureAirport().getCode().equalsIgnoreCase(departure)
                        && t.getArrivalAirport().getCode().equalsIgnoreCase(arrival))
                {
                    timeSchedules.add(
                            new ScheduleDTO(
                                    t.getDepartureDate(), t.getArrivalDate(), t.getPlane().getCarrier().getCarrierCode(),
                                    t.getPlane().getNoOfSeats()));
                }
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return timeSchedules;
    }
    
    private boolean isOnSameDepartureDate(Date first, Date second)
    {
        try
        {
            Calendar cal1 = Calendar.getInstance();
            cal1.setTime(first);
            Calendar cal2 = Calendar.getInstance();
            cal2.setTime(second);
            
            return cal1.get(Calendar.YEAR) == cal2.get(Calendar.YEAR) &&
	                  cal1.get(Calendar.DAY_OF_YEAR) == cal2.get(Calendar.DAY_OF_YEAR);
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return false;
        }
    }
}
