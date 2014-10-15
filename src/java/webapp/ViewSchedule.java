/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webapp;

import dto.ScheduleDTO;
import facade.WAFacade;
import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author rvhaley
 */
public class ViewSchedule extends HttpServlet {


    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        RequestDispatcher dis = null;
        if (findKey(request) != null) {
            switch (findKey(request)) {
                case "select":
                    dis = request.getRequestDispatcher("selectSchedule.jsp");
                    break;
                case "schedule":
                    dis = request.getRequestDispatcher("schedule.jsp");
                    WAFacade waFacade = new WAFacade();
                    
                    String date = request.getParameter("date");
                    String airport1 = request.getParameter("airport1");
                    String airport2 = request.getParameter("airport2");
                    
                    List<ScheduleDTO> schedules = waFacade.getFlightsOnDate(date, airport1, airport2);
                    
                    request.setAttribute("schedules", schedules);
                    request.setAttribute("date", date);
                    request.setAttribute("airport1", airport1);
                    request.setAttribute("airport2", airport2);
                    
//                    System.out.println(date + " " + airport1 + " " + airport2);
                    break;
                default:
                    dis = request.getRequestDispatcher("error.jsp");
                    break;
            }
        } else {
            dis = request.getRequestDispatcher("error.jsp");
        }
        
        dis.forward(request, response);
    }

    private String findKey(HttpServletRequest request) {
        if (request.getParameter("command") != null) {
            return request.getParameter("command");
        }
        for (Object name : request.getParameterMap().keySet()) {
            String nameStr = (String) name;
            if (nameStr.endsWith("Button")) {
                return nameStr.substring(0, nameStr.length() - 6);
            }
        }
        return null;
    }

}
