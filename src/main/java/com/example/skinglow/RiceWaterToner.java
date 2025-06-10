package com.example.skinglow;

public class RiceWaterToner extends Toner implements IGiveTips {
    public RiceWaterToner(String name, String brand, String skinType, String presentation, String imagePath,
                          String productInfo, String howToUse, String benefits, float price) {
        super(name, brand, skinType, "Rice Water", presentation, imagePath, productInfo, howToUse, benefits, price);
    }

    @Override
    public void giveTips(String skinType) {

    }

    @Override
    public void giveTips() {

    }
}
