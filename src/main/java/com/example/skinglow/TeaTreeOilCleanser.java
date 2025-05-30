package com.example.skinglow;

public class TeaTreeOilCleanser extends Cleanser implements ITreatsAcne{

    public TeaTreeOilCleanser(String name, String brand, String skinType, String presentation) {
        super(name, brand, skinType, "Tea Tree", presentation);
    }

    @Override
    public void treatAcne() {

    }
}
