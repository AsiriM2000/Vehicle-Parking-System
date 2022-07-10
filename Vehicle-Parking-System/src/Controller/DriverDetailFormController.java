package Controller;

import DB.DriverDataDatabase;
import Module.DriverData;
import Module.VehicleData;
import View.tm.DriverDataTm;
import View.tm.VehicleDataTm;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class DriverDetailFormController {
    public TableView <DriverDataTm>tblDriverData;
    public TableColumn colName;
    public TableColumn colNic;
    public TableColumn colLicenseNo;
    public TableColumn colAddress;
    public TableColumn colContact;

    public void initialize(){
        colName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colNic.setCellValueFactory(new PropertyValueFactory<>("nic"));
        colLicenseNo.setCellValueFactory(new PropertyValueFactory<>("licenseNo"));
        colAddress.setCellValueFactory(new PropertyValueFactory<>("address"));
        colContact.setCellValueFactory(new PropertyValueFactory<>("contact"));

        notifyAllOb();
    }

    private void notifyAllOb() {
        ObservableList<DriverDataTm> observableList = FXCollections.observableArrayList();
        for (DriverData d : DriverDataDatabase.aarrayList){
            DriverDataTm tm = new DriverDataTm(d.getName(), d.getNic(), d.getLicenseNo(), d.getAddress(), d.getContact());
            observableList.add(tm);
        }
        tblDriverData.setItems(observableList);
    }
}
