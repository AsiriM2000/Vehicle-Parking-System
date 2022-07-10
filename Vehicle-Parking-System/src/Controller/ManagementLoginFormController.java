package Controller;

import DB.DriverDataDatabase;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ManagementLoginFormController {
    public TextField txtUsername;
    public PasswordField txtPassword;
    public AnchorPane context;

    public void LogInOnAction(ActionEvent actionEvent) throws IOException {

        if (txtUsername.getText().equals("asiri") && txtPassword.getText().equals("1234")){
            Stage stage = (Stage) context.getScene().getWindow();
            stage.close();
            DriverDataDatabase.anchorPane.getChildren().clear();
            Parent parent = FXMLLoader.load(getClass().getResource("../View/InParkingForm.fxml"));
            DriverDataDatabase.anchorPane.getChildren().add(parent);
        }
    }

    public void CanselOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) context.getScene().getWindow();
        stage.close();
    }
}
