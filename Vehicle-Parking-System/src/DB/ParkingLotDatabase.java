package DB;

import Module.ParkingLot;

import java.util.ArrayList;

public class ParkingLotDatabase {
    private static int maxCapacity = 14;
    public static ArrayList<ParkingLot> parkingLots = new ArrayList<>(maxCapacity);
    static {
        parkingLots.add(new ParkingLot("","","","",""));
    }
}
