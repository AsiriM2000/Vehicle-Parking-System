package DB;

import Module.VehicleData;

import java.util.ArrayList;

public class VehicleDataDatabase {
    public static ArrayList<VehicleData>dataArrayList = new ArrayList<VehicleData>();
    static {
        dataArrayList.add(new VehicleData("NA-3434", "Bus", "3500", 60));
        dataArrayList.add(new VehicleData("KA-4563", "Van", "1000", 7));
        dataArrayList.add(new VehicleData("58-3567", "Van", "1500", 4));
        dataArrayList.add(new VehicleData("GF-4358", "Van", "800", 4));
        dataArrayList.add(new VehicleData("CCB-3568", "Van", "1800", 8));
        dataArrayList.add(new VehicleData("LM-6679", "Van", "1500", 4));
        dataArrayList.add(new VehicleData("QA-3369", "Van", "1800", 6));
        dataArrayList.add(new VehicleData("KB-3668", "Cargo Lorry", "2500", 2));
        dataArrayList.add(new VehicleData("JJ-9878", "Cargo Lorry", "3000", 2));
        dataArrayList.add(new VehicleData("GH-5772", "Cargo Lorry", "4000", 3));
        dataArrayList.add(new VehicleData("XY-4456", "Cargo Lorry", "3500", 2));
        dataArrayList.add(new VehicleData("YQ-3536", "Cargo Lorry", "2000", 2));
        dataArrayList.add(new VehicleData("CBB-3566", "Cargo Lorry", "2500", 2));
        dataArrayList.add(new VehicleData("QH-3444", "Cargo Lorry", "5000", 4));
    }
}
