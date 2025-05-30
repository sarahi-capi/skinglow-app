package com.example.skinglow;

public class RiceWaterCleanser extends Cleanser implements IBrightening, IHydrating {

    public RiceWaterCleanser(String name, String brand, String skinType, String presentation, String imagePath) {
        super(name, brand, skinType, "Rice Water", presentation, imagePath);
    }

    @Override
    public void hydrate() {

    }

    @Override
    public void brighten() {

    }
}
