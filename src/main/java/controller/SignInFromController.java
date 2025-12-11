package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import java.net.URL;
import java.util.ResourceBundle;

public class SignInFromController implements Initializable {

    @FXML
    private TextField txtEmail;

    @FXML
    private PasswordField txtPassword;

    @FXML
    private Button btnLogin;

    @FXML
    private Hyperlink hypSignUp;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        btnLogin.setOnAction(event -> performLogin());

        hypSignUp.setOnAction(event -> navigateToSignUp());
    }

    private void performLogin() {
        String email = txtEmail.getText();
        String password = txtPassword.getText();


        if (email.isEmpty() || password.isEmpty()) {
            showAlert(Alert.AlertType.ERROR, "Form Error", "Please enter both email and password.");
        } else {
            System.out.println("User tried to login");
        }
    }

    private void navigateToSignUp() {
        System.out.println("User clicked Sign Up..!");
       }

    private void showAlert(Alert.AlertType alertType, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}