public class ExitGate {
    Building building;

    public ExitGate(Building building){
        this.building = building;
    }

    public void payParkingFee(Vehicle vehicle){
        int vehicleFloorNumber = vehicle.getFloorNumber();
        Floor floor = this.building.floorMap.get(vehicleFloorNumber);
        Slot slot = floor.slotMap.get(vehicle.vehicleNumber);
        int parkingFee = slot.slotPrize();
        System.out.println("You have to pay parking fee: " + parkingFee);
        floor.emptySlot(vehicle);
    }
}
