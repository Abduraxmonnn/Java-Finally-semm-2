package com.example.task;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class CarGalleryController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}