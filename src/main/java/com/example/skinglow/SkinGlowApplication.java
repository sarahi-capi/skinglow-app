package com.example.skinglow;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.ImageCursor;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class SkinGlowApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        //FXMLLoader fxmlLoader = new FXMLLoader(SkinGlowApplication.class.getResource("main-view.fxml"));
        FXMLLoader fxmlLoader = new FXMLLoader(SkinGlowApplication.class.getResource("catalog-scene.fxml"));
        //FXMLLoader fxmlLoader = new FXMLLoader(SkinGlowApplication.class.getResource("tutorial-scene.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 375, 667);

        // Setting the Logo
        stage.getIcons().add(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/images/SkinCareLogo.png"))));

        // Non-resizable window
        stage.setResizable(false);

        // Setting the scene and fading in it
        stage.setScene(scene);
        stage.show();

        Transition fadeIn = new Transition();
        fadeIn.fadeInTransition(fxmlLoader.getRoot());
    }

    public static void main(String[] args) {
        launch();
    }
}