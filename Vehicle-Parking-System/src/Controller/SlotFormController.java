package Controller;

import DB.VehicleDataDatabase;
import Module.VehicleData;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;


public class SlotFormController {

    public TextField txtVehicleNum;
    public TextField txtWeight;
    public TextField txtPassengers;
    public ComboBox cmbVehicleType;
    public Button btnAddVehicle;
    public AnchorPane context;
    public TextField txtSlotNumber;


    public void initialize(){
        notifyAllObject();

    }

    private void notifyAllObject() {
        ObservableList observableList = FXCollections.observableArrayList();
        observableList.addAll(
                "Bus","Van","Cargo Lory"
        );
        cmbVehicleType.setItems(observableList);


    }

    public void AddVehicle2OnAction(ActionEvent actionEvent) {

        VehicleData vehicleData = new VehicleData(
                txtVehicleNum.getText(),
                (String) cmbVehicleType.getValue(),
                txtWeight.getText(),
                Integer.parseInt(txtPassengers.getText())

        );
        VehicleDataDatabase.dataArrayList.add(vehicleData);
        new Alert(Alert.AlertType.CONFIRMATION,"Add Vehicle Success!").show();

    }

    public void ViewOnAction(ActionEvent actionEvent) throws IOException {
        URL resorce = getClass().getResource("../View/VehicleDataForm.fxml");
        Parent root = FXMLLoader.load(resorce);
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        Image image = new Image("/T Image/parking_PNG7.png");
        stage.getIcons().add(image);
        stage.show();

    }

}
