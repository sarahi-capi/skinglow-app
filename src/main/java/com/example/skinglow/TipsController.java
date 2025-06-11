package com.example.skinglow;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;


public class TipsController {
    // To add the tips into the labels
    @FXML private Label tips1;
    @FXML private Label tips2;

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
        if(product instanceof RiceWaterCleanser) {
            tips1.setText(((RiceWaterCleanser) product).giveTips());
            tips2.setText(((RiceWaterCleanser) product).giveTips(product.getSkinType()));
        }
    }
}
