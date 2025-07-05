import java.util.Random;

public class PassengerSource {
    private Company company;
    private Random random;

    // Constructor taking a Company object
    public PassengerSource(Company company) {
        this.company = company;
        this.random = new Random();
    }

    // Request pickup, create passenger, and schedule vehicle
    public boolean requestPickup() {
        // Create a new Passenger
        Passenger passenger = new Passenger();

        // Generate random pickup and destination locations
        Location pickup = new Location(random.nextInt(101), random.nextInt(101));
        Location destination = new Location(random.nextInt(101), random.nextInt(101));

        // Assign locations to passenger
        passenger.setPickupLocation(pickup);
        passenger.setDestinationLocation(destination);

        // Schedule vehicle via company
        return company.scheduleVehicle(passenger);
    }
}