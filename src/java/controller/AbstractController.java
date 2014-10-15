/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author rvhaley
 */
public abstract class AbstractController {
    
    protected Date datepickerStringToDate(String date) {
        Date result = null;
        try {
            result = new SimpleDateFormat("dd/MM/yyyy").parse(date);
        } catch (ParseException ex) {
            System.out.println("Error  parsing date string in AbstractController");
            ex.printStackTrace();
        }
        return result;
    }
}
