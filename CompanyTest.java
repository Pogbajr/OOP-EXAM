import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CompanyTest {

    @Test
    void testScheduleVehicleWhenAvailable() {
        // Arrange
        Company company = new Company();
        Passenger passenger = new Passenger();
        company.addVehicle(new Vehicle()); // Assume method to add vehicle

        // Act
        boolean result = company.scheduleVehicle(passenger);

        // Assert
        assertTrue(result, "Should schedule vehicle when one is available");
    }

    @Test
    void testScheduleVehicleWhenUnavailableIncrementsLostFares() {
        // Arrange
        Company company = new Company();
        Passenger passenger = new Passenger();
        int initialLostFares = company.getLostFaresCount();

        // Act
        boolean result = company.scheduleVehicle(passenger);

        // Assert
        assertFalse(result, "Should fail to schedule when no vehicles are available");
        assertEquals(initialLostFares + 1, company.getLostFaresCount(), 
                     "Lost fares should increment on scheduling failure");
    }
}