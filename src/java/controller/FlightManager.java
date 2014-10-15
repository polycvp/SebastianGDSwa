/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import dto.ScheduleDTO;
import entity.Airport;
import entity.DbContext;
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
    
    public List<ScheduleDTO> getFlightsOnDate(Date date, Airport departure, Airport arrival)
    {
        
        try
        {
            DbContext db = new DbContext();
            
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
