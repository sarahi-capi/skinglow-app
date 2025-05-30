package com.example.skinglow;

public class SalicylicAcidCleanser extends Cleanser implements ITreatsAcne, IExfoliating {

    public SalicylicAcidCleanser(String name, String brand, String skinType, String presentation, String imagePath) {
        super(name, brand, skinType, "Salicylic Acid", presentation, imagePath);
    }

    @Override
    public void treatAcne() {

    }

    @Override
    public void exfoliate() {

    }
}
