package com.example.skinglow;

public abstract class SkincareProducts {
    private String name;
    private String brand;
    private String skinType;
    private String mainComponent;
    private String presentation;
    private  String productType;

    public SkincareProducts(String name, String brand, String skinType, String mainComponent, String presentation, String productType) {
        this.name = name;
        this.brand = brand;
        this.skinType = skinType;
        this.mainComponent = mainComponent;
        this.presentation = presentation;
        this.productType = productType;
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

    abstract void howToUse();
    abstract void showInfo();
    abstract void getRoutineStep();
}
