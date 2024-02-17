package com.mentorbabaa.selenium;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    
    @Test
    public void testSum() {
    	Calculator cal = new Calculator();
    	assertEquals(50, cal.sum(10, 40));
    }
    
    @Test
    public void testSubstract() {
    	Calculator cal = new Calculator();
    	assertEquals(20, cal.substract(40, 20));
    }
    
    
    
}
