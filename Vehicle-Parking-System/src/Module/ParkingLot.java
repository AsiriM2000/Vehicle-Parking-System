package Module;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private String vehicleNumber;
    private String vehicleType;
    private String driverName;
    private String dateTime;
    private String slotNum;


    public ParkingLot() {
    }

    public ParkingLot(String vehicleNumber, String vehicleType, String driverName, String dateTime, String slotNum) {
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
        this.driverName = driverName;
        this.dateTime = dateTime;
        this.slotNum = slotNum;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getSlotNum() {
        return slotNum;
    }

    public void setSlotNum(String slotNum) {
        this.slotNum = slotNum;
    }

    @Override
    public String toString() {
        return "ParkingLot{" +
                "vehicleNumber='" + vehicleNumber + '\'' +
                ", vehicleType='" + vehicleType + '\'' +
                ", driverName='" + driverName + '\'' +
                ", dateTime='" + dateTime + '\'' +
                ", slotNum='" + slotNum + '\'' +
                '}';
    }
}
