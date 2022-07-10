package Controller;

import DB.ParkingLotDatabase;
import DB.ParkingSlotDatabase;
import DB.ShiftDataDatabase;
import Module.ParkingLot;
import View.tm.ParkingLotTm;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;
import java.util.Optional;


public class InParkingFormController{
    public ComboBox cmbInOut;
    public TableView <ParkingLotTm>tblInVehicle;
    public TableColumn colVehicleNum;
    public TableColumn colVehicleType;
    public TableColumn colParkingSlot;
    public TableColumn colParkedTime;
    public AnchorPane context;
    public Button btn;

    public void initialize(){
        colVehicleNum.setCellValueFactory(new PropertyValueFactory<>("vehicleNumber"));
        colVehicleType.setCellValueFactory(new PropertyValueFactory<>("vehicleType"));
        colParkingSlot.setCellValueFactory(new PropertyValueFactory<>("slotNum"));
        colParkedTime.setCellValueFactory(new PropertyValueFactory<>("dateTime"));

        notifyOb();
    }

    private void notifyOb() {
        ObservableList<ParkingLotTm> parkingLotTms = FXCollections.observableArrayList();
        for (ParkingLot l : ParkingLotDatabase.parkingLots){
            ParkingLotTm tm = new ParkingLotTm(l.getVehicleNumber(),l.getVehicleType(),l.getDriverName(),l.getDateTime(),l.getSlotNum());
            parkingLotTms.add(tm);


        }
        tblInVehicle.setItems(parkingLotTms);

        ObservableList<String> observableList = FXCollections.observableArrayList();
        observableList.add("In Parking");
        observableList.add("On Delivery");

        cmbInOut.setItems(observableList);
    }

   public void ChooseOnAction(ActionEvent actionEvent) throws IOException {
        String msg = cmbInOut.getSelectionModel().getSelectedItem().toString();
        switch (msg){
            case "On Delivery" :
                Stage stage = (Stage) context.getScene().getWindow();
                stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/OnDeliveryForm.fxml"))));
                stage.centerOnScreen();
                break;
        }
    }

    public void AddVehicleOnAction(ActionEvent actionEvent) throws IOException {
        URL resorce = getClass().getResource("../View/SlotForm.fxml");
        Parent root = FXMLLoader.load(resorce);
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        Image image = new Image("/T Image/parking_PNG7.png");
        stage.getIcons().add(image);
        stage.show();
    }

    public void LogOutOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) context.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/FirstInterfaceForm.fxml"))));
        stage.centerOnScreen();
    }

    public void AddDriverOnAction(ActionEvent actionEvent) throws IOException {
        URL resorce = getClass().getResource("../View/AddDriverForm.fxml");
        Parent root = FXMLLoader.load(resorce);
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        Image image = new Image("/T Image/parking_PNG7.png");
        stage.getIcons().add(image);
        stage.show();

    }
}
