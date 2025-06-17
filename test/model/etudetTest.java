/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ZY LAPTOP
 */
public class etudetTest {
    
    public etudetTest() {
    }
    
  
    @Test
    public void testCalcul() {
        System.out.println("calcul");
        
       
         etudet instance = new etudet ("xx",5,7);
        
       
        double result = instance.calcul(5,7);
        assertEquals(6, result, 0.0);
       
        
    }
    
}
