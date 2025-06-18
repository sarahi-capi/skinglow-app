package com.example.skinglow;

public class CeramideMoisturizer extends Moisturizer implements IGiveTips {
    public CeramideMoisturizer(String name, String brand, String skinType, String presentation, String imagePath,
                               String productInfo, String howToUse, String benefits, float price, String url) {
        super(name, brand, skinType, "Ceramide", presentation, imagePath, productInfo, howToUse, benefits, price, url);
    }

    @Override
    public String giveTips(String skinType) {
        return switch (skinType) {
            case "All Skin Types" -> "Opt for a lightweight, non-comedogenic ceramide formula. This gives hydration without overwhelming the skin — ideal year-round.";
            case "Oily Skin" -> "Don’t skip moisturizer! Use a gel-cream with ceramides to balance oil production and strengthen your barrier without greasiness.";
            case "Sensitive Skin" -> "Ceramides are excellent for reducing redness and irritation. Look for fragrance-free options and pair with soothing ingredients like Centella Asiatica.";
            default -> "Use a thicker cream with multiple ceramides (1, 3, 6-II) to deeply restore your barrier. Layer over a hydrating serum for all-day comfort.";
        };
    }

    @Override
    public String giveTips() {
        return """
                • Ceramides are lipids that naturally occur in your skin and help reinforce the skin barrier.
                • Use as the final step in your routine (before sunscreen in the AM).
                • Best applied to slightly damp skin to lock in moisture.
                • Great after treatments like retinol, exfoliants, or acids to calm and restore.
                • Look for moisturizers with ceramides + cholesterol + fatty acids for optimal repair (the “golden ratio”).
                """;
    }
}