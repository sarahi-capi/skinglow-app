package com.example.skinglow;

public class Sunscreen extends SkincareProducts {
    public Sunscreen(String name, String brand, String skinType, String mainComponents, String presentation, String imagePath,
                       String productInfo, String howToUse, String benefits, float price, String url) {
        super(name, brand, skinType, mainComponents, presentation, "Moisturizer", imagePath, productInfo, howToUse, benefits, price, url);
    }

    @Override
    public String howToUse() {
        return """
           🔹 Apply generously as the final step in your morning routine

            1. Use about 1/4 teaspoon for your face
            2. Dot onto forehead, cheeks, nose, chin
            3. Gently spread and pat until fully absorbed
            4. Don’t forget ears, neck, and exposed areas

           💡 Reapply every 2 hours when in direct sun. Apply 15 minutes before sun exposure.
           """;
    }

    @Override
    public String whenToUse() {
        return """
            - Step: Final step in your AM routine (after moisturizer).
            - Purpose: Protects skin from UVA/UVB rays, preventing premature aging and skin cancer.
            - Frequency: Every morning. Reapply throughout the day when exposed to sun.
           """;
    }

    @Override
    public String morningRoutine() {
        return """
            Essential! Finish your routine with sunscreen daily, even if it's cloudy or you're indoors near windows.

                ➤ Choose SPF 30+ and broad-spectrum
                ➤ Apply as last step, 15 mins before sun exposure
           """;
    }

    @Override
    public String nightRoutine() {
        return """
            ❌ Skip sunscreen at night.
            Sunscreen is only needed during the day when exposed to light.
           """;
    }
}
