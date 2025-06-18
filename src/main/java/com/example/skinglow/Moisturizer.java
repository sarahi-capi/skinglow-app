package com.example.skinglow;

public class Moisturizer extends SkincareProducts {
    public Moisturizer(String name, String brand, String skinType, String mainComponents, String presentation, String imagePath,
                 String productInfo, String howToUse, String benefits, float price, String url) {
        super(name, brand, skinType, mainComponents, presentation, "Moisturizer", imagePath, productInfo, howToUse, benefits, price, url);
    }

    @Override
    public String howToUse() {
        return """
           • Apply to face and neck as the final step of your skincare routine (unless you're adding sunscreen).

            1. Take a small amount (pea-sized or less)
            2. Warm it between your fingers
            3. Gently massage or pat into the skin in upward motions

           • Avoid over-applying; too much can clog pores or leave residue.
           """;
    }

    @Override
    public String whenToUse() {
        return """
            • Step: Step 4 in your skincare routine (after serum).
            • Purpose: Locks in hydration and seals in previous layers.
            • Frequency: Twice daily (AM & PM).
           """;
    }

    @Override
    public String morningRoutine() {
        return """
            Use a lightweight moisturizer that hydrates and layers well under sunscreen or makeup.
                • Gel-creams or emulsions work well for oily skin in the morning.
           """;
    }

    @Override
    public String nightRoutine() {
        return """
            Use a richer moisturizer to support overnight skin recovery:

            1. Apply after serum
            2. Choose creams with ceramides, peptides, or oils depending on skin needs
            3. Let it fully absorb before bed

           • For extra hydration, you can "slug" with a balm or occlusive layer on top.
           """;
    }
}
