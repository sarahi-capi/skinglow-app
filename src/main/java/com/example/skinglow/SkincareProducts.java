package com.example.skinglow;

import java.util.Comparator;

public abstract class SkincareProducts {
    private String name;
    private String brand;
    private String skinType;
    private String mainComponent;
    private String presentation;
    private String productType;
    private String imagePath;

    public SkincareProducts(String name, String brand, String skinType, String mainComponent, String presentation, String productType, String imagePath) {
        this.name = name;
        this.brand = brand;
        this.skinType = skinType;
        this.mainComponent = mainComponent;
        this.presentation = presentation;
        this.productType = productType;
        this.imagePath = imagePath;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public String getSkinType() {
        return skinType;
    }

    public String getMainComponent() {
        return mainComponent;
    }

    public String getPresentation() {
        return presentation;
    }

    public String getProductType() {
        return productType;
    }

    public String getImagePath() {
        return imagePath;
    }

    abstract void howToUse();
    abstract void showInfo();
    abstract void getRoutineStep();
}
