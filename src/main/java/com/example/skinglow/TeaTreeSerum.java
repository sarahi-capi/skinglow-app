package com.example.skinglow;

public class TeaTreeSerum extends Serum implements IGiveTips {
    public TeaTreeSerum(String name, String brand, String skinType, String presentation, String imagePath,
                        String productInfo, String howToUse, String benefits, float price, String url) {
        super(name, brand, skinType, "Tea Tree", presentation, imagePath, productInfo, howToUse, benefits, price, url);
    }

    @Override
    public String giveTips(String skinType) {
        return switch (skinType) {
            case "All Skin Types" -> "Go for a gentle formulation with tea tree + calming ingredients (like aloe or chamomile) to enjoy benefits without triggering dryness.";
            case "Oily Skin" -> "Perfect daily serum — helps control sebum, reduce shine, and prevent breakouts. Apply a thin layer on the T-zone or oily areas.";
            case "Sensitive Skin" -> "Dilute with a hydrating serum or use every other night. Opt for products that pair tea tree with soothing actives like Centella or allantoin.";
            default -> "Follow with a rich moisturizer or facial oil to prevent tightness. Tea tree helps with inflammation, but can dry out already parched skin if not buffered.";
        };
    }

    @Override
    public String giveTips() {
        return """
                • Known for its antibacterial and anti-inflammatory properties — great for acne-prone or congested skin.
                • Apply after cleansing and toner, before heavier serums or creams.
                • Avoid layering with strong exfoliants (like AHA/BHA) unless your skin tolerates it well — it can be too drying.
                • Use at night if possible, especially if using alongside other actives.
                • Patch test first — tea tree can be intense for some skin types.
                """;
    }
}

