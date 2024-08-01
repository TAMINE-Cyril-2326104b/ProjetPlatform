package com.example.platformgame;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class PlatformMenuController {
    @FXML
    private Label launchGame;

    @FXML
    protected void onLaunchGameButton(ActionEvent event) throws IOException {
        Parent secondSceneParent = FXMLLoader.load(PlatformMenu.class.getResource("platformgame.fxml"));
        Scene secondScene = new Scene(secondSceneParent);

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(secondScene);
        stage.centerOnScreen();
        stage.show(); // On fait apparaître le stage
    }

    public void onParamButton(ActionEvent event) throws IOException{
        Parent secondSceneParent = FXMLLoader.load(PlatformMenu.class.getResource("platformparam.fxml"));
        Scene secondScene = new Scene(secondSceneParent);

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(secondScene);
        stage.centerOnScreen();
        stage.show(); // On fait apparaître le stage
    }

    public void onExitButton() {
        javafx.application.Platform.exit();
    }
}