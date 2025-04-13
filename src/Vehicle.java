public class Vehicle {
    VehicleType vehicleType;
    String vehicleNumber;
    private int floorNumber;

    public Vehicle(VehicleType vehicleType, String vehicleNumber){
        this.vehicleType = vehicleType;
        this.vehicleNumber = vehicleNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public int getFloorNumber() {
        return floorNumber;
    }
}
