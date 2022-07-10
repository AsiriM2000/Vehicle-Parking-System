package View.tm;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class VehicleDataTm {
    private String vehicleNumber;
    private String vehicleType;
    private String weight;
    private int passengers;

    public VehicleDataTm() {
    }

    public VehicleDataTm(String vehicleNumber, String vehicleType, String weight, int passengers) {
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
        this.weight = weight;
        this.passengers = passengers;
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

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    @Override
    public String toString() {
        return "VehicleDataTm{" +
                "vehicleNumber='" + vehicleNumber + '\'' +
                ", vehicleType='" + vehicleType + '\'' +
                ", weight='" + weight + '\'' +
                ", passengers=" + passengers +
                '}';
    }
}
