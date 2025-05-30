package com.example.skinglow;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.util.List;
import java.util.Objects;

public class CatalogController {
    // Images for the filter menu
    @FXML private ImageView imageLogo;
    @FXML private ImageView brandIcon;
    @FXML private ImageView skinConcernIcon;
    @FXML private ImageView cleanserIcon;
    @FXML private ImageView tonerIcon;
    @FXML private ImageView moisturizerIcon;
    @FXML private ImageView serumIcon;
    @FXML private ImageView sunscreenIcon;

    // VBox to add new display of products
    @FXML private VBox productDisplay;

    // TextField used to take the query from the user
    @FXML private TextField searchField;

    public void initialize() {
        // Adding the images for the filter menu
        addingImage(imageLogo,"/images/SkinCareLogo.png");
        addingImage(brandIcon,"/images/Brand.png");
        addingImage(skinConcernIcon,"/images/SkinConcern.png");
        addingImage(cleanserIcon,"/images/Cleanser.png");
        addingImage(tonerIcon,"/images/Toner.png");
        addingImage(moisturizerIcon,"/images/Moisturizer.png");
        addingImage(serumIcon,"/images/Serum.png");
        addingImage(sunscreenIcon,"/images/Sunscreen.png");

        // Adding products to be displayed
        ReadingProducts readingProducts = new ReadingProducts();

        List<SkincareProducts> skincareProductsList = readingProducts.loadProductsFromCSV("/csv/products.csv");

        for (SkincareProducts product : skincareProductsList) {
            productDisplay.getChildren().add(createProductDisplay(product.getName(), product.getSkinType(), "/images/Isntree - GreenTeaFreshCleanser.png"));
        }

    }

    // Method to set an ImageView
    private void addingImage(ImageView image, String path) {
        image.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream(path))));
    }

    // Method to filter a search based on a query
    @FXML
    private void onSearch(ActionEvent event) {
        String query = searchField.getText();
        System.out.println("Search for: " + query);
    }

    // Method to create a display of a product, where it adds an image and some informative text
    private HBox createProductDisplay(String productName, String skinType, String imagePath) {

        // Creating a HBox to display the products
        HBox display = new HBox(10);
        display.setPadding(new Insets(10));
        display.setStyle("-fx-background-color: #f4f4f4; -fx-background-radius: 10;");

        // Adding the image
        ImageView productImage = new ImageView(new Image(getClass().getResourceAsStream(imagePath)));
        productImage.setFitWidth(80);
        productImage.setPreserveRatio(true);

        // Creating a VBox to contain the product name and skin type
        VBox textBox = new VBox(5);

        Label nameLabel = new Label(productName);
        nameLabel.setStyle("-fx-font-weight: bold; -fx-font-size: 14px;");

        Label descriptionLabel = new Label(skinType);
        descriptionLabel.setWrapText(true);
        descriptionLabel.setMaxWidth(200);

        // Adding the image and the description
        textBox.getChildren().addAll(nameLabel, descriptionLabel);
        display.getChildren().addAll(productImage, textBox);

        return display;
    }
}
