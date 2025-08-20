package com.example.zcare.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class CreateAccountController {
    @FXML
    private Button backBtn;
    @FXML
    private Button createAccountBtn;
    @FXML
    private ChoiceBox<String> districtChoiceBox;
    @FXML
    public void initialize() {
        String[] districts = {
                "Bagerhat", "Bandarban", "Barguna", "Barishal", "Bhola", "Bogura",
                "Brahmanbaria", "Chandpur", "Chattogram", "Chuadanga", "Cox's Bazar",
                "Cumilla", "Dhaka", "Dinajpur", "Faridpur", "Feni", "Gaibandha",
                "Gazipur", "Gopalganj", "Habiganj", "Jamalpur", "Jashore",
                "Jhalokati", "Jhenaidah", "Joypurhat", "Khagrachhari", "Khulna",
                "Kishoreganj", "Kurigram", "Kushtia", "Lakshmipur", "Lalmonirhat",
                "Madaripur", "Magura", "Manikganj", "Meherpur", "Moulvibazar",
                "Munshiganj", "Mymensingh", "Naogaon", "Narail", "Narayanganj",
                "Narsingdi", "Natore", "Netrokona", "Nilphamari", "Noakhali",
                "Pabna", "Panchagarh", "Patuakhali", "Pirojpur", "Rajbari",
                "Rajshahi", "Rangamati", "Rangpur", "Satkhira", "Shariatpur",
                "Sherpur", "Sirajganj", "Sunamganj", "Sylhet", "Tangail",
                "Thakurgaon"
        };
        districtChoiceBox.getItems().addAll(districts);
        districtChoiceBox.setValue("Dhaka");
    }
    public void switchToLogin(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/example/zcare/FXML/login.fxml")));
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }
}
