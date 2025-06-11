package com.example.skinglow;

public class CentellaAsiaticaCleanser extends Cleanser implements IGiveTips {

    public CentellaAsiaticaCleanser(String name, String brand, String skinType, String presentation, String imagePath,
                                    String productInfo, String howToUse, String benefits, float price, String url) {
        super(name, brand, skinType, "Centella Asiatica", presentation, imagePath, productInfo, howToUse, benefits, price, url);
    }

    @Override
    public String giveTips(String skinType) {
        return switch (skinType) {
            case "Normal Skin" -> "Use as a gentle daily cleanser to maintain skin balance and keep the barrier strong. Excellent for transitional weather.";
            case "All Skin Types" -> "Safe for twice-daily use, especially after exfoliation or retinol treatments when the skin is more vulnerable.";
            case "Oily Skin" -> "Great after acne treatments or breakouts—soothes inflammation without adding oil or clogging pores. Use especially at night.";
            case "Sensitive Skin" -> "Use as your go-to daily cleanser. It calms redness and helps prevent flare-ups. Look for added ingredients like panthenol or madecassoside for extra soothing.";
            default -> "Use as a hydrating morning cleanser or in a double cleanse as the second step. Supports moisture retention and relieves tightness.";
        };
    }

    @Override
    public String giveTips() {
        return """
                - A gentle, soothing option that cleanses without stripping the skin’s natural moisture.
                - Rich in anti-inflammatory compounds that help calm redness and irritation.
                - Ideal for use after activities that stress the skin (e.g. sun exposure, shaving, or exfoliating).
                - Massage onto damp skin using soft, circular motions, then rinse with lukewarm water.
                - Great for maintaining a healthy skin barrier during breakouts or seasonal sensitivity.
                """;
    }
}
