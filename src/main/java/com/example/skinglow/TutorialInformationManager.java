package com.example.skinglow;

import javafx.scene.control.Label;

public class TutorialInformationManager {

    // Method to show the instructions based on the Skincare step
    public void settingInstructions(SkincareProducts skincareProduct, Label[] label) {
        label[0].setText(skincareProduct.howToUse());
        label[1].setText(skincareProduct.whenToUse());
        label[2].setText(skincareProduct.morningRoutine());
        label[3].setText(skincareProduct.nightRoutine());
    }

}
