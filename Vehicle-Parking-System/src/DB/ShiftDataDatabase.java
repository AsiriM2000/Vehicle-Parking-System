package DB;

import Module.ShiftData;

import java.util.ArrayList;

public class ShiftDataDatabase {
    public static ArrayList<ShiftData>shiftData = new ArrayList<>();
    static {
        shiftData.add(new ShiftData("","","","",""));
    }
}
