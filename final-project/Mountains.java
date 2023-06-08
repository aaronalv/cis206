/*
 * File: Mountains.java
 * Description: This is class Mountains that runs with Main.java file for CIS-206 final
 * Created: June 8, 2023, 11:09 AM
 * Author: Aaron Alvarado
 * Email: aarona5488@student.vvc.edu
 */

public class Mountains {
    // Private fields name, country, and elevation are created
    private String name;
    private String country;
    private double elevation;

    // Constructor that requires name, country, and elevation
    public Mountains(String name, String country, double elevation) {
        setName(name);
        setCountry(country);
        setElevation(elevation);
    }

    // Setters
    public void setName (String name) {
        this.name = name;
    }

    public void setCountry (String country) {
        this.country = country;
    }

    public void setElevation (double elevation) {
        this.elevation = elevation;
    }

    // Getters
    public String getName () {
        return name;
    }

    public String getCountry () {
        return country;
    }

    public double getElevation () {
        return elevation;
    }

    // Methods
    public double toMeters () {
        double inMeters = (elevation * 3.2808);
        return inMeters;
    }
}
