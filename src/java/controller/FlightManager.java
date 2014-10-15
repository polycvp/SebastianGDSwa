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
            ArrayList<Timetable> timetable = em.getTimetable();
            /*here process the timetable array into a scheduleDTO validate it with the 
            required criteria departureDate, departure and arrival and pass it forward
            */
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
           return timeSchedules; 
        }
    }
}
