package com.example.skinglow;

public class TeaTreeOilCleanser extends Cleanser implements IGiveTips {

    public TeaTreeOilCleanser(String name, String brand, String skinType, String presentation, String imagePath,
                              String productInfo, String howToUse, String benefits, float price, String url) {
        super(name, brand, skinType, "Tea Tree Oil", presentation, imagePath, productInfo, howToUse, benefits, price, url);
    }

    @Override
    public String giveTips(String skinType) {
        return switch (skinType) {
            case "All Skin Types" -> "Opt for a balanced formula combined with hydrating ingredients (like glycerin or aloe) to avoid irritation. Works great 2–4x/week.";
            case "Oily Skin" -> "Use daily, especially in the evening. It helps manage excess oil, reduce breakouts, and prevent clogged pores.";
            case "Sensitive Skin" -> "Use only once or twice a week, and always follow with a calming toner or Centella moisturizer. Patch test first!";
            default -> "Avoid overuse—Tea Tree can worsen dryness. Use once weekly and follow with a ceramide-rich moisturizer.";
        };
    }

    @Override
    public String giveTips() {
        return """
                • Ideal for acne-prone skin — helps unclog pores and reduce bacteria without harsh chemicals.
                • Use lukewarm water to open pores before cleansing for better results.
                • Avoid using alongside other strong actives (like benzoyl peroxide) to reduce the risk of irritation.
                • Limit to 1–2 times a day to prevent over-cleansing or dryness.
                """;
    }
}
