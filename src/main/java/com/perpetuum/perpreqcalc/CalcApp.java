package com.perpetuum.perpreqcalc;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.kordamp.bootstrapfx.BootstrapFX;

import java.io.IOException;

public class CalcApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(CalcApp.class.getResource("MainView.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1600, 1200);
        scene.getStylesheets().add(BootstrapFX.bootstrapFXStylesheet());
        stage.setMaxWidth(1600);
        stage.setMinWidth(640);
        stage.setMaxHeight(1200);
        stage.setMinHeight(480);
        stage.setTitle("Perpetuum Resources Requirements Calculator");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}