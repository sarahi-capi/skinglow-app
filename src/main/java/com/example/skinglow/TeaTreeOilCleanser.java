package com.example.skinglow;

public class TeaTreeOilCleanser extends Cleanser implements IGiveTips {

    public TeaTreeOilCleanser(String name, String brand, String skinType, String presentation, String imagePath,
                              String productInfo, String howToUse, String benefits, float price) {
        super(name, brand, skinType, "Tea Tree Oil", presentation, imagePath, productInfo, howToUse, benefits, price);
    }

    @Override
    public void giveTips(String skinType) {

    }

    @Override
    public void giveTips() {

    }
}
