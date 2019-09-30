/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presidio.Model;

/**
 *
 * @author jxw5883
 */
public class Location {
    private Coordinate coordinate;
    private String address;

    public Location(Coordinate coordinate, String address) {
        this.coordinate = coordinate;
        this.address = address;
    }

    /**
     * @return the coordinate
     */
    public Coordinate getCoordinate() {
        return coordinate;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }
    
    /**
     * @return coordinate in the format of "40° 48' 53.2656'' N 77° 51' 55.1196'' W"
     */
    public String getCoordinatesAsDMS(){
        return coordinate.getLatitudeAsDMS() + " " + coordinate.getLognitudeAsDMS();
    }
   /**
    * Updates the coordinate parameter with a new coordinate.
    * @param coordinate
    */
    public void updateLocation(Coordinate coordinate){
        this.coordinate = coordinate;
    }
   /**
    * Updates the coordinate parameter using latitude and longitude Strings.
    * @param latitude
    * @param longitude 
    */
    public void updateLocation(String latitude, String longitude){
        double la = Double.parseDouble(latitude);
        double lo = Double.parseDouble(longitude);
        this.coordinate = new Coordinate(la,lo);
    }
   /**
    * Updates the coordinate parameter using latitude and longitude values.
    * @param latitude
    * @param longitude 
    */
    public void updateLocation(double latitude, double longitude){
        this.coordinate = new Coordinate(latitude, longitude);
    }
  
}
