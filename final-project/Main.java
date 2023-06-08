/*
 * File: Main.java
 * Description: This is the main file for CIS-206 file; also requires Mountain.java
 * Created: June 8, 2023, 11:09 AM
 * Author: Aaron Alvarado
 * Email: aarona5488@student.vvc.edu
 */

import java.util.LinkedList;

public class Main {
    // Mountain with the lowest element is found and output to screen
    public static void minElevation(LinkedList<Mountain> list) {
        // Declaring and init. lowestMtn variable
        String lowestMtn = null;
        // Takes elevation from first element in list and sets it as min
        double min = list.element().getElevation();

        // Enhanced for loop; elevation for every element in list is taken and lowest elevation is found
        for (Mountain someMtn : list) {
            // If the iterated element has an elevation lower than the min...
            if (someMtn.getElevation() < min) {
                // .. min is updated with lowest elevation ...
                min = someMtn.getElevation();
                // .. lowestMtn variable is given name of element w/ lowest elevation
                lowestMtn = someMtn.getName();
            }
        }
        // Outputs the name of the shortest mountain 
        System.out.printf("The shortest mountain is " + lowestMtn + ".\nIt stands at " + min + " feet.");
        System.out.println();
        }

    // List of Mountain is formatted and printed
    public static void printMountain(LinkedList<Mountain> list) {
        // Categories of data is printed with padding
        System.out.printf("%-30s %-20s %-17s %-20s\n", "Mountain", "Country", "Elevation in ft", "Elevation in m");

        // Enhanced for loop iterates through list of Mountain
        for (Mountain mtn : list) {
            // Name, country, and elevations are taken and stored in variables
            String name = mtn.getName();
            String country = mtn.getCountry();
            double elevationFT = mtn.getElevation();
            double elevationMeters = mtn.toMeters();
            // Information is formatted (padding and and printed with 2 and 3 decimal places)
            System.out.printf("%-30s %-20s %-17.2f %-20.3f\n", name, country, elevationFT, elevationMeters);
        }
        System.out.println();
    }
    
    public static void main(String [] args) {
        // Creating LinkedList named MountainList of type Mountain
        LinkedList<Mountain> MountainList = new LinkedList<Mountain>();

        // Creating Mountain
        Mountain MTOne = new Mountain("Chimborazo", "Ecuador", 20549.0);

        Mountain MTTwo = new Mountain("Matterhorn", "Switzerland", 14692.0);

        Mountain MTThree = new Mountain("Olympus", "Greece (Macedonia)", 9573.0);

        Mountain MTFour = new Mountain("Everest", "Nepal", 29029.0);

        Mountain MTFive = new Mountain("Mount Marcy - Adirondacks", "United States", 5344.0);

        Mountain MTSix = new Mountain("Mount Mitchell - Blue Ridge", "United States", 6684.0);

        Mountain MTSeven = new Mountain("Zugspitze", "Switzerland", 9719.0);

        // Adding Mountain to MountainList
        MountainList.add(MTOne);
        MountainList.add(MTTwo);
        MountainList.add(MTThree);
        MountainList.add(MTFour);
        MountainList.add(MTFive);
        MountainList.add(MTSix);
        MountainList.add(MTSeven);

        // Calling printMountain method to print Mountain info
        printMountain(MountainList);

        // Calling minElevation method to print smallest mountain
        minElevation(MountainList);
        
    }
}