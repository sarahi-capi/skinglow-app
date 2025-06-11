package com.example.skinglow;

public class Toner extends SkincareProducts {
    public Toner(String name, String brand, String skinType, String mainComponents, String presentation, String imagePath,
                 String productInfo, String howToUse, String benefits, float price, String url) {
        super(name, brand, skinType, mainComponents, presentation, "Toner", imagePath, productInfo, howToUse, benefits, price, url);
    }

    @Override
    public String howToUse() {
        return """
               🔹 Apply after cleansing, while skin is still slightly damp
               
                1. Cotton Pad (for light exfoliating or oily skin):
                    - Pour toner onto pad
                    - Sweep gently across face and neck
                2. Hands (for hydrating toners or sensitive skin):
                    - Pour a few drops into clean palms
                    - Press gently into skin (pat-pat motion)
                    - No need to rinse!

               💡 For dry or dehydrated skin, you can layer toner 2–3 times (known as the “7-skin method” in K-beauty).
               """;
    }

    @Override
    public String whenToUse() {
        return """
                - Step: Step 2 in your skincare routine (after cleansing).
                - Purpose: To rebalance pH, lightly hydrate or exfoliate, and prepare your skin to absorb the next products.
                - Frequency: Twice daily (AM & PM), or once a day if using an exfoliating toner.
               """;
    }

    @Override
    public String morningRoutine() {
        return """
                Use a gentle, hydrating toner to refresh skin and help maintain balance after cleansing.
                It preps your skin to better absorb serums and moisturizers throughout the day.
                    ➤ Use hands or a cotton pad to pat in; no need to rinse.
               """;
    }

    @Override
    public String nightRoutine() {
        return """
                Use toner after cleansing to rebalance and refresh your skin:

                1. Hydrating Toner
                    Adds a moisture boost, calms and soothes the skin.
                        ➤ Apply with hands or pat in using cotton pad.
             
                2. Exfoliating Toner (2–4 times a week only)
                    Removes dead skin cells, unclogs pores
                        ➤ Ingredients to look for: AHA, BHA, PHA
      
               💡 Exfoliating toners are best used at night to avoid sun sensitivity.
               """;
    }
}
