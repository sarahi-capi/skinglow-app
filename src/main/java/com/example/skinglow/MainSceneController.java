package com.example.skinglow;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.ImageCursor;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class MainSceneController {

    // To set images
    @FXML private ImageView imageLogo;
    @FXML private ImageView mainScreenBackground;

    // To change the cursors
    @FXML private Button getStartedButton;
    @FXML private StackPane mainView;

    @FXML
    public void initialize() {
        ImageManager imageManager = new ImageManager();

        // Setting logo and background
        imageManager.addingImage(imageLogo, "/images/SkinCareLogo.png");
        imageManager.addingImage(mainScreenBackground, "/images/MainScreenBackground.png");

        // Changing pointer and hand images
        SettingCursor cursor = new SettingCursor();

        cursor.pointerCursor(mainView);
        cursor.handCursor(getStartedButton);
    }

    // Changing windows with a fading animation
    @FXML
    private void fadeWindow(ActionEvent event) throws IOException {
        // Load the new scene root
        FXMLLoader loader = new FXMLLoader(getClass().getResource("catalog-scene.fxml"));
        Parent newRoot = loader.load();

        // Get current stage and scene
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene currentScene = stage.getScene();

        // Fading out the old window and fading in the new window
        Transition transition = new Transition();
        transition.fadeOutInTransition(currentScene, newRoot, stage);
    }
}

