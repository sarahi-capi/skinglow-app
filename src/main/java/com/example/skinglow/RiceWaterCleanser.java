package com.example.skinglow;

public class RiceWaterCleanser extends Cleanser implements IGiveTips {

    public RiceWaterCleanser(String name, String brand, String skinType, String presentation, String imagePath,
                             String productInfo, String howToUse, String benefits, float price, String url) {
        super(name, brand, skinType, "Rice Water", presentation, imagePath, productInfo, howToUse, benefits, price, url);
    }

    @Override
    public String giveTips(String skinType) {
        return "This is a tip for " + skinType;
    }

    @Override
    public String giveTips() {
        return "This is a tip";
    }

}
