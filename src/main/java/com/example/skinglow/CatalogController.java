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
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.util.Duration;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CatalogController {
    // Image Logo
    @FXML private ImageView imageLogo;

    // Images for the filter menu
    @FXML private ImageView allIcon;
    @FXML private ImageView brandIcon;
    @FXML private ImageView oilyIcon;
    @FXML private ImageView sensitiveIcon;
    @FXML private ImageView dryIcon;
    @FXML private ImageView normalIcon;
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
    @FXML private VBox all;
    @FXML private VBox brand;
    @FXML private VBox oilySkin;
    @FXML private VBox sensitiveSkin;
    @FXML private VBox drySkin;
    @FXML private VBox normalSkin;
    @FXML private VBox cleanser;
    @FXML private VBox toner;
    @FXML private VBox moisturizer;
    @FXML private VBox serum;
    @FXML private VBox sunscreen;
    @FXML private Button searchButton;

    // List with all the products
    private List<SkincareProducts> skincareProductsList;

    public void initialize() {
        // Adding the images for the filter menu
        addingImage(imageLogo,"/images/SkinCareLogo.png");
        addingImage(allIcon,"/images/AllProducts.png");
        addingImage(brandIcon,"/images/Brand.png");
        addingImage(oilyIcon, "/images/OilySkin.png");
        addingImage(sensitiveIcon, "/images/SensitiveSkin.png");
        addingImage(dryIcon, "/images/DrySkin.png");
        addingImage(normalIcon, "/images/NormalSkin.png");
        addingImage(cleanserIcon, "/images/Cleanser.png");
        addingImage(tonerIcon,"/images/Toner.png");
        addingImage(moisturizerIcon,"/images/Moisturizer.png");
        addingImage(serumIcon,"/images/Serum.png");
        addingImage(sunscreenIcon,"/images/Sunscreen.png");

        // Adding products to be displayed
        ReadingProducts readingProducts = new ReadingProducts();
        skincareProductsList = readingProducts.loadProductsFromCSV("/csv/products.csv");

        // Sorting by name
        skincareProductsList.sort((product1, product2) -> product1.getName().compareTo(product2.getName()));
        for (SkincareProducts product : skincareProductsList) {
            productDisplay.getChildren().add(createProductDisplay(product.getName(), product.getBrand(), product.getSkinType(), product.getImagePath()));
        }

        // Changing cursor and hand image
        Image cursorImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/images/MousePointer.png")));
        catalogView.setCursor(new ImageCursor(cursorImage));

        Image handImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/images/MouseHand.png")));
        all.setCursor(new ImageCursor(handImage));
        brand.setCursor(new ImageCursor(handImage));
        oilySkin.setCursor(new ImageCursor(handImage));
        sensitiveSkin.setCursor(new ImageCursor(handImage));
        drySkin.setCursor(new ImageCursor(handImage));
        normalSkin.setCursor(new ImageCursor(handImage));
        cleanser.setCursor(new ImageCursor(handImage));
        toner.setCursor(new ImageCursor(handImage));
        moisturizer.setCursor(new ImageCursor(handImage));
        serum.setCursor(new ImageCursor(handImage));
        sunscreen.setCursor(new ImageCursor(handImage));
        searchButton.setCursor(new ImageCursor(handImage));

        Image editorImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/images/MouseEditor.png")));
        searchField.setCursor(new ImageCursor(editorImage));
    }

    // Method to filter a search based on a query
    @FXML
    private void onSearch(ActionEvent event) {
        String query = searchField.getText().toLowerCase();

        // Clear current display
        productDisplay.getChildren().clear();

        // Filter and add matching items
        for (SkincareProducts product : skincareProductsList) {
            if (product.getName().toLowerCase().contains(query)) {
                productDisplay.getChildren().add(createProductDisplay(product.getName(), product.getBrand(), product.getSkinType(), product.getImagePath()));
            }
        }
    }

    // Method to show all the products
    @FXML
    private void filterAll(MouseEvent event) {
        // Sorting by name
        skincareProductsList.sort((product1, product2) -> product1.getName().compareTo(product2.getName()));

        // Cleaning the VBox productDisplay
        productDisplay.getChildren().clear();

        for (SkincareProducts product : skincareProductsList) {
            productDisplay.getChildren().add(createProductDisplay(product.getName(), product.getBrand(), product.getSkinType(), product.getImagePath()));
        }
    }

    // Method to filter by Brand
    @FXML
    private void filterBrand(MouseEvent event) {
        // Sorting by Brand
        skincareProductsList.sort((product1, product2) -> product1.getBrand().compareTo(product2.getBrand()));

        // Cleaning the VBox productDisplay
        productDisplay.getChildren().clear();

        for (SkincareProducts product : skincareProductsList) {
            productDisplay.getChildren().add(createProductDisplay(product.getName(), product.getBrand(), product.getSkinType(), product.getImagePath()));
        }
    }

    // Method to filter by Oily Skin
    @FXML
    private void filterOilySkin(MouseEvent event) {
        // Creating a List with products that are suitable for oily skin
        List<SkincareProducts> oilySkinProducts = new ArrayList<>();

        for (SkincareProducts product : skincareProductsList) {
            if (product.getSkinType().equals("Oily Skin") || product.getSkinType().equals("All Skin Types")) {
                oilySkinProducts.add(product);
            }
        }

        // Sorting by name
        oilySkinProducts.sort((product1, product2) -> product1.getName().compareTo(product2.getName()));

        // Cleaning the VBox productDisplay
        productDisplay.getChildren().clear();

        for (SkincareProducts product : oilySkinProducts) {
            productDisplay.getChildren().add(createProductDisplay(product.getName(), product.getBrand(), product.getSkinType(), product.getImagePath()));
        }
    }

    // Method to filter by Sensitive Skin
    @FXML
    private void filterSensitiveSkin(MouseEvent event) {
        // Creating a List with products that are suitable for sensitive skin
        List<SkincareProducts> sensitiveSkinProducts = new ArrayList<>();

        for (SkincareProducts product : skincareProductsList) {
            if (product.getSkinType().equals("Sensitive Skin") || product.getSkinType().equals("All Skin Types")) {
                sensitiveSkinProducts.add(product);
            }
        }

        // Sorting by name
        sensitiveSkinProducts.sort((product1, product2) -> product1.getName().compareTo(product2.getName()));

        // Cleaning the VBox productDisplay
        productDisplay.getChildren().clear();

        for (SkincareProducts product : sensitiveSkinProducts) {
            productDisplay.getChildren().add(createProductDisplay(product.getName(), product.getBrand(), product.getSkinType(), product.getImagePath()));
        }
    }

    // Method to filter by Sensitive Skin
    @FXML
    private void filterDrySkin(MouseEvent event) {
        // Creating a List with products that are suitable for dry skin
        List<SkincareProducts> drySkinProducts = new ArrayList<>();

        for (SkincareProducts product : skincareProductsList) {
            if (product.getSkinType().equals("Dry Skin") || product.getSkinType().equals("All Skin Types")) {
                drySkinProducts.add(product);
            }
        }

        // Sorting by name
        drySkinProducts.sort((product1, product2) -> product1.getName().compareTo(product2.getName()));

        // Cleaning the VBox productDisplay
        productDisplay.getChildren().clear();

        for (SkincareProducts product : drySkinProducts) {
            productDisplay.getChildren().add(createProductDisplay(product.getName(), product.getBrand(), product.getSkinType(), product.getImagePath()));
        }
    }

    // Method to filter by Sensitive Skin
    @FXML
    private void filterNormalSkin(MouseEvent event) {
        // Creating a List with products that are suitable for normal skin
        List<SkincareProducts> normalSkinProducts = new ArrayList<>();

        for (SkincareProducts product : skincareProductsList) {
            if (product.getSkinType().equals("Normal Skin") || product.getSkinType().equals("All Skin Types")) {
                normalSkinProducts.add(product);
            }
        }

        // Sorting by name
        normalSkinProducts.sort((product1, product2) -> product1.getName().compareTo(product2.getName()));

        // Cleaning the VBox productDisplay
        productDisplay.getChildren().clear();

        for (SkincareProducts product : normalSkinProducts) {
            productDisplay.getChildren().add(createProductDisplay(product.getName(), product.getBrand(), product.getSkinType(), product.getImagePath()));
        }
    }


    // Method to filter by Cleansers
    @FXML
    private void filterCleanser(MouseEvent event) {
        // Creating a List with products that are cleansers
        List<SkincareProducts> cleanserProducts = new ArrayList<>();

        for (SkincareProducts product : skincareProductsList) {
            if (product.getProductType().equals("Cleanser")) {
                cleanserProducts.add(product);
            }
        }

        // Sorting by name
        cleanserProducts.sort((product1, product2) -> product1.getName().compareTo(product2.getName()));

        // Cleaning the VBox productDisplay
        productDisplay.getChildren().clear();

        for (SkincareProducts product : cleanserProducts) {
            productDisplay.getChildren().add(createProductDisplay(product.getName(), product.getBrand(), product.getSkinType(), product.getImagePath()));
        }
    }

    // Method to filter by Toner
    @FXML
    private void filterToner(MouseEvent event) {
        // Creating a List with products that are toners
        List<SkincareProducts> tonerProducts = new ArrayList<>();

        for (SkincareProducts product : skincareProductsList) {
            if (product.getProductType().equals("Toner")) {
                tonerProducts.add(product);
            }
        }

        // Sorting by name
        tonerProducts.sort((product1, product2) -> product1.getName().compareTo(product2.getName()));

        // Cleaning the VBox productDisplay
        productDisplay.getChildren().clear();

        for (SkincareProducts product : tonerProducts) {
            productDisplay.getChildren().add(createProductDisplay(product.getName(), product.getBrand(), product.getSkinType(), product.getImagePath()));
        }
    }

    // Method to filter by Moisturizer
    @FXML
    private void filterMoisturizer(MouseEvent event) {
        // Creating a List with products that are moisturizers
        List<SkincareProducts> moisturizerProducts = new ArrayList<>();

        for (SkincareProducts product : skincareProductsList) {
            if (product.getProductType().equals("Moisturizer")) {
                moisturizerProducts.add(product);
            }
        }

        // Sorting by name
        moisturizerProducts.sort((product1, product2) -> product1.getName().compareTo(product2.getName()));

        // Cleaning the VBox productDisplay
        productDisplay.getChildren().clear();

        for (SkincareProducts product : moisturizerProducts) {
            productDisplay.getChildren().add(createProductDisplay(product.getName(), product.getBrand(), product.getSkinType(), product.getImagePath()));
        }
    }

    // Method to filter by Serum
    @FXML
    private void filterSerum(MouseEvent event) {
        // Creating a List with products that are serums
        List<SkincareProducts> serumProducts = new ArrayList<>();

        for (SkincareProducts product : skincareProductsList) {
            if (product.getProductType().equals("Serum")) {
                serumProducts.add(product);
            }
        }

        // Sorting by name
        serumProducts.sort((product1, product2) -> product1.getName().compareTo(product2.getName()));

        // Cleaning the VBox productDisplay
        productDisplay.getChildren().clear();

        for (SkincareProducts product : serumProducts) {
            productDisplay.getChildren().add(createProductDisplay(product.getName(), product.getBrand(), product.getSkinType(), product.getImagePath()));
        }
    }

    // Method to filter by Sunscreen
    @FXML
    private void filterSunscreen(MouseEvent event) {
        // Creating a List with products that are sunscreens
        List<SkincareProducts> sunscreenProducts = new ArrayList<>();

        for (SkincareProducts product : skincareProductsList) {
            if (product.getProductType().equals("Sunscreen")) {
                sunscreenProducts.add(product);
            }
        }

        // Sorting by name
        sunscreenProducts.sort((product1, product2) -> product1.getName().compareTo(product2.getName()));

        // Cleaning the VBox productDisplay
        productDisplay.getChildren().clear();

        for (SkincareProducts product : sunscreenProducts) {
            productDisplay.getChildren().add(createProductDisplay(product.getName(), product.getBrand(), product.getSkinType(), product.getImagePath()));
        }
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
