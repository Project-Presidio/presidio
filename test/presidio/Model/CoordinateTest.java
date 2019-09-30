/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presidio.Model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author amersel
 */
public class CoordinateTest {
    
    public CoordinateTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getLongitude method, of class Coordinate.
     */
    @Test
    public void testGetLongitude() {
        System.out.println("getLongitude");
        Coordinate instance = new Coordinate(46.865610,23.196640);
        double expResult = 23.196640;
        double result = instance.getLongitude();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setLongitude method, of class Coordinate.
     */
    @Test
    public void testSetLongitude() {
        System.out.println("setLongitude");
        double longitude = 0.0;
        Coordinate instance = new Coordinate(46.865610,23.196640);
        instance.setLongitude(longitude);
    }

    /**
     * Test of getLattitude method, of class Coordinate.
     */
    @Test
    public void testGetLattitude() {
        System.out.println("getLattitude");
        Coordinate instance = new Coordinate(46.865610,23.196640);
        double expResult = 46.865610;
        double result = instance.getLatitude();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setLattitude method, of class Coordinate.
     */
    @Test
    public void testSetLattitude() {
        System.out.println("setLattitude");
        double lattitude = 0.0;
        Coordinate instance = new Coordinate(46.865610,23.196640);
        instance.setLatitude(lattitude);
    }

    /**
     * Test of getLognitudeAsDMS method, of class Coordinate.
     */
    @Test
    public void testGetLognitudeAsDMS() {
        System.out.println("getLognitudeAsDMS");
        Coordinate instance = new Coordinate(46.865610,23.196640);
        String expResult = "23° 11' 47.904\" E";
        String result = instance.getLognitudeAsDMS();
        assertEquals(expResult, result);
    }

    /**
     * Test of getLatitudeAsDMS method, of class Coordinate.
     */
    @Test
    public void testGetLatitudeAsDMS() {
        System.out.println("getLatitudeAsDMS");
        Coordinate instance = new Coordinate(46.865610,23.196640);
        String expResult = "46° 51' 56.196\" N";
        String result = instance.getLatitudeAsDMS();
        assertEquals(expResult, result);
    }
    
}
