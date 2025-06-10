package com.example.skinglow;

public class Serum extends SkincareProducts {
    public Serum(String name, String brand, String skinType, String mainComponents, String presentation, String imagePath,
                 String productInfo, String howToUse, String benefits, float price) {
        super(name, brand, skinType, mainComponents, presentation, "Serum", imagePath, productInfo, howToUse, benefits, price);
    }

    @Override
    public String howToUse() {
        return """
               🔹 Apply after toner, before moisturizer
               
               General Steps:
                1. Apply 2–3 drops of serum to fingertips.
                2. Gently spread and press into skin (avoid rubbing harshly).
                3. Wait 30 seconds to 1 minute before applying the next layer.

               💡 For multiple serums, apply from thinnest to thickest texture or by priority of concern (e.g., acne first, hydration second).
               ⚠️ Avoid layering strong actives together unless you're sure they’re compatible (e.g., don’t mix Vitamin C + AHA + Retinol in one routine).
               """;
    }

    @Override
    public String whenToUse() {
        return """
                - Step: Step 3 in your skincare routine (after toner, before moisturizer).
                - Purpose: To deliver targeted active ingredients deep into the skin to treat specific concerns (e.g., acne, pigmentation, fine lines, dehydration, dullness).
                - Frequency: Once or twice daily (AM & PM), depending on the serum and your skin’s tolerance.
               """;
    }

    @Override
    public String morningRoutine() {
        return """
                Daytime is great for protective or brightening serums, such as:
                - Vitamin C (brightens, evens tone, antioxidant)
                - Hyaluronic Acid (deep hydration)
                - Centella Asiatica or Green Tea (calms skin, anti-inflammatory)
                    ➤ Always follow with SPF after applying active serums in the AM!
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
