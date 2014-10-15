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
        timeSchedules = new ArrayList<ScheduleDTO>();
    }
    
    public List<ScheduleDTO> getFlightsOnDate(Date departureDate, Airport departure, Airport arrival)
    {
        
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
                if(isOnSameDepartureDate(departureDate, t.getDepartureDate()))
                {
                    timeSchedules.add(
                            new ScheduleDTO(
                                    departureDate, t.getArrivalDate(), t.getPlane().getCarrier().getCarrierCode(),
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
