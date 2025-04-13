import java.time.LocalDateTime;

public class Slot {
    // FUTURE SCOPE
    LocalDateTime entryTime;
    Vehicle vehicle;

    public Slot(Vehicle vehicle){
        this.vehicle = vehicle;
    }

    public int slotPrize(){
        switch (this.vehicle.vehicleType){
            case TWO_WHEELER:
                return 100;

            case FOUR_WHEELER:
                return 200;

            default:
                return 0;
        }
    }

    public int spaceTaken(){
        switch (this.vehicle.vehicleType){
            case TWO_WHEELER:
                return 1;

            case FOUR_WHEELER:
                return 2;

            default:
                return 0;
        }
    }
}
