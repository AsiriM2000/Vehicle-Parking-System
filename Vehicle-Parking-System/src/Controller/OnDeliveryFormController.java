package Controller;

import DB.ParkingLotDatabase;
import DB.ParkingSlotDatabase;
import DB.ShiftDataDatabase;
import Module.ParkingLot;
import Module.ShiftData;
import View.tm.ShiftDataTm;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ButtonBase;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class OnDeliveryFormController{
    public ComboBox cmbInOut;
    public TableView <ShiftDataTm>tblInVehicle;
    public TableColumn colVehicleNum;
    public TableColumn colVehicleType;
    public TableColumn colDriverName;
    public TableColumn colLeftTime;
    public AnchorPane context;


    public void initialize() {
        colVehicleNum.setCellValueFactory(new PropertyValueFactory<>("vehicleNumber"));
        colVehicleType.setCellValueFactory(new PropertyValueFactory<>("vehicleType"));
        colDriverName.setCellValueFactory(new PropertyValueFactory<>("driverName"));
        colLeftTime.setCellValueFactory(new PropertyValueFactory<>("dateTime"));

        notifyOb();
    }


    private void notifyOb() {


        ObservableList<ShiftDataTm> observableList2 = FXCollections.observableArrayList();
        for (ShiftData d : ShiftDataDatabase.shiftData){
            ShiftDataTm tm = new ShiftDataTm(d.getVehicleNumber(),d.getVehicleType(),d.getDriverName(),d.getDateTime(),d.getSlotNum());
            observableList2.add(tm);

        }
        tblInVehicle.setItems(observableList2);

        ObservableList<String> observableList = FXCollections.observableArrayList();
        observableList.add("In Parking");
        observableList.add("On Delivery");

        cmbInOut.setItems(observableList);
    }

    public void ChooseOnAction(ActionEvent actionEvent) throws IOException {
        String msg = cmbInOut.getSelectionModel().getSelectedItem().toString();
        switch (msg){
            case "In Parking" :
                Stage stage = (Stage) context.getScene().getWindow();
                stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/InParkingForm.fxml"))));
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
