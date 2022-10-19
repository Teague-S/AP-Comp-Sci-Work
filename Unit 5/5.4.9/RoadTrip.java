import java.util.*;

public class RoadTrip {
    public static final double RADIUS = 3963.1676;
    private String name;
    private double latitude;
    private double longitude;
    private double tripLength = 0;
    private int stops;
    private String output = "";
    ArrayList<String> names = new ArrayList<String>();
    ArrayList<Double> lat = new ArrayList<Double>();
    ArrayList<Double> longi = new ArrayList<Double>();

    public void addStop(String name, double latitude, double longitude) {

        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
        stops++;
        names.add(name);

        lat.add(latitude);
        longi.add(longitude);

        output = output + "\n" + stops + ". " + name + " (" + latitude + ", " + longitude + ")";

        if (stops >= 2) {
            tripLength = tripLength + distance();
        }

        /*
         * if (stops.size() > 0)
         * {
         * for(int i=0; i<lat.size(); i++)
         * {
         * System.out.println(lat.get(i));
         * }
         * System.out.println(lat.size());
         * }
         */

    }

    public int getNumberOfStops() {
        return stops;
    }

    public double getTripLength() {
        return tripLength;
    }

    public double distance() {
        double lat1 = Math.toRadians(lat.get(stops - 2));
        // System.out.println(lat.get(stops-2));
        double long1 = Math.toRadians(longi.get(stops - 2));
        // System.out.println(longi.get(stops-2));
        double lat2 = Math.toRadians(lat.get(stops - 1));
        // System.out.println(lat.get(stops-1));
        double long2 = Math.toRadians(longi.get(stops - 1));
        // System.out.println(longi.get(stops-1));
        double theCos = Math.sin(lat1) * Math.sin(lat2) +
                Math.cos(lat1) * Math.cos(lat2) * Math.cos(long1 - long2);
        double arcLength = Math.acos(theCos);
        return arcLength * RADIUS;
    }

    public String toString() {
        return output;
    }
}