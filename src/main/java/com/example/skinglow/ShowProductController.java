package com.example.skinglow;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.util.Objects;
import java.util.Random;

public class ShowProductController {

    // Logo image
    @FXML private ImageView imageLogo;

    // Labels to display information about the product
    @FXML private Label mainComponentLabel;
    @FXML private Label nameLabel;
    @FXML private Label brandLabel;
    @FXML private Label skinTypeLabel;
    @FXML private Label presentationLabel;
    @FXML private Label productTypeLabel;
    @FXML private Text productInfoText;
    @FXML private Text howToUseText;
    @FXML private Text benefitsText;
    @FXML private Label priceLabel;

    // To change the background color for the Main Component Display
    @FXML private VBox mainComponentColor;
    private final String[] colors = {"#A8D1E7", "#EB8DB5", "#D4A3C4", "#FFBFC5"};

    // Image of the product
    @FXML private ImageView productImage;

    // To change the cursors
    @FXML private StackPane showProductView;
    @FXML private Button goBackButton;
    @FXML private Button giveTipsButton;
    @FXML private Button toWebsiteButton;

    // Save the product to access it later
    private SkincareProducts savedProduct;


    // METHODS

    public void initialize() {
        // Setting the Logo
        ImageManager imageManager = new ImageManager();
        imageManager.addingImage(imageLogo, "/images/SkinCareLogo.png");

        // Setting a random color for the main component label
        mainComponentColor.setStyle("-fx-background-color: " + randomColor(colors) + ";");


        imageManager.animateImage(productImage);

        // Changing the cursor for the buttons and the whole scene
        SettingCursor settingCursor = new SettingCursor();

        settingCursor.pointerCursor(showProductView);
        settingCursor.handCursor(giveTipsButton);
        settingCursor.handCursor(goBackButton);
        settingCursor.handCursor(toWebsiteButton);


    }

    // Method to add and show more information about the selected product
    public void setProduct(SkincareProducts product) {
        // Saving the product to access it through the while code
        savedProduct = product;

        // Setting all the labels text
        nameLabel.setText(product.getName());
        mainComponentLabel.setText("With " + product.getMainComponents());
        brandLabel.setText(product.getBrand());
        priceLabel.setText(String.format(" - €%.2f", product.getPrice()));
        presentationLabel.setText("• Product presentation: " + product.getPresentation());
        productTypeLabel.setText("• This is a " + product.getProductType() + " product.");
        skinTypeLabel.setText("• This product is perfect for " + product.getSkinType() + ".");
        productInfoText.setText("• " + product.getProductInfo());
        howToUseText.setText("• " + product.getHowToUse());
        benefitsText.setText("• " + product.getBenefits());

        // Setting the product image and animate it on hover
        Image image = new Image(Objects.requireNonNull(getClass().getResourceAsStream(product.getImagePath())));
        productImage.setImage(image);
    }

    // Method that takes a random number between 0 and 3 and selects the color from the array
    public String randomColor(String[] colors) {
        Random random = new Random();
        int randomNumber = random.nextInt(4);

        return colors[randomNumber];
    }

    // Method to change to load the window of Tips
    public void showTips(MouseEvent event) throws IOException {
        // Loading the tutorial window
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("tips-scene.fxml"));
        Parent root = fxmlLoader.load();
        Scene newScene = new Scene(root,375, 375 );

        // Creating a new Stage and showing it
        Stage newStage = new Stage();
        newStage.setScene(newScene);
        newStage.show();

        // Fading in the new window
        WindowTransition windowTransition = new WindowTransition();
        windowTransition.fadeInTransition(root);

        // Setting the Logo
        newStage.getIcons().add(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/images/SkinCareLogo.png"))));

        // Setting the information of the product to the Tips Controller
        TipsController controller = fxmlLoader.getController();
        controller.showProductTips(savedProduct);
    }

    // Method to go back to the Catalog Window
    public void goToCatalogWindow(MouseEvent event) throws IOException {
        // Loading the catalog window
        FXMLLoader loader = new FXMLLoader(getClass().getResource("catalog-scene.fxml"));
        Parent newRoot = loader.load();

        // Get current stage and scene
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene currentScene = stage.getScene();

        // Fading out the old window and fading in the new window
        WindowTransition transition = new WindowTransition();
        transition.fadeOutInTransition(currentScene, newRoot, stage);
    }

    // Method to open the URL of the product when the button is clicked
    @FXML
    private void toWebsite(MouseEvent event) {
        openProductLink(savedProduct.getUrl()); // Replace with your actual product URL
    }

    // Method to open a URL in the user's desktop
    public void openProductLink(String url) {
        try {
            if (Desktop.isDesktopSupported()) {
                Desktop.getDesktop().browse(new URI(url));
            } else {
                System.err.println("Desktop is not supported.");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}



