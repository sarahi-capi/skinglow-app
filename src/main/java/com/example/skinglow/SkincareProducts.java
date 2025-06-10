package com.example.skinglow;

public abstract class SkincareProducts {
    private String name;
    private String brand;
    private String skinType;
    private String mainComponents;
    private String presentation;
    private String productType;
    private String imagePath;
    private String productInfo;
    private String howToUse;
    private String benefits;
    private float price;

    public SkincareProducts(String name, String brand, String skinType, String mainComponents, String presentation, String productType, String imagePath,
                            String productInfo, String howToUse, String benefits, float price) {
        this.name = name;
        this.brand = brand;
        this.skinType = skinType;
        this.mainComponents = mainComponents;
        this.presentation = presentation;
        this.productType = productType;
        this.imagePath = imagePath;
        this.productInfo = productInfo;
        this.howToUse = howToUse;
        this.benefits = benefits;
        this.price = price;
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

    public String getMainComponents() {
        return mainComponents;
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

    abstract String howToUse();
    abstract String whenToUse();
    abstract String morningRoutine();
    abstract String nightRoutine();
}
