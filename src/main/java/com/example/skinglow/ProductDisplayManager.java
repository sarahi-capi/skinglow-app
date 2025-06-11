package com.example.skinglow;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.util.List;
import java.util.Objects;

public class ProductDisplayManager {

    // To manage the images
    ImageManager imageManager = new ImageManager();

    // Method to display all the products inside a VBox
    public void showProducts(List<SkincareProducts> skincareProductsList, VBox productDisplayVBox) {

        // Cleaning the VBox productDisplay
        productDisplayVBox.getChildren().clear();

        // For each product in the list, create a product and add it to the VBox productDisplay
        skincareProductsList.forEach(product -> {
            Node productNode = createProductDisplay(
                    product.getName(),
                    product.getBrand(),
                    product.getSkinType(),
                    product.getImagePath()
            );

            // Here, we save the data of the product
            productNode.setUserData(product);

            // Then, if we click the product to see more information, run this
            productNode.setOnMouseClicked(mouseEvent -> {
                try {
                    new CatalogController().showProductWindow(mouseEvent);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });

            // Display the products by adding them to the VBox
            productDisplayVBox.getChildren().add(productNode);
        });
    }

    // Method to create a display of a product, where it adds an image and some informative text
    public HBox createProductDisplay(String productName, String brand, String skinType, String imagePath) {

        HBox display = createDisplayContainer(); // Creating the HBox
        ImageView productImage = createProductImage(imagePath); // Loading the image into the ImageView
        VBox textBox = createTextBox(productName, brand, skinType); // Creating a VBox with the information about the product

        display.getChildren().addAll(productImage, textBox); // Adding the productImage and textBox into the HBox

        return display;
    }

    // Method that creates an HBox to display the products
    private HBox createDisplayContainer() {

        // Creating a HBox
        HBox display = new HBox(10);
        display.setPadding(new Insets(10));
        display.setAlignment(Pos.CENTER);

        // Setting a cursor when entering the HBox
        SettingCursor cursor = new SettingCursor();
        cursor.handCursor(display);

        return display;
    }


    // Method to load the image in an ImageView
    private ImageView createProductImage(String imagePath) {
        ImageView imageView = new ImageView(new Image(Objects.requireNonNull(getClass().getResourceAsStream(imagePath))));
        imageView.setFitWidth(115);
        imageView.setPreserveRatio(true);
        imageManager.animateImage(imageView);

        return imageView;
    }

    // Method that creates a VBox to contain the product name, brand and skin type
    private VBox createTextBox(String name, String brand, String skinType) {
        VBox box = new VBox(5);
        box.setAlignment(Pos.CENTER);

        // Adding the labels to the VBox
        box.getChildren().addAll(
                createLabel(name, "-fx-font-weight: bold; -fx-font-size: 15px;"),
                createLabel(brand, "-fx-font-weight: bold; -fx-font-size: 12px;"),
                createLabel(skinType, null)
        );

        return box;
    }

    // Method to create a label
    private Label createLabel(String text, String style) {
        Label label = new Label(text);
        label.setWrapText(true);
        label.setMaxWidth(160);
        if (style != null) label.setStyle(style);

        return label;
    }
}
