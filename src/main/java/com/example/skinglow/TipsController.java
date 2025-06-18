package com.example.skinglow;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;


public class TipsController {
    // To add the tips into the labels
    @FXML private Label generalTipsTitle;
    @FXML private Label specialTipsTitle;
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
            generalTipsTitle.setText("General Tips about " + product.getMainComponents() + ": ");
            generalTips.setText(giveTips.giveTips());
            specialTipsTitle.setText("Special Tips for " + product.getSkinType() + ": ");
            specialTips.setText(giveTips.giveTips(product.getSkinType()));
        } else {
            generalTipsTitle.setText("No tips available.");
            generalTips.setText("");
            specialTipsTitle.setText("");
            specialTips.setText("");
        }
    }
}
