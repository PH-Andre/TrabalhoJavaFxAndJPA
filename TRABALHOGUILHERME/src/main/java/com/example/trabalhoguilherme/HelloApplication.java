package com.example.trabalhoguilherme;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader login = new FXMLLoader(HelloApplication.class.getResource("login.fxml"));
        Scene sceneLogin = new Scene(login.load(), 381, 215);
        stage.setTitle("Login");
        stage.setScene(sceneLogin);
        stage.show();

        FXMLLoader principal = new FXMLLoader(HelloApplication.class.getResource("telaPrincipal.fxml"));
        Scene scenePrincipal = new Scene(principal.load(), 687, 472);
        stage.setTitle("Tela Principal");
        stage.setScene(scenePrincipal);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}