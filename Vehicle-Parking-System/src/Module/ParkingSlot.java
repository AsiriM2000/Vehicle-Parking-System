package Module;

public class ParkingSlot {
    private String parkingSlotNumber;
    private String parkingVehicleType;
    private String parkingSlotStatus;

    public ParkingSlot() {
    }

    public ParkingSlot(String parkingSlotNumber, String parkingVehicleType, String parkingSlotStatus) {
        this.parkingSlotNumber = parkingSlotNumber;
        this.parkingVehicleType = parkingVehicleType;
        this.parkingSlotStatus = parkingSlotStatus;
    }

    public String getParkingSlotNumber() {
        return parkingSlotNumber;
    }

    public void setParkingSlotNumber(String parkingSlotNumber) {
        this.parkingSlotNumber = parkingSlotNumber;
    }

    public String getParkingVehicleType() {
        return parkingVehicleType;
    }

    public void setParkingVehicleType(String parkingVehicleType) {
        this.parkingVehicleType = parkingVehicleType;
    }

    public String getParkingSlotStatus() {
        return parkingSlotStatus;
    }

    public void setParkingSlotStatus(String parkingSlotStatus) {
        this.parkingSlotStatus = parkingSlotStatus;
    }

    @Override
    public String toString() {
        return "ParkingSlotDatabase{" +
                "parkingSlotNumber='" + parkingSlotNumber + '\'' +
                ", parkingVehicleType='" + parkingVehicleType + '\'' +
                ", parkingSlotStatus='" + parkingSlotStatus + '\'' +
                '}';
    }
}
