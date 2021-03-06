package com.example.projecttema1ps;

import com.example.projecttema1ps.view.ViewDoctor;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    private static Stage stage;

    @Override
    public void start(Stage primaryStage) throws IOException {
        stage = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("login-view.fxml"));
        primaryStage.setTitle("Login");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    public void changeScene(String fxmlFile, String title) throws IOException {
        Parent pane = FXMLLoader.load(getClass().getResource(fxmlFile));
        stage.getScene().setRoot(pane);
        stage.setTitle(title);
    }

    public static void main(String[] args) {
        launch();
    }
}