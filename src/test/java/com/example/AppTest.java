package com.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testAddpositiveNum()
    {
        assertEquals(30, App.add(10,20) );
    }
    public void testAddsmallnum()
    {
	assertEquals(15, App.add(10,5) );
    }
    public void testAddzero()
    {
	assertEquals(0, App.add(0,0) );
    }
}
