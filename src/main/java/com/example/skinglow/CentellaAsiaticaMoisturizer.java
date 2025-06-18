package com.example.skinglow;

public class CentellaAsiaticaMoisturizer extends Moisturizer implements IGiveTips {
    public CentellaAsiaticaMoisturizer(String name, String brand, String skinType, String presentation, String imagePath,
                                       String productInfo, String howToUse, String benefits, float price, String url) {
        super(name, brand, skinType, "Centella Asiatica", presentation, imagePath, productInfo, howToUse, benefits, price, url);
    }

    @Override
    public String giveTips(String skinType) {
        return switch (skinType) {
            case "All Skin Types" -> "Apply a thin layer after serum to lock in hydration and reduce micro-irritation. Works well with most active ingredients and reduces overall skin stress.";
            case "Oily Skin" -> "Choose a lightweight gel-cream formula with Centella — it calms acne-prone skin, minimizes redness, and helps prevent moisture loss without clogging pores.";
            case "Sensitive Skin" -> "Use it immediately after cleansing while your skin is slightly damp. Centella is excellent for reducing stinging and burning, especially after over-washing or exposure to wind or cold.";
            default -> "Layer Centella moisturizer under a richer cream or facial oil. It helps repair the moisture barrier while reducing flakiness and soothing tightness or itchiness.";
        };
    }

    @Override
    public String giveTips() {
        return """
                • Centella Asiatica (also called Cica) is a soothing botanical that helps calm inflammation, strengthen the skin barrier, and promote healing.
                • It contains active compounds like asiaticoside, madecassoside, and asiatic acid, which help repair irritated or compromised skin.
                • Best used twice daily — especially after sun exposure, exfoliation, or when skin feels reactive.
                • Pairs well with niacinamide, ceramides, or panthenol for a barrier-repair routine.
                • Ideal for post-acne care, rosacea-prone skin, or any time your skin feels “angry.”
                """;
    }
}
