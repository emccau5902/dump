/**
 * Write a description of class roverRunner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.ArrayList;
import java.util.List;

public class roverGroup {

    List<Rover> rovers;
    
    public roverGroup() {
        this.rovers = new ArrayList<Rover>();
    }
    
    public void add(Rover rover) {
        rovers.add(rover);
    }
    
    public Rover find(String query) {
        
        for (Rover r : rovers) {
            String name = r.getName();
            
            if (name.equals(query)) {
                return r;
            }
        }
        
        return null;
    }
}
