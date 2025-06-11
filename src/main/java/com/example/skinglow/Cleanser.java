package com.example.skinglow;

public class Cleanser extends SkincareProducts {

    public Cleanser(String name, String brand, String skinType, String mainComponents, String presentation, String imagePath,
                    String productInfo, String howToUse, String benefits, float price, String url) {
        super(name, brand, skinType, mainComponents, presentation, "Cleanser", imagePath, productInfo, howToUse, benefits, price, url);
    }

    @Override
    public String howToUse() {
        return """
               🔹 Use on damp skin (unless using an oil cleanser — apply that to dry skin)
               
                1. Oil-Based Cleanser:
                    - Pump a small amount onto dry hands
                    - Massage gently onto dry face in circular motions
                    - Add a splash of water to emulsify (it turns milky)
                    - Rinse with lukewarm water
                2. Water-Based Cleanser:
                    - Wet face with lukewarm water
                    - Apply a small amount of cleanser to hands and lather
                    - Massage gently over face (20–60 seconds)
                    - Rinse thoroughly and pat dry with a soft towel

               💡 Do not over-cleanse! This can strip your skin and cause dryness or irritation.
               ⚠️ Avoid using very hot water—it can dry or irritate the skin.
               """;
    }

    @Override
    public String whenToUse() {
        return """
                - Step: Step 1 in your skincare routine (morning and night).
                - Purpose: To remove dirt, oil, sweat, sunscreen, and makeup.
                - Frequency: Twice daily (AM & PM), or just PM if your skin is very dry or sensitive.
               """;
    }

    @Override
    public String morningRoutine() {
        return """
                Just use a water-based cleanser to remove oils and sweat that built up overnight.
                Keeps your skin fresh and preps it for the next steps (like toner, serum, and sunscreen).
               """;
    }

    @Override
    public String nightRoutine() {
        return """
                If you wear sunscreen or makeup, try the Korean double cleanse method:

                1. Oil-based Cleanser (1st cleanse)
                    Removes: makeup, sunscreen, excess sebum.
                        ➤ Example: cleansing oil, balm.
             
                2. Water-based Cleanser (2nd cleanse)
                    Removes: sweat, dirt, water-based impurities.
                        ➤ Example: gel or foam cleanser.
      
               🧴 If you're not wearing makeup or SPF, you can skip the oil-based cleanser and go straight to the water-based one.
               """;
    }
}
