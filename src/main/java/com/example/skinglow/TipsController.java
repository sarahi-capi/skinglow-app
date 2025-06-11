package com.example.skinglow;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;


public class TipsController {
    // To add the tips into the labels
    @FXML private Label tips1;
    @FXML private Label tips2;
    @FXML private Label generalTips;
    @FXML private Label specialTips;

    // To change the cursor
    @FXML private StackPane tipsView;


    // METHODS
    public void initialize() {
        // Changing the cursor for the whole scene
        SettingCursor settingCursor = new SettingCursor();

        settingCursor.pointerCursor(tipsView);
    }

    // Method to set the tips information
    public void showProductTips(SkincareProducts product) {
        if (product instanceof IGiveTips giveTips) {
            generalTips.setText("General Tips about " + product.getMainComponents() + ": ");
            tips1.setText(giveTips.giveTips());
            specialTips.setText("Special Tips for " + product.getSkinType() + ": ");
            tips2.setText(giveTips.giveTips(product.getSkinType()));
        } else {
            generalTips.setText("No tips available.");
            tips1.setText("");
            specialTips.setText("");
            tips2.setText("");
        }
    }
}
