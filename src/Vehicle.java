public class Vehicle {
    VehicleType vehicleType;
    String vehicleNumber;
    private int floorNumber;

    public Vehicle(VehicleType vehicleType, String vehicleNumber){
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public int getFloorNumber() {
        return floorNumber;
    }
}
