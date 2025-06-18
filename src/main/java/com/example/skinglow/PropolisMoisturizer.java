package com.example.skinglow;

public class PropolisMoisturizer extends Moisturizer implements IGiveTips {
    public PropolisMoisturizer(String name, String brand, String skinType, String presentation, String imagePath,
                               String productInfo, String howToUse, String benefits, float price, String url) {
        super(name, brand, skinType, "Green Tea", presentation, imagePath, productInfo, howToUse, benefits, price, url);
    }

    @Override
    public String giveTips(String skinType) {
        return switch (skinType) {
            case "All Skin Types" -> "A lightweight propolis gel-cream can hydrate, calm, and nourish your skin without interfering with any other products — a universal multitasker.";
            case "Oily Skin" -> "Choose a non-comedogenic formula — propolis helps reduce acne-causing inflammation while still moisturizing lightly and keeping sebum balanced.";
            case "Sensitive Skin" -> "Propolis is calming and barrier-repairing, but do a patch test first to check for bee-product sensitivity. Look for alcohol-free and fragrance-free formulas.";
            default -> "Layer your propolis moisturizer over a hydrating toner or serum. The propolis will seal in moisture and promote healing, especially during cold or dry seasons.";
        };
    }

    @Override
    public String giveTips() {
        return """
                • Propolis is a resin-like substance made by bees, rich in antioxidants, flavonoids, and healing enzymes.
                • It’s known for its soothing, anti-inflammatory, and regenerative effects — ideal for stressed or compromised skin.
                • Best used after serums and before sunscreen (AM) or as the final step (PM).
                • Great for reinforcing the skin barrier and boosting skin glow without clogging pores.
                • Often paired with honey, royal jelly, or niacinamide for enhanced benefits.
                """;
    }
}