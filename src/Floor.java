import java.util.HashMap;
import java.util.Map;

public class Floor {
    int totalSlot;
    int takenSlot;
    Map<String, Slot> slotMap = new HashMap<>();
    Vehicle vehicle;
    int floorNumber;

    public Floor(int totalSlot, int floorNumber){
        this.takenSlot = 0;
        this.totalSlot = totalSlot;
        this.floorNumber = floorNumber;
    }

    public boolean bookSlot(Vehicle vehicle){
        this.vehicle = vehicle;
        if(checkSlotIsAvailable(this.vehicle.vehicleType)){
            reserveSlot();
            return true;
        } else {
            return false;
        }
    }

    private boolean checkSlotIsAvailable(VehicleType vehicleType){
        boolean isSlotAvailable = false;
        switch (vehicleType){
            case TWO_WHEELER: {
                if(this.totalSlot - this.takenSlot >=1){
                    isSlotAvailable = true;
                }
            }

            case FOUR_WHEELER: {
                if(this.totalSlot - this.takenSlot >=2){
                    isSlotAvailable = true;
                }
            }

            default:
                break;
        }
        return isSlotAvailable;
    }

    private void reserveSlot(){
        this.vehicle.setFloorNumber(this.floorNumber);
        slotMap.put(this.vehicle.vehicleNumber ,new Slot(this.vehicle));
        switch (this.vehicle.vehicleType){
            case TWO_WHEELER: {
                this.takenSlot++;
            }

            case FOUR_WHEELER:{
                this.totalSlot+=2;
            }

            default:
                break;
        }
    }

    public void emptySlot(Vehicle vehicle){
        slotMap.remove(vehicle.vehicleNumber);
        switch (vehicle.vehicleType){
            case TWO_WHEELER: {
                this.takenSlot--;
            }

            case FOUR_WHEELER:{
                this.totalSlot-=2;
            }

            default:
                break;
        }
    }
}
