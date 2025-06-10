package com.example.skinglow;

import javafx.animation.FadeTransition;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Transition {

    // Fading out an old window and fading in a new window
    public void fadeOutInTransition(Scene currentScene, Parent newRoot, Stage stage) {
        Node rootNode = currentScene.getRoot();

        FadeTransition fadeOut = new FadeTransition(Duration.millis(500), rootNode);
        fadeOut.setFromValue(1.0);
        fadeOut.setToValue(0.0);

        fadeOut.setOnFinished(event -> {
            stage.setScene(new Scene(newRoot, currentScene.getWidth(), currentScene.getHeight()));
            fadeInTransition(newRoot);
        });

        fadeOut.play();
    }

    // Fading in a window
    public void fadeInTransition(Parent newRoot) {
        FadeTransition fadeIn = new FadeTransition(Duration.millis(500), newRoot);
        fadeIn.setFromValue(0.0);
        fadeIn.setToValue(1.0);
        fadeIn.play();
    }
}
