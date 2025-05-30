package com.example.skinglow;

import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.util.Objects;

public class MainSceneController {
    @FXML private ImageView imageLogo;
    @FXML private ImageView mainScreenBackground;

    @FXML
    public void initialize() {
        imageLogo.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/images/SkinCareLogo.png"))));
        mainScreenBackground.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/images/MainScreenBackground.png"))));
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

        // Call your reusable transition
        fadeTransition(currentScene, newRoot, stage);
    }

    public void fadeTransition(Scene currentScene, Parent newRoot, Stage stage) {
        Node rootNode = currentScene.getRoot();

        FadeTransition fadeOut = new FadeTransition(Duration.millis(500), rootNode);
        fadeOut.setFromValue(1.0);
        fadeOut.setToValue(0.0);

        fadeOut.setOnFinished(event -> {
            stage.setScene(new Scene(newRoot, currentScene.getWidth(), currentScene.getHeight()));

            FadeTransition fadeIn = new FadeTransition(Duration.millis(500), newRoot);
            fadeIn.setFromValue(0.0);
            fadeIn.setToValue(1.0);
            fadeIn.play();
        });

        fadeOut.play();
    }
}

