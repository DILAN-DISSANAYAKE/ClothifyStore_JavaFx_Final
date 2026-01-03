package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;
import lombok.RequiredArgsConstructor;
import model.dto.UsersDTO;
import model.enums.Role;
import service.UsersService;
import service.imp.UsersServiceImp;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

@RequiredArgsConstructor
public class SignInFromController implements Initializable {
    private final UsersService usersService=new UsersServiceImp();
    Stage stage=new Stage();
    Stage closeStage=new Stage();
    @FXML
    private JFXTextField txtEmail;

    @FXML
    private JFXPasswordField txtPassword;

    @FXML
    private JFXButton btnLogin;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

         txtEmail.requestFocus();
    }

    @FXML
    void btnLoginAction(ActionEvent event) throws IOException {
        String email = txtEmail.getText();
        String password = txtPassword.getText();

        if (email.isEmpty()) {
            showAlert(Alert.AlertType.WARNING, "Validation Error", "Please enter your email address.");
            txtEmail.requestFocus();
            return;
        }

        if (password.isEmpty()) {
            showAlert(Alert.AlertType.WARNING, "Validation Error", "Please enter your password.");
            txtPassword.requestFocus();
            return;
        }

        UsersDTO usersDTO=authenticateUser(email, password);
        if (usersDTO.isExists()) {
            if (usersDTO.getRole()==Role.ADMIN) {
                showAlert(Alert.AlertType.INFORMATION, "Success", "Login Successful! Welcome back "+usersDTO.getName()+".");
                stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/AdminDashBoard.fxml"))));
                closeStage=(Stage) btnLogin.getScene().getWindow();
                closeStage.close();
                stage.show();
            } else if (usersDTO.getRole()==Role.STAFF) {
                showAlert(Alert.AlertType.INFORMATION, "Success", "Login Successful! Welcome back "+usersDTO.getName()+".");
                stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/AdminDashBoard.fxml"))));
                closeStage=(Stage) btnLogin.getScene().getWindow();
                closeStage.close();
                stage.show();

            }


        } else {
            showAlert(Alert.AlertType.ERROR, "Login Failed", "Invalid email or password.");
        }
    }

    private UsersDTO authenticateUser(String email, String password) {

        return usersService.authenticateUser(email,password);
    }

    private void showAlert(Alert.AlertType alertType, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}