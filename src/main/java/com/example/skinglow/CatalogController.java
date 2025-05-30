package com.example.skinglow;

import javafx.animation.ParallelTransition;
import javafx.animation.RotateTransition;
import javafx.animation.ScaleTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.ImageCursor;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.util.Duration;

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

    // To change the cursor
    @FXML private StackPane catalogView;
    @FXML private VBox brand;
    @FXML private VBox skinConcern;
    @FXML private VBox cleanser;
    @FXML private VBox toner;
    @FXML private VBox moisturizer;
    @FXML private VBox serum;
    @FXML private VBox sunscreen;
    @FXML private Button searchButton;


    public void initialize() {
        // Adding the images for the filter menu
        addingImage(imageLogo,"/images/SkinCareLogo.png");
        addingImage(brandIcon,"/images/Brand.png");
        addingImage(skinConcernIcon,"/images/SkinConcern.png");
        addingImage(cleanserIcon, "/images/Cleanser.png");
        addingImage(tonerIcon,"/images/Toner.png");
        addingImage(moisturizerIcon,"/images/Moisturizer.png");
        addingImage(serumIcon,"/images/Serum.png");
        addingImage(sunscreenIcon,"/images/Sunscreen.png");

        // Adding products to be displayed
        ReadingProducts readingProducts = new ReadingProducts();

        List<SkincareProducts> skincareProductsList = readingProducts.loadProductsFromCSV("/csv/products.csv");

        for (SkincareProducts product : skincareProductsList) {
            productDisplay.getChildren().add(createProductDisplay(product.getName(), product.getBrand(), product.getSkinType(), product.getImagePath()));
        }

        // Changing cursor and hand image
        Image cursorImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/images/MousePointer.png")));
        catalogView.setCursor(new ImageCursor(cursorImage));

        Image handImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/images/MouseHand.png")));
        brand.setCursor(new ImageCursor(handImage));
        skinConcern.setCursor(new ImageCursor(handImage));
        cleanser.setCursor(new ImageCursor(handImage));
        toner.setCursor(new ImageCursor(handImage));
        moisturizer.setCursor(new ImageCursor(handImage));
        serum.setCursor(new ImageCursor(handImage));
        sunscreen.setCursor(new ImageCursor(handImage));
        searchButton.setCursor(new ImageCursor(handImage));

        Image editorImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/images/MouseEditor.png")));
        searchField.setCursor(new ImageCursor(editorImage));
    }

    // Method to set an ImageView
    private void addingImage(ImageView image, String path) {
        image.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream(path))));
    }

    // Method to animate an ImageView when hover
    private void animateImage(ImageView image) {
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

    // Method to filter a search based on a query
    @FXML
    private void onSearch(ActionEvent event) {
        String query = searchField.getText();
        System.out.println("Search for: " + query);
    }

    // Method to create a display of a product, where it adds an image and some informative text
    private HBox createProductDisplay(String productName, String brand, String skinType, String imagePath) {

        // Creating a HBox to display the products
        HBox display = new HBox(10);
        display.setPadding(new Insets(10));
        display.setAlignment(Pos.CENTER);
        Image handImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/images/MouseHand.png")));
        display.setCursor(new ImageCursor(handImage));

        // Adding the image
        ImageView productImage = new ImageView(new Image(Objects.requireNonNull(getClass().getResourceAsStream(imagePath))));
        productImage.setFitWidth(115);
        productImage.setPreserveRatio(true);
        animateImage(productImage);

        // Creating a VBox to contain the product name, brand and skin type
        VBox textBox = new VBox(5);
        textBox.setAlignment(Pos.CENTER);

        Label nameLabel = new Label(productName);
        nameLabel.setStyle("-fx-font-weight: bold; -fx-font-size: 15px;");
        nameLabel.setWrapText(true);
        nameLabel.setMaxWidth(160);

        Label brandLabel = new Label(brand);
        brandLabel.setStyle("-fx-font-weight: bold; -fx-font-size: 12px;");
        brandLabel.setWrapText(true);
        brandLabel.setMaxWidth(160);

        Label descriptionLabel = new Label(skinType);
        descriptionLabel.setWrapText(true);
        descriptionLabel.setMaxWidth(160);

        // Adding the image and the description
        textBox.getChildren().addAll(nameLabel, brandLabel, descriptionLabel);
        display.getChildren().addAll(productImage, textBox);

        return display;
    }
}
