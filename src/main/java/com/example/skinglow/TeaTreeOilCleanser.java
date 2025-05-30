package com.example.skinglow;

public class TeaTreeOilCleanser extends Cleanser implements ITreatsAcne{

    public TeaTreeOilCleanser(String name, String brand, String skinType, String presentation, String imagePath) {
        super(name, brand, skinType, "Tea Tree", presentation, imagePath);
    }

    @Override
    public void treatAcne() {

    }
}
