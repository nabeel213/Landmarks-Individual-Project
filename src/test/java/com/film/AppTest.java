package com.film;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import com.film.controller.HomeController;


public class AppTest {
	
    @Test
    public void testApp(){
    	
    	HomeController hc = new HomeController();
    	
    	String result = hc.home();
    	assertEquals( result, "Film Collection, reporting for duty");
      
    }
}
