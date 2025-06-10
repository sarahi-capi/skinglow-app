package com.example.skinglow;

import javafx.scene.ImageCursor;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

import java.util.Objects;

public class SettingCursor {
    public void handCursor(HBox hbox) {
        Image handImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/images/MouseHand.png")));
        hbox.setCursor(new ImageCursor(handImage));
    }

    public void handCursor(VBox vbox) {
        Image handImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/images/MouseHand.png")));
        vbox.setCursor(new ImageCursor(handImage));
    }

    public void handCursor(Button button) {
        Image handImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/images/MouseHand.png")));
        button.setCursor(new ImageCursor(handImage));
    }

    public void handCursor(TitledPane titledPane) {
        Image handImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/images/MouseHand.png")));
        titledPane.setCursor(new ImageCursor(handImage));
    }

    public void editorCursor(TextField textField) {
        Image editorImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/images/MouseEditor.png")));
        textField.setCursor(new ImageCursor(editorImage));
    }

    public void pointerCursor(StackPane stackPane) {
        Image pointerImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/images/MousePointer.png")));
        stackPane.setCursor(new ImageCursor(pointerImage));
    }


}
