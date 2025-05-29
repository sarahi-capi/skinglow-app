package com.example.skinglow;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class CatalogController {
    @FXML private ImageView imageLogo;
    @FXML private TextField searchField;

    public void initialize() {
        if (imageLogo != null) {
            imageLogo.setImage(new Image(getClass().getResourceAsStream("/images/SkinCareLogo.png")));
        }
    }

    @FXML
    private void onSearch(ActionEvent event) {
        String query = searchField.getText();
        System.out.println("Search for: " + query);
    }
}
