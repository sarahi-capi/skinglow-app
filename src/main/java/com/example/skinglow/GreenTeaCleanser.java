package com.example.skinglow;

public class GreenTeaCleanser extends Cleanser implements IGiveTips {

    public GreenTeaCleanser(String name, String brand, String skinType, String presentation, String imagePath,
                            String productInfo, String howToUse, String benefits, float price, String url) {
        super(name, brand, skinType, "Green Tea", presentation, imagePath, productInfo, howToUse, benefits, price, url);
    }

    @Override
    public String giveTips(String skinType) {
        return switch (skinType) {
            case "All Skin Types" -> "Opt for a foam or gel formula with minimal ingredients. Green tea helps keep the skin stable regardless of condition or climate.";
            case "Oily Skin" -> "Green tea helps regulate sebum, so choose a foam-based green tea cleanser for a thorough cleanse without over-drying.";
            case "Sensitive Skin" -> "Look for a low-pH green tea cleanser without fragrance. Its anti-inflammatory properties can reduce irritation and redness with continued use.";
            default -> "Pair a cream-type green tea cleanser with a hydrating toner afterward. Green tea will cleanse and calm, while avoiding tightness.";
        };
    }

    @Override
    public String giveTips() {
        return """
                • Packed with antioxidants (like EGCG) — helps fight free radicals and reduce redness.
                • Naturally antibacterial and anti-inflammatory — ideal for keeping skin calm and clean.
                • Great for use in the morning or as a gentle second cleanse at night.
                • Massage into damp skin for 30–60 seconds to allow the calming compounds to work before rinsing.
                • Especially good in warmer seasons or after sun exposure.
                """;
    }
}
