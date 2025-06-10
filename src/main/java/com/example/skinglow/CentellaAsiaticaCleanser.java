package com.example.skinglow;

public class CentellaAsiaticaCleanser extends Cleanser implements IGiveTips {

    public CentellaAsiaticaCleanser(String name, String brand, String skinType, String presentation, String imagePath,
                                    String productInfo, String howToUse, String benefits, float price) {
        super(name, brand, skinType, "Centella Asiatica", presentation, imagePath, productInfo, howToUse, benefits, price);
    }

    @Override
    public void giveTips(String skinType) {

    }

    @Override
    public void giveTips() {

    }
}
