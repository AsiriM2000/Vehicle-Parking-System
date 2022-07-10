package Controller;

import DB.VehicleDataDatabase;
import Module.VehicleData;
import View.tm.VehicleDataTm;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;


public class VehicleDataFormController {
    public TableView<VehicleDataTm> tblVehicleData;
    public TableColumn colNumber;
    public TableColumn colType;
    public TableColumn colWeight;
    public TableColumn colPassenger;


    public void initialize(){

        colNumber.setCellValueFactory(new PropertyValueFactory<>("vehicleNumber"));
        colType.setCellValueFactory(new PropertyValueFactory<>("vehicleType"));
        colWeight.setCellValueFactory(new PropertyValueFactory<>("weight"));
        colPassenger.setCellValueFactory(new PropertyValueFactory<>("passengers"));

        notifyAllObjects();

    }

    private void notifyAllObjects() {
        ObservableList<VehicleDataTm> observableList = FXCollections.observableArrayList();
        for (VehicleData v : VehicleDataDatabase.dataArrayList){
            VehicleDataTm tm = new VehicleDataTm(v.getVehicleNumber(),v.getVehicleType(),v.getWeight(),v.getPassengers());
            observableList.add(tm);
        }
        tblVehicleData.setItems(observableList);
    }
}
