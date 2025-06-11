package com.example.skinglow;

public class CentellaSunscreen extends Sunscreen implements IGiveTips {
    public CentellaSunscreen(String name, String brand, String skinType, String presentation, String imagePath,
                             String productInfo, String howToUse, String benefits, float price, String url) {
        super(name, brand, skinType, "Centella", presentation, imagePath, productInfo, howToUse, benefits, price, url);
    }

    @Override
    public String giveTips(String skinType) {
        return switch (skinType) {
            case "Normal Skin" -> "You can use lightweight Centella sunscreens with either a creamy or gel texture. You’ll benefit from both UV protection and Centella’s natural barrier support — ideal for maintaining balanced skin.";
            case "All Skin Types" -> "Opt for a multi-functional sunscreen that also hydrates and soothes — Centella + niacinamide or Centella + hyaluronic acid combinations are excellent choices for universal care.";
            case "Oily Skin" -> "Choose a gel-type Centella sunscreen with a matte finish. It’ll calm inflammation without clogging pores or making your skin greasy during the day.";
            case "Sensitive Skin" -> "This is where Centella shines! Look for mineral or hybrid formulas with Centella as the hero — avoid alcohols and added fragrance for maximum gentleness and redness reduction.";
            default -> "Go for a cream-based Centella sunscreen enriched with ceramides or squalane. It will provide deep moisture, calm flaky skin, and reduce tightness caused by UV exposure.";
        };
    }

    @Override
    public String giveTips() {
        return """
                - Centella (also known as Cica) is known for its soothing, anti-inflammatory, and skin-repairing properties.
                - Perfect for calming irritation while protecting your skin from UV damage.
                - Great for anyone dealing with redness, acne-prone, or stressed skin.
                - Ideal for daily use, especially in sunny or pollution-heavy environments.
                - Often found in hybrid or chemical sunscreens with added skincare benefits.
                """;
    }
}
