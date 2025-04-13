public class ExitGate {
    Building building;

    public ExitGate(Building building){
        this.building = building;
    }

    public void payParkingFee(Vehicle vehicle){
        int vehicleFloorNumber = vehicle.getFloorNumber();
        Floor floor = this.building.floorMap.get(vehicleFloorNumber);
        if(floor == null){
            throw new InvalidFloor("There is no floor value assign to this vehicle i.e. this vehicle is not parked in this facility");
        }
        Slot slot = floor.slotMap.get(vehicle.vehicleNumber);
        if(floor.emptySlot(vehicle)){
            int parkingFee = slot.slotPrize();
            System.out.println("You have to pay parking fee: " + parkingFee);
        } else {
            throw new InvalidVehicleInfo("Your vehicle information is wrong.");
        }
    }
}
