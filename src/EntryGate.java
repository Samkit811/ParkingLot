import java.util.Map;

public class EntryGate {
    Building building;

    public EntryGate(Building building){
        this.building = building;
    }

    public void bookSlot(Vehicle vehicle){
        boolean isSlotBooked = false;
        for (Map.Entry<Integer, Floor> entry : this.building.floorMap.entrySet()) {
            Integer floorNumber = entry.getKey();
            Floor floor = entry.getValue();
            if(floor.bookSlot(vehicle)){
                isSlotBooked = true;
                System.out.println("Congratulation We have booked a slot for you on floor: " + floorNumber);
                break;
            }
        }
        if(!isSlotBooked){
            throw new OutOfParkingSpace("Sorry, We don't have enough space to park your Vehicle");
        }
    }
}
