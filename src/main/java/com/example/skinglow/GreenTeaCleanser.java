package com.example.skinglow;

public class GreenTeaCleanser extends Cleanser implements IReduceRedness, IOilControlling {

    public GreenTeaCleanser(String name, String brand, String skinType, String presentation, String imagePath) {
        super(name, brand, skinType, "Green Tea", presentation, imagePath);
    }

    @Override
    public void controlOil() {

    }

    @Override
    public void reduceRednessEffect() {

    }
}
