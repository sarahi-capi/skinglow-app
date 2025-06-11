package com.example.skinglow;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

import java.util.ArrayList;
import java.util.List;


public class TutorialController {
    // VARIABLES

    // To change the cursors
    @FXML private StackPane tutorialView;

    // ImageView to change the image depending on the Skincare step
    @FXML private ImageView stepsImage;

    // To set the background
    @FXML private ImageView tutorialScreenBackground;

    // Labels to display the instructions based on the Skincare step
    @FXML private Label howToUseLabel;
    @FXML private Label whenToUseLabel;
    @FXML private Label morningRoutineLabel;
    @FXML private Label nightRoutineLabel;

    // Label to show in which step we are
    @FXML private Label stepLabel;

    // To control when to hide them
    @FXML private VBox stepsVBox;
    @FXML private Button nextStepButton;

    // VBox to add to it a label at the very end of the tutorial
    @FXML private VBox tutorialVBox;

    // To manage the image display
    ImageManager imageManager = new ImageManager();

    // To manage the tutorial information display
    TutorialInformationManager tutorialInformationManager = new TutorialInformationManager();

    // To manage the steps and their corresponding image
    private final List<Steps> steps = List.of(
            new Steps("Step 2: Toner", "/images/skincareSteps/TonerCartoon.png"),
            new Steps("Step 3: Serum", "/images/skincareSteps/SerumCartoon.png"),
            new Steps("Step 4: Moisturizer", "/images/skincareSteps/MoisturizerCartoon.png"),
            new Steps("Step 5: Sunscreen", "/images/skincareSteps/SunscreenCartoon.png")
    );

    // List to get the instructions from the Skincare products
    List<SkincareProducts> skincareProductsList = new ArrayList<>();

    // Array to store all the labels containing the text that is going to be displayed in the TitledPanes
    private Label[] instructions;

    // Int to control in which step we are
    int counter = 0; // Starting with 0, as we want to access the first element


    // METHODS
    public void initialize() {

        // Setting images
        imageManager.addingImage(stepsImage, "/images/skincareSteps/CleanserCartoon.png");
        imageManager.addingImage(tutorialScreenBackground, "/images/TutorialBackground1.png");

        // Array to store all the labels containing the text that is going to be displayed in the TitledPanes
        instructions = new Label[]{howToUseLabel, whenToUseLabel, morningRoutineLabel, nightRoutineLabel};

        // Creating objects with no information just to get the instructions
        skincareProductsList.addAll(List.of(
                new Cleanser("", "", "", "", "", "", "", "", "", 0, ""),
                new Toner("", "", "", "", "", "", "", "", "", 0, ""),
                new Serum("", "", "", "", "", "", "", "", "", 0, ""),
                new Moisturizer("", "", "", "", "", "", "", "", "", 0, ""),
                new Sunscreen("", "", "", "", "", "", "", "", "", 0, "")
        ));

        // Filling up with the first step information
        tutorialInformationManager.settingInstructions(skincareProductsList.getFirst(), instructions);

        // Setting cursors
        SettingCursor cursor = new SettingCursor();
        cursor.pointerCursor(tutorialView);
        cursor.handCursor(nextStepButton);
    }

    @FXML
    private void nextStep(MouseEvent event) {

        if (counter < skincareProductsList.size() - 1) {

            // Getting the current step information form the steps List
            Steps step = steps.get(counter);

            // Setting the label and image
            stepLabel.setText(step.labelText);
            imageManager.addingImage(stepsImage, step.imagePath);

            // Getting the current step information from the Skincare List
            SkincareProducts currentStep = skincareProductsList.get(counter + 1);
            tutorialInformationManager.settingInstructions(currentStep, instructions);

            // Adding 1 to the counter
            counter++;

        } else {
            stepLabel.setText("That's it!");
            imageManager.addingImage(stepsImage, "/images/skincareSteps/DoneCartoon.png");

            // Setting a new background
            imageManager.addingImage(tutorialScreenBackground, "/images/TutorialBackground2.png");

            // Deleting unnecessary VBox and Buttons
            tutorialVBox.getChildren().removeAll(stepsVBox, nextStepButton);

            // Adding a new label
            Label label = new Label("Please, close this window");
            label.setStyle("-fx-font-size: 16px;");
            tutorialVBox.getChildren().add(label);
        }
    }
}



