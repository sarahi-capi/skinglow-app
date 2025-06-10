package com.example.skinglow;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.ImageCursor;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Arrays;
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
    @FXML private VBox productDisplayVBox;

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
    @FXML private Button tutorialButton;

    // To manage the images
    ImageManager imageManager = new ImageManager();

    // To manage the fade in transition
    Transition fadeIn = new Transition();

    // To manage the product's display
    ProductDisplayManager productDisplay = new ProductDisplayManager();

    // List with all the products
    private List<SkincareProducts> skincareProductsList;

    public void initialize() {

        // Saving VBoxes in a list to change their cursor
        List<VBox> cursorVBoxes = Arrays.asList(
                all,
                brand,
                oilySkin,
                sensitiveSkin,
                drySkin,
                normalSkin,
                cleanser,
                toner,
                moisturizer,
                serum,
                sunscreen
        );

        // Saving Buttons in a list to change their cursor
        List<Button> cursorButtons = Arrays.asList(
                searchButton,
                tutorialButton
        );

        // Saving ImageView objects and their paths into two arrays
        ImageView[] imageViews = {imageLogo, allIcon, brandIcon, oilyIcon, sensitiveIcon, dryIcon, normalIcon, cleanserIcon, tonerIcon,
                                  moisturizerIcon, serumIcon, sunscreenIcon};
        String[] paths = {"/images/SkinCareLogo.png",
                          "/images/AllProducts.png",
                          "/images/Brand.png",
                          "/images/OilySkin.png",
                          "/images/SensitiveSkin.png",
                          "/images/DrySkin.png",
                          "/images/NormalSkin.png",
                          "/images/Cleanser.png",
                          "/images/Toner.png",
                          "/images/Moisturizer.png",
                          "/images/Serum.png",
                          "/images/Sunscreen.png"};

        // Adding the images to the ImageView
        imageManager.addingImage(imageViews, paths);

        // Adding products to be displayed
        ReadingProducts readingProducts = new ReadingProducts();
        skincareProductsList = readingProducts.loadProductsFromCSV("/csv/products.csv");

        // Sorting by name
        skincareProductsList.sort((product1, product2) -> product1.getName().compareTo(product2.getName()));

        // For each product in the list, create a product and add it to the VBox productDisplay
        skincareProductsList.forEach(product ->
                productDisplayVBox.getChildren().add(
                        productDisplay.createProductDisplay(
                                product.getName(),
                                product.getBrand(),
                                product.getSkinType(),
                                product.getImagePath()
                        )
                )
        );

        // Changing cursor and hand image
        SettingCursor settingCursor = new SettingCursor();

        settingCursor.pointerCursor(catalogView);

        cursorVBoxes.forEach(settingCursor::handCursor);
        cursorButtons.forEach(settingCursor::handCursor);

        settingCursor.editorCursor(searchField);

        // Changing text on hover for the tutorialButton
        tutorialButton.setOnMouseEntered(event -> tutorialButton.setText("Skincare Steps"));
        tutorialButton.setOnMouseExited(event -> tutorialButton.setText("?"));
    }

    // Method to display a window with explanation of the Skincare routine
    @FXML
    private void tutorialWindow(ActionEvent event) throws IOException {
        // Loading the tutorial window
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("tutorial-scene.fxml"));
        Parent root = fxmlLoader.load();
        Scene newScene = new Scene(root,375, 667 );

        // Creating a new Stage and showing it
        Stage newStage = new Stage();
        newStage.setScene(newScene);
        newStage.show();

        // Fading in the new window
        fadeIn.fadeInTransition(root);

        // Setting the Logo
        newStage.getIcons().add(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/images/SkinCareLogo.png"))));

    }

    // Method to filter a search based on a query
    @FXML
    private void onSearch(ActionEvent event) {
        String query = searchField.getText().toLowerCase();

        // Clear current display
        productDisplayVBox.getChildren().clear();

        // Filtering the products based on a query
        skincareProductsList.stream()
                // If the name in lower case contains the query
                .filter(product -> product.getName().toLowerCase().contains(query))
                // Then, add these products to the display
                .forEach(product -> productDisplayVBox.getChildren().add(
                        productDisplay.createProductDisplay(
                                product.getName(),
                                product.getBrand(),
                                product.getSkinType(),
                                product.getImagePath()
                        )
                ));
    }

    // Method to show all the products
    @FXML
    private void filterAll(MouseEvent event) {
        // Sorting by name
        skincareProductsList.sort((product1, product2) -> product1.getName().compareTo(product2.getName()));

        // Adding the products to the VBox
        productDisplay.showProducts(skincareProductsList, productDisplayVBox);
    }

    // Method to filter by Brand
    @FXML
    private void filterBrand(MouseEvent event) {
        // Sorting by Brand
        skincareProductsList.sort((product1, product2) -> product1.getBrand().compareTo(product2.getBrand()));

        // Adding the products to the VBox
        productDisplay.showProducts(skincareProductsList, productDisplayVBox);
    }

    // Method to filter by Oily Skin
    @FXML
    private void filterOilySkin(MouseEvent event) {
        // Creating a List with products that are suitable for oily skin
        List<SkincareProducts> oilySkinProducts = skincareProductsList.stream()
                // Filtering the products based on the SkinType and sorting them
                .filter(product -> product.getSkinType().equals("Oily Skin") ||
                                                   product.getSkinType().equals("All Skin Types")).sorted((
                                                           product1, product2) -> product1.getName().compareTo(product2.getName())
                )
                // Adding them to the list
                .toList();

        // Adding the products to the VBox
        productDisplay.showProducts(oilySkinProducts, productDisplayVBox);
    }

    // Method to filter by Sensitive Skin
    @FXML
    private void filterSensitiveSkin(MouseEvent event) {
        // Creating a List with products that are suitable for sensitive skin
        List<SkincareProducts> sensitiveSkinProducts = skincareProductsList.stream()
                // Filtering the products based on the SkinType and sorting them
                .filter(product -> product.getSkinType().equals("Sensitive Skin") ||
                                                   product.getSkinType().equals("All Skin Types")).sorted((
                        product1, product2) -> product1.getName().compareTo(product2.getName())
                )
                // Adding them to the list
                .toList();

        // Adding the products to the VBox
        productDisplay.showProducts(sensitiveSkinProducts, productDisplayVBox);
    }

    // Method to filter by Sensitive Skin
    @FXML
    private void filterDrySkin(MouseEvent event) {
        // Creating a List with products that are suitable for dry skin
        List<SkincareProducts> drySkinProducts = skincareProductsList.stream()
                // Filtering the products based on the SkinType and sorting them
                .filter(product -> product.getSkinType().equals("Dry Skin") ||
                                                   product.getSkinType().equals("All Skin Types")).sorted((
                        product1, product2) -> product1.getName().compareTo(product2.getName())
                )
                // Adding them to the list
                .toList();

        // Adding the products to the VBox
        productDisplay.showProducts(drySkinProducts, productDisplayVBox);
    }

    // Method to filter by Normal Skin
    @FXML
    private void filterNormalSkin(MouseEvent event) {
        // Creating a List with products that are suitable for normal skin
        List<SkincareProducts> normalSkinProducts = skincareProductsList.stream()
                // Filtering the products based on the SkinType and sorting them
                .filter(product -> product.getSkinType().equals("Normal Skin") ||
                                                   product.getSkinType().equals("All Skin Types")).sorted((
                        product1, product2) -> product1.getName().compareTo(product2.getName())
                )
                // Adding them to the list
                .toList();

        // Adding the products to the VBox
        productDisplay.showProducts(normalSkinProducts, productDisplayVBox);
    }


    // Method to filter by Cleansers
    @FXML
    private void filterCleanser(MouseEvent event) {
        // Creating a List with products that are cleansers
        List<SkincareProducts> cleanserProducts = skincareProductsList.stream()
                // Filtering the products based on the SkinType and sorting them
                .filter(product -> product.getProductType().equals("Cleanser")).sorted(
                        (product1, product2) -> product1.getName().compareTo(product2.getName())
                )
                // Adding them to the list
                .toList();

        // Adding the products to the VBox
        productDisplay.showProducts(cleanserProducts, productDisplayVBox);
    }

    // Method to filter by Toner
    @FXML
    private void filterToner(MouseEvent event) {
        // Creating a List with products that are toners
        List<SkincareProducts> tonerProducts = skincareProductsList.stream()
                // Filtering the products based on the SkinType and sorting them
                .filter(product -> product.getProductType().equals("Toner")).sorted(
                        (product1, product2) -> product1.getName().compareTo(product2.getName())
                )
                // Adding them to the list
                .toList();

        // Adding the products to the VBox
        productDisplay.showProducts(tonerProducts, productDisplayVBox);
    }

    // Method to filter by Moisturizer
    @FXML
    private void filterMoisturizer(MouseEvent event) {
        // Creating a List with products that are moisturizers
        List<SkincareProducts> moisturizerProducts = skincareProductsList.stream()
                // Filtering the products based on the SkinType and sorting them
                .filter(product -> product.getProductType().equals("Moisturizer")).sorted(
                        (product1, product2) -> product1.getName().compareTo(product2.getName())
                )
                // Adding them to the list
                .toList();

        // Adding the products to the VBox
        productDisplay.showProducts(moisturizerProducts, productDisplayVBox);
    }

    // Method to filter by Serum
    @FXML
    private void filterSerum(MouseEvent event) {
        // Creating a List with products that are serums
        List<SkincareProducts> serumProducts = skincareProductsList.stream()
                // Filtering the products based on the SkinType and sorting them
                .filter(product -> product.getProductType().equals("Serum")).sorted(
                        (product1, product2) -> product1.getName().compareTo(product2.getName())
                )
                // Adding them to the list
                .toList();

        // Adding the products to the VBox
        productDisplay.showProducts(serumProducts, productDisplayVBox);
    }

    // Method to filter by Sunscreen
    @FXML
    private void filterSunscreen(MouseEvent event) {
        // Creating a List with products that are sunscreens
        List<SkincareProducts> sunscreenProducts = skincareProductsList.stream()
                // Filtering the products based on the SkinType and sorting them
                .filter(product -> product.getProductType().equals("Sunscreen")).sorted(
                        (product1, product2) -> product1.getName().compareTo(product2.getName())
                )
                // Adding them to the list
                .toList();

        // Adding the products to the VBox
        productDisplay.showProducts(sunscreenProducts, productDisplayVBox);

    }
}
