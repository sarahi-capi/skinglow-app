package com.example.skinglow;

public class HyaluronicAcidToner extends Toner implements IGiveTips {

    public HyaluronicAcidToner(String name, String brand, String skinType, String presentation, String imagePath,
                                 String productInfo, String howToUse, String benefits, float price, String url) {
        super(name, brand, skinType, "Hyaluronic Acid", presentation, imagePath, productInfo, howToUse, benefits, price, url);
    }

    @Override
    public String giveTips(String skinType) {
        return switch (skinType) {
            case "All Skin Types" -> "Use it as your base hydration step before actives or creams. It works universally well and enhances the absorption of everything layered on top.";
            case "Oily Skin" -> "Choose a light, watery HA toner that hydrates without heaviness. Apply a thin layer only—too much can feel sticky or suffocating.";
            case "Sensitive Skin" -> "Hyaluronic Acid is gentle and non-irritating. Apply to damp skin and follow with a soothing moisturizer to lock in hydration and avoid transepidermal water loss.";
            default -> "Pick a multi-weight HA toner (low and high molecular weights) for deep and surface hydration. Gently pat in a few layers if your skin feels dry or tight.";
        };
    }

    @Override
    public String giveTips() {
        return """
            • Hyaluronic Acid attracts and holds moisture—apply to damp skin to maximize this effect.
            • Multi-weight formulations hydrate both deep layers and the skin’s surface.
            • Avoid applying it to dry skin alone, as it may pull moisture from within and cause dryness.
            • Great layering toner: works well under serums, moisturizers, and sunscreens.
            • Especially helpful in dry climates or after exfoliation to prevent tightness.
            """;
    }

}
