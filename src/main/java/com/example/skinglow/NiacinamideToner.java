package com.example.skinglow;

public class NiacinamideToner extends Toner implements IGiveTips {
    public NiacinamideToner(String name, String brand, String skinType, String presentation, String imagePath,
                            String productInfo, String howToUse, String benefits, float price) {
        super(name, brand, skinType, "Niacinamide", presentation, imagePath, productInfo, howToUse, benefits, price);
    }

    @Override
    public void giveTips(String skinType) {

    }

    @Override
    public void giveTips() {

    }
}
