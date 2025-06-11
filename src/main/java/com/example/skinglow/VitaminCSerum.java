package com.example.skinglow;

public class VitaminCSerum extends Serum implements IGiveTips {
    public VitaminCSerum(String name, String brand, String skinType, String presentation, String imagePath,
                         String productInfo, String howToUse, String benefits, float price, String url) {
        super(name, brand, skinType, "Vitamine C", presentation, imagePath, productInfo, howToUse, benefits, price, url);
    }

    @Override
    public String giveTips(String skinType) {
        return switch (skinType) {
            case "Normal Skin" -> "You can use Vitamin C serum daily in the morning. It helps maintain an even tone and enhances glow. Pair it with niacinamide at night for a balanced, brightening routine.";
            case "All Skin Types" -> "Start with a low concentration (5–10%), especially if you’re new to active ingredients. Gradually increase to 15–20% if your skin tolerates it well.";
            case "Oily Skin" -> "Choose a water-based or gel-type Vitamin C serum with light texture. It helps reduce excess sebum, fade acne scars, and minimize pores without clogging them.";
            case "Sensitive Skin" -> "Use a derivative form like Magnesium Ascorbyl Phosphate or Ascorbyl Glucoside — they’re gentler. Apply every other morning at first and patch test to avoid irritation.";
            default -> "Look for Vitamin C serums that include hydrating ingredients like hyaluronic acid or squalane. Follow immediately with a rich moisturizer to lock in the serum and prevent dryness.";
        };
    }

    @Override
    public String giveTips() {
        return """
                - Best used in the morning, right after cleansing and before moisturizer and sunscreen.
                - Look for stable forms like Ascorbic Acid or Sodium Ascorbyl Phosphate (for sensitive skin).
                - Apply 2–4 drops to clean, dry skin and gently pat until absorbed.
                - Store in a cool, dark place or a fridge to prevent oxidation (serum turning brown = less effective).
                - Always follow with broad-spectrum SPF — Vitamin C boosts sun protection but can make skin more sensitive to UV if unprotected.
                """;
    }
}
