package com.example.skinglow;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class CatalogController {
    @FXML private ImageView imageLogo;
    @FXML private ImageView allProducts;
    @FXML private ImageView brandIcon;
    @FXML private ImageView skinConcernIcon;
    @FXML private ImageView cleanserIcon;
    @FXML private ImageView tonerIcon;
    @FXML private ImageView moisturizerIcon;
    @FXML private ImageView serumIcon;
    @FXML private ImageView sunscreenIcon;

    @FXML private TextField searchField;

    public void initialize() {
        if (allProducts != null && imageLogo != null) {
            imageLogo.setImage(new Image(getClass().getResourceAsStream("/images/SkinCareLogo.png")));
            allProducts.setImage(new Image(getClass().getResourceAsStream("/images/AllProducts.png")));
            brandIcon.setImage(new Image(getClass().getResourceAsStream("/images/Brand.png")));
            skinConcernIcon.setImage(new Image(getClass().getResourceAsStream("/images/SkinConcern.png")));
            cleanserIcon.setImage(new Image(getClass().getResourceAsStream("/images/Cleanser.png")));
            tonerIcon.setImage(new Image(getClass().getResourceAsStream("/images/Toner.png")));
            moisturizerIcon.setImage(new Image(getClass().getResourceAsStream("/images/Moisturizer.png")));
            serumIcon.setImage(new Image(getClass().getResourceAsStream("/images/Serum.png")));
            sunscreenIcon.setImage(new Image(getClass().getResourceAsStream("/images/Sunscreen.png")));
        }
    }

    @FXML
    private void onSearch(ActionEvent event) {
        String query = searchField.getText();
        System.out.println("Search for: " + query);
    }
}
