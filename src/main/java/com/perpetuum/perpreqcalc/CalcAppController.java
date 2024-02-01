package com.perpetuum.perpreqcalc;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import org.controlsfx.control.InfoOverlay;
import org.controlsfx.control.PopOver;
import org.kordamp.bootstrapfx.BootstrapFX;

public class CalcAppController {
    @FXML
    private VBox helloVbox;
    @FXML
    private Label welcomeText;
    @FXML
    private Button helloBtn;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    private void initialize() {
        helloVbox.getStylesheets().add(BootstrapFX.bootstrapFXStylesheet());
        welcomeText.getStyleClass().setAll("h2","lbl-success");
        helloBtn.getStyleClass().setAll("btn-lg", "btn-primary");
    }
}