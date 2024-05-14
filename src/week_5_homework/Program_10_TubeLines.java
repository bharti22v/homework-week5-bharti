package week_5_homework;

import java.util.HashMap;

/**
 * . Write a programme that tells you which line passes through particular stations.
 * Just use Zone 1 stations name.
 */


public class Program_10_TubeLines {

    // Method to create and populate the HashMap mapping stations to subway lines
    public static HashMap<String, String> createStationLineMap() {
        HashMap<String, String> stationLineMap = new HashMap<>();

        // Mapping stations to subway lines
        stationLineMap.put("King's Cross St Pancras", "Northern Line");
        stationLineMap.put("Euston", "Victoria Line");
        stationLineMap.put("Oxford Circus", "Central Line");
        stationLineMap.put("Green Park", "Victoria Line");
        stationLineMap.put("Victoria", "Victoria Line");
        stationLineMap.put("Vauxhall", "Victoria Line");
        stationLineMap.put("Stockwell", "Victoria Line");
        stationLineMap.put("Brixton", "Victoria Line");

        stationLineMap.put("Paddington", "District Line");
        stationLineMap.put("Baker Street", "Bakerloo Line");
        stationLineMap.put("Embankment", "Circle Line");
        stationLineMap.put("Tower Hill", "Circle Line");
        stationLineMap.put("Liverpool Street", "Central Line");
        stationLineMap.put("Moorgate", "Circle Line");
        stationLineMap.put("Kings Cross St Pancras", "Piccadily Line");

        return stationLineMap;
    }

    // Method to find which line passes through a particular station
    public static String findLineForStation(HashMap<String, String> stationLineMap, String station) {
        // Check if the station is mapped to a subway line
        if (stationLineMap.containsKey(station)) {
            return stationLineMap.get(station);
        } else {
            return "No subway line passes through this station";
        }
    }

    public static void main(String[] args) {
        // Create and populate the HashMap mapping stations to subway lines
        HashMap<String, String> stationLineMap = createStationLineMap();

        // Test the method by finding which line passes through a particular station
        String station = "Shepherds Bush";
        String line = findLineForStation(stationLineMap, station);
        System.out.println("The subway line passing through station " + station + " is: " +line);
    }
}

