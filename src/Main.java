/**
 * Parking lot mechanism
 *
 * Basic Design
 * vehicle with 2 wheel - one floor for them
 * vehicle with 4 wheel - one floor for them
 * 1 entry point
 * 1 exit point
 *
 * Complex Design : Any parameter can be multiple
 */

/**
 * flow of parking
 * first vehicle arrive - note time
 * entry point checking that slot is available or not - give receipt
 * go to the floor
 * when ou want to move out
 * exit point arrival
 * submit receipt
 * pay charge
 */

/**
 * CLass list
 * building
 * floor
 * vehicle >> 2 wheel and 4 wheel
 * Entry point
 * Exit point
 */

public class Main {
    public static void main(String[] args) {
        Building building = new Building(1, 10);
        EntryGate entryGate = new EntryGate(building);
        ExitGate exitGate = new ExitGate(building);

        Vehicle vehicle1 = new Vehicle(VehicleType.TWO_WHEELER, "GJ-04-1111");
        Vehicle vehicle2 = new Vehicle(VehicleType.FOUR_WHEELER, "GJ-04-1234");

        entryGate.bookSlot(vehicle1);
        entryGate.bookSlot(vehicle2);

        exitGate.payParkingFee(vehicle1);
        exitGate.payParkingFee(vehicle2);
    }
}