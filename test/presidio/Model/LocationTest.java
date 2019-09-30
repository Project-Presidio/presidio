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
public class LocationTest {
    
    public LocationTest() {
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
     * Test of getCoordinate method, of class Location.
     */
    @Test
    public void testGetCoordinate() {
        System.out.println("getCoordinate");
        Coordinate expResult = new Coordinate(40.814796, -77.865311);
        Location instance = new Location(expResult, "Address");
        Coordinate result = instance.getCoordinate();
        assertEquals(expResult, result);

    }

    /**
     * Test of getAddress method, of class Location.
     */
    @Test
    public void testGetAddress() {
        System.out.println("getAddress");
        Location instance = new Location(new Coordinate(0,0), "Westgate Building, University Park, PA 16802");
        String expResult = "Westgate Building, University Park, PA 16802";
        String result = instance.getAddress();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCoordinatesAsDMS method, of class Location.
     */
    @Test
    public void testGetCoordinatesAsDMS() {
        System.out.println("getCoordinatesAsDMS");
        Location instance = new Location(new Coordinate(40.814796, -77.865311), "");
        String expResult = "40° 48' 53.266\" N 77° 51' 55.12\" W";
        String result = instance.getCoordinatesAsDMS();
        assertEquals(expResult, result);
    }

    /**
     * Test of updateLocation method, of class Location.
     */
    @Test
    public void testUpdateLocation_Coordinate() {
        System.out.println("updateLocation");
        Coordinate coordinate = new Coordinate(40.814796, -77.865311);
        Location instance = new Location(new Coordinate(0,0), "");
        instance.updateLocation(coordinate);
    }

    /**
     * Test of updateLocation method, of class Location.
     */
    @Test
    public void testUpdateLocation_String_String() {
        System.out.println("updateLocation");
        String latitude = "40.814796";
        String longitude = "-77.865311";
        Location instance = new Location(new Coordinate(0,0), "");
        instance.updateLocation(latitude, longitude);
    }

    /**
     * Test of updateLocation method, of class Location.
     */
    @Test
    public void testUpdateLocation_double_double() {
        System.out.println("updateLocation");
        double latitude = 40.814796;
        double longitude = -77.865311;
        Location instance = new Location(new Coordinate(0,0), "");
        instance.updateLocation(latitude, longitude);
    }
    
}
