import java.util.LinkedList;

public class Main {
    // Mountain with the lowest element is found and output to screen
    public static void minElevation(LinkedList<Mountains> list) {
        // Declaring and init. lowestMtn variable
        String lowestMtn = null;
        // Takes elevation from first element in list and sets it as min
        double min = list.element().getElevation();

        // Enhanced for loop; elevation for every element in list is taken and lowest elevation is found
        for (Mountains someMtn : list) {
            // If the iterated element has an elevation lower than the min...
            if (someMtn.getElevation() < min) {
                // .. min is updated with lowest elevation ...
                min = someMtn.getElevation();
                // .. lowestMtn variable is given name of element w/ lowest elevation
                lowestMtn = someMtn.getName();
            }
        }
        // Outputs the name of the shortest mountain 
        System.out.printf("> The shortest mountain is " + lowestMtn + ".\n> It stands at " + min + " feet.");
        System.out.println();
        }

    // List of mountains is formatted and printed
    public static void printMountains(LinkedList<Mountains> list) {
        // Categories of data is printed with padding
        System.out.printf("%-30s %-20s %-17s %-20s\n", "Mountains", "Country", "Elevation in ft", "Elevation in m");

        // Enhanced for loop iterates through list of mountains
        for (Mountains mtn : list) {
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
        // Creating LinkedList named MountainList of type Mountains
        LinkedList<Mountains> MountainList = new LinkedList<Mountains>();

        // Creating Mountains
        Mountains MTOne = new Mountains("Chimborazo", "Ecuador", 20549.0);

        Mountains MTTwo = new Mountains("Matterhorn", "Switzerland", 14692.0);

        Mountains MTThree = new Mountains("Olympus", "Greece (Macedonia)", 9573.0);

        Mountains MTFour = new Mountains("Everest", "Nepal", 29029.0);

        Mountains MTFive = new Mountains("Mount Marcy - Adirondacks", "United States", 5344.0);

        Mountains MTSix = new Mountains("Mount Mitchell - Blue Ridge", "United States", 6684.0);

        Mountains MTSeven = new Mountains("Zugspitze", "Switzerland", 9719.0);

        // Adding Mountains to MountainList
        MountainList.add(MTOne);
        MountainList.add(MTTwo);
        MountainList.add(MTThree);
        MountainList.add(MTFour);
        MountainList.add(MTFive);
        MountainList.add(MTSix);
        MountainList.add(MTSeven);

        // Calling printMountains method to print mountains info
        printMountains(MountainList);

        // Calling minElevation method to print smallest mountain
        minElevation(MountainList);
        
    }
}