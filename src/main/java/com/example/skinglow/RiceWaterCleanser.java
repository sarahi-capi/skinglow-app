package com.example.skinglow;

public class RiceWaterCleanser extends Cleanser implements IBrightening, IHydrating {

    public RiceWaterCleanser(String name, String brand, String skinType, String presentation) {
        super(name, brand, skinType, "Rice Water", presentation);
    }

    @Override
    public void hydrate() {

    }

    @Override
    public void brighten() {

    }
}
