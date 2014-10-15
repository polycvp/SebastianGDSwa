/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entity;

/**
 *
 * @author Paul
 * this class will handle the connection
 */
public class DbContext {
    
    public DummyDB getEntityManager() 
    {
        DummyDB dummy = new DummyDB();
        return dummy;
    }
}
