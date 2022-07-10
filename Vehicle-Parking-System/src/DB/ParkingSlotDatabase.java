package DB;

import Module.ParkingSlot;

import java.util.ArrayList;

public class ParkingSlotDatabase {
    public static ArrayList<ParkingSlot> parkingSlots = new ArrayList<>();
    static {
        parkingSlots.add(new ParkingSlot("01","Van","NotUse"));
        parkingSlots.add(new ParkingSlot("02","Van","NotUse"));
        parkingSlots.add(new ParkingSlot("03","Van","NotUse"));
        parkingSlots.add(new ParkingSlot("04","Van","NotUse"));
        parkingSlots.add(new ParkingSlot("05","Cargo Lory","NotUse"));
        parkingSlots.add(new ParkingSlot("06","Cargo Lory","NotUse"));
        parkingSlots.add(new ParkingSlot("07","Cargo Lory","NotUse"));
        parkingSlots.add(new ParkingSlot("08","Cargo Lory","NotUse"));
        parkingSlots.add(new ParkingSlot("09","Cargo Lory","NotUse"));
        parkingSlots.add(new ParkingSlot("10","Cargo Lory","NotUse"));
        parkingSlots.add(new ParkingSlot("11","Cargo Lory","NotUse"));
        parkingSlots.add(new ParkingSlot("12","Van","NotUse"));
        parkingSlots.add(new ParkingSlot("13","Van","NotUse"));
        parkingSlots.add(new ParkingSlot("14","Bus","NotUse"));
    }
}
