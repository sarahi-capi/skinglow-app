package com.example.skinglow;

public class RiceWaterCleanser extends Cleanser implements IGiveTips {

    public RiceWaterCleanser(String name, String brand, String skinType, String presentation, String imagePath,
                             String productInfo, String howToUse, String benefits, float price, String url) {
        super(name, brand, skinType, "Rice Water", presentation, imagePath, productInfo, howToUse, benefits, price, url);
    }

    @Override
    public String giveTips(String skinType) {
        return switch (skinType) {
            case "All Skin Types" -> "Works well for everyone, especially when you want a gentle reset or are in a phase of reducing actives. Very beginner-friendly.";
            case "Oily Skin" -> "Use as a second step in your double cleanse (after a cleansing oil or balm). Helps cleanse without triggering excess oil production.";
            case "Sensitive Skin" -> "Choose a fragrance-free formula and use it once a day at first. Rice water soothes and strengthens without irritation.";
            default -> "Works wonderfully as a morning cleanser that won’t strip your skin. Look for formulations with added ceramides or glycerin.";
        };
    }

    @Override
    public String giveTips() {
        return """
                • Gently cleanses without stripping — ideal for dull, tired, or uneven skin tones.
                • Rich in vitamins B and E — helps soothe and brighten while maintaining hydration.
                • Use as a morning cleanser or as the second step in double cleansing at night.
                • Massage into damp skin for 30–60 seconds, then rinse with lukewarm water.
                """;
    }

}
