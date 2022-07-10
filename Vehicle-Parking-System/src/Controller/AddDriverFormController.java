package Controller;

import DB.DriverDataDatabase;
import Module.DriverData;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class AddDriverFormController {
    public TextField txtName;
    public TextField txtNic;
    public TextField txtLicenseNo;
    public TextField txtAddress;
    public TextField txtContact;

    public void AddDriverOnAction(ActionEvent actionEvent) {
        DriverData driverData = new DriverData(
                txtName.getText(),
                txtNic.getText(),
                txtLicenseNo.getText(),
                txtAddress.getText(),
                txtContact.getText()
        );
        DriverDataDatabase.aarrayList.add(driverData);
        new Alert(Alert.AlertType.CONFIRMATION,"Add Driver Success!").show();
    }

    public void ViewOnAction(ActionEvent actionEvent) throws IOException {
        URL resorce = getClass().getResource("../View/DriverDetailForm.fxml");
        Parent root = FXMLLoader.load(resorce);
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        Image image = new Image("/T Image/parking_PNG7.png");
        stage.getIcons().add(image);
        stage.show();
    }
}
