package Controller;

import DB.*;
import Module.*;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.applet.Applet;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;


public class FirstInterfaceFormController implements DateTime{

    public ComboBox<String> cmbVehicle;
    public Label txtType;
    public AnchorPane context;
    public Label txtDateAndTime;
    public ComboBox<String> cmbDriver;
    public Label txtSlotNumber;
    public Button btnShift;
    public AnchorPane context1;
    public Button btnPark;
    private boolean stop = false;

    public void initialize() {

        ObservableList<String> observableList = FXCollections.observableArrayList();
        for (VehicleData v : VehicleDataDatabase.dataArrayList){
            observableList.add(v.getVehicleNumber());
        }
        cmbVehicle.setItems(observableList);


        ObservableList<String> observableList1 = FXCollections.observableArrayList();
        for (DriverData d : DriverDataDatabase.aarrayList){
            observableList1.add(d.getName());
        }
        cmbDriver.setItems(observableList1);

        dateTime();
    }
    public void parkingSlot() {

        switch (txtType.getText()){
            case "Van" : {
                SetSlot("Van");
            }break;
            case "Cargo Lory" : {
                SetSlot("Cargo Lory");
            }break;
            case "Bus" : {
                SetSlot("Bus");
            }break;
        }


    }
    private void SetSlot(String vehicletype) {
        for (int i=0; i< ParkingSlotDatabase.parkingSlots.size(); i++){
            for (int j=0; j<ParkingSlotDatabase.parkingSlots.size(); j++){
                if (vehicletype.equals(ParkingSlotDatabase.parkingSlots.get(i).getParkingVehicleType()) && ParkingSlotDatabase.parkingSlots.get(i).getParkingSlotStatus().equals("NotUse")) {
                    txtSlotNumber.setText(ParkingSlotDatabase.parkingSlots.get(i).getParkingSlotNumber());
                    return;
                }
            }
        }
    }
    public void VehicleOnAction(ActionEvent actionEvent) {
        String msg = cmbVehicle.getSelectionModel().getSelectedItem().toString();
            switch (msg){
                case "NA-3434" :
                    txtType.setText("Bus");
                    checked();
                    checked2();
                    parkingSlot();
                    break;
                case "KA-4563" :
                    txtType.setText("Van");
                    checked();
                    checked2();
                    parkingSlot();
                    break;
                case "58-3567" :
                    txtType.setText("Van");
                    checked();
                    checked2();
                    parkingSlot();
                    break;
                case "GF-4358" :
                    txtType.setText("Van");
                    checked();
                    checked2();
                    parkingSlot();
                    break;
                case "CCB-3568" :
                    txtType.setText("Van");
                    checked();
                    checked2();
                    parkingSlot();
                    break;
                case "LM-6679" :
                    txtType.setText("Van");
                    checked();
                    checked2();
                    parkingSlot();
                    break;
                case "QA-3369" :
                    txtType.setText("Van");
                    checked();
                    checked2();
                    parkingSlot();
                    break;
                case "KB-3668" :
                    txtType.setText("Cargo Lory");
                    checked();
                    checked2();
                    parkingSlot();
                    break;
                case "JJ-9878" :
                    txtType.setText("Cargo Lory");
                    checked();
                    checked2();
                    parkingSlot();
                    break;
                case "GH-5772" :
                    txtType.setText("Cargo Lory");
                    checked();
                    checked2();
                    parkingSlot();
                    break;
                case "XY-4456" :
                    txtType.setText("Cargo Lory");
                    checked();
                    checked2();
                    parkingSlot();
                    break;
                case "YQ-3536" :
                    txtType.setText("Cargo Lory");
                    checked();
                    checked2();
                    parkingSlot();
                    break;
                case "CBB-3566" :
                    txtType.setText("Cargo Lory");
                    checked();
                    checked2();
                    parkingSlot();
                    break;
                case "QH-3444 " :
                    txtType.setText("Cargo Lory");
                    checked();
                    checked2();
                    parkingSlot();
                    break;
            }


    }

    public void ManagementLoginOnAction(ActionEvent actionEvent) throws IOException {
        DriverDataDatabase.anchorPane = context1;
        URL resorce = getClass().getResource("../View/ManagementLoginForm.fxml");
        Parent root = FXMLLoader.load(resorce);
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();

    }
    @Override
    public void dateTime(){
        Thread clock = new Thread(()->{
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy-HH:mm:ss");
            while (!stop){
                try {
                    Thread.sleep(1000);
                }catch (Exception e){
                    System.out.println(e);
                }
                final String time = dateFormat.format(new Date());
                Platform.runLater(()->{
                    txtDateAndTime.setText(time);
                });
            }
        }){};
        clock.start();

    }

    public void checked() {
        try {
                for (int j = 0; j < ParkingSlotDatabase.parkingSlots.size(); j++) {
                    if (cmbVehicle.getValue().equalsIgnoreCase(ParkingLotDatabase.parkingLots.get(j).getVehicleNumber())){
                        btnPark.setDisable(true);
                        break;
                    }else {
                        btnPark.setDisable(false);
                    }
            }
        }catch (IndexOutOfBoundsException e){}
    }
    public void checked2(){
        try {
            for (int j = 0; j < ShiftDataDatabase.shiftData.size(); j++) {
                if (cmbVehicle.getValue().equalsIgnoreCase(ShiftDataDatabase.shiftData.get(j).getVehicleNumber())){
                    btnShift.setDisable(true);
                    break;
                }else {
                    btnShift.setDisable(false);
                }
            }
        }catch (IndexOutOfBoundsException e){}
    }
    public  void checked3(){
        for (int i =0;i<ParkingSlotDatabase.parkingSlots.size();i++){
            if (txtSlotNumber.getText().equalsIgnoreCase(ParkingSlotDatabase.parkingSlots.get(i).getParkingSlotNumber())){
                ParkingSlotDatabase.parkingSlots.get(i).setParkingSlotStatus("Use");
            }
        }
    }
    public void ParkVehicleOnAction(ActionEvent actionEvent) {
            ParkingLot p1  = new ParkingLot(
                    cmbVehicle.getValue(),
                    txtType.getText(),
                    cmbDriver.getValue(),
                    txtDateAndTime.getText(),
                    txtSlotNumber.getText()
            );
            ParkingLotDatabase.parkingLots.add(p1);

            for (int i =0;i<ShiftDataDatabase.shiftData.size();i++){
                if (cmbVehicle.getValue().equalsIgnoreCase(ShiftDataDatabase.shiftData.get(i).getVehicleNumber())){
                    ShiftDataDatabase.shiftData.remove(i);
                    break;
                }
            }
            checked3();
            new Alert(Alert.AlertType.CONFIRMATION,"Parking Success!").show();

    }

    public void OnDiliveryShiftOnAction(ActionEvent actionEvent) {
        ShiftData s1  = new ShiftData(
                cmbVehicle.getValue(),
                txtType.getText(),
                cmbDriver.getValue(),
                txtDateAndTime.getText(),
                txtSlotNumber.getText()
        );
        ShiftDataDatabase.shiftData.add(s1);

        for (int i =0;i<ParkingSlotDatabase.parkingSlots.size();i++){
            if (cmbVehicle.getValue().equalsIgnoreCase(ParkingLotDatabase.parkingLots.get(i).getVehicleNumber())){
                ParkingLotDatabase.parkingLots.remove(i);
                break;
            }
        }
        new Alert(Alert.AlertType.CONFIRMATION,"Delivery Success!").show();
    }

}
