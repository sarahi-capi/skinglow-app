package com.example.skinglow;

import javafx.animation.ParallelTransition;
import javafx.animation.RotateTransition;
import javafx.animation.ScaleTransition;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

import java.util.Objects;
import java.util.stream.IntStream;

public class ImageManager {

    // Method to set an ImageView
    public void addingImage(ImageView image, String path) {
        image.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream(path))));
    }

    // Setting an ImageView from an array with the ImageView object and an array with its paths
    public void addingImage(ImageView[] imageViewList, String[] pathList) {
        IntStream.range(0, imageViewList.length)
                .forEach(i -> addingImage(imageViewList[i], pathList[i]));
    }

    // Method to animate an ImageView when hover
    public void animateImage(ImageView image) {
        // Scale up on hover
        image.setOnMouseEntered(e -> {
            ScaleTransition scale = new ScaleTransition(Duration.millis(300), image);
            scale.setToX(1.1);
            scale.setToY(1.1);

            RotateTransition rotate = new RotateTransition(Duration.millis(300), image);
            rotate.setByAngle(-15);

            ParallelTransition parallel = new ParallelTransition(scale, rotate);
            parallel.play();
        });

        // Scale back when mouse exits
        image.setOnMouseExited(e -> {
            ScaleTransition scale = new ScaleTransition(Duration.millis(300), image);
            scale.setToX(1.0);
            scale.setToY(1.0);

            RotateTransition rotate = new RotateTransition(Duration.millis(300), image);
            rotate.setToAngle(0);

            ParallelTransition parallel = new ParallelTransition(scale, rotate);
            parallel.play();
        });
    }

}
