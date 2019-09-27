package presidio;

import java.util.ArrayList;
import java.util.HashMap;

public class Alert {

    private String threat;
    private String civilianDetails;
    private Location location;

    private HashMap<String, String> contactNumbers;

    /**
     * @return the threat
     */
    public String getThreat() {
        return threat;
    }

    /**
     * @param threat the threat to set
     */
    public void setThreat(String threat) {
        this.threat = threat;
    }

    /**
     * @return the civilianDetails
     */
    public String getCivilianDetails() {
        return civilianDetails;
    }

    /**
     * @param civilianDetails the civilianDetails to set
     */
    public void setCivilianDetails(String civilianDetails) {
        this.civilianDetails = civilianDetails;
    }

    /**
     * @return the location
     */
    public Location getLocation() {
        return location;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(Location location) {
        this.location = location;
    }

    /**
     * @return the contactNumbers
     */
    public HashMap<String, String> getContactNumbers() {
        return contactNumbers;
    }

    /**
     * @param contactNumbers the contactNumbers to set
     */
    public void setContactNumbers(HashMap<String, String> contactNumbers) {
        this.contactNumbers = contactNumbers;
    }

    public Alert(String threat, String civilianDetails, Location location) {
        this.threat = threat;
        this.civilianDetails = civilianDetails;
        this.location = location;
        this.contactNumbers = new HashMap();
        contactNumbers.put("Rescue Team", "+2222");
        contactNumbers.put("Medical Team", "3333");
        contactNumbers.put("Police", "4444");

    }
    
    public String determineContact(){
        if (threat.equals("Rescue Team")){
            return contactNumbers.get(0);
        }
        else if (threat.equals("Medical Team")){
            return contactNumbers.get(1);
            
        }
        
        else if (threat.equals("Police")) {
                    return contactNumbers.get(2);
    }
        return "Could Not Find Number";
    
    }

}
