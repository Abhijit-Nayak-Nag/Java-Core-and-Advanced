package Day_10.SortingQns;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Flight {
    int id;
    String departureCity;
    String arrivalCity;
    int departureTime;
    int arrivalTime;
    public Flight (int id, String departureCity, String arrivalCity, int departureTime, int arrivalTime){
        this.id= id;
        this.departureCity= departureCity;
        this.arrivalCity= arrivalCity;
        this.departureTime=departureTime;
        this.arrivalTime=arrivalTime;
    }
}
public class MultiCityTripFinder {
    public static void main(String[] args) {
        List<Flight>flights= new ArrayList<>();
        flights.add(new Flight(1, "A" , "B", 0, 100));
        flights.add(new Flight(2, "A" , "C", 0, 120));
        flights.add(new Flight(3, "B" , "D", 130, 200));
        flights.add(new Flight(4, "B" , "C", 150, 180));
        flights.add(new Flight(5, "C" , "D", 190, 240));
        String departureCity= "A";
        String arrivalCity= "D";
        List<List<Flight>>multiCityTrips=findMultiCityTrips(flights,departureCity,arrivalCity);
        for(List<Flight> trip: multiCityTrips){
            System.out.println("Trip:");
            for(Flight flight: trip){
                System.out.println(" Flight " + flight.id + ": " +flight.departureTime + ", Arrival :" + flight.arrivalTime);
            }
            System.out.println();
        }
    }
    public static List<List<Flight>>findMultiCityTrips(List<Flight>flights, String departureCity, String arrivalCity){
        List<List<Flight>> result = new ArrayList<>();
        List<Flight> currentTrip = new ArrayList<>();
        dfs(flights, departureCity, arrivalCity, currentTrip, result);
        return result;
    }
    private static void dfs(List<Flight> flights, String currentCity, String arrivalCity,
                            List<Flight> currentTrip,List<List<Flight>>result){
        if(currentCity.equals(arrivalCity)){
            result.add(new ArrayList<>(currentTrip));
            return;
        }
        for(Flight flight : flights){
            if(flight.departureCity.equals(currentCity) && flight.departureTime>=getLastArrivalTime(currentTrip)){
                currentTrip.add(flight);
                dfs(flights, flight.arrivalCity, arrivalCity,currentTrip, result);
                currentTrip.remove(currentTrip.size()-1);
            }
        }
    }
    private static int getLastArrivalTime(List<Flight> trip){
        if(trip.isEmpty()){
            return 0;
        }
        return trip.get(trip.size()-1).arrivalTime;
    }
}
