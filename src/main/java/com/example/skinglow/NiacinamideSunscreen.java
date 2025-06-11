package com.example.skinglow;

public class NiacinamideSunscreen extends Sunscreen implements IGiveTips {
    public NiacinamideSunscreen(String name, String brand, String skinType, String presentation, String imagePath,
                                String productInfo, String howToUse, String benefits, float price, String url) {
        super(name, brand, skinType, "Niacinamide", presentation, imagePath, productInfo, howToUse, benefits, price, url);
    }

    @Override
    public String giveTips(String skinType) {
        return switch (skinType) {
            case "Normal Skin" -> "You can enjoy multi-tasking niacinamide sunscreens that brighten and protect without worrying about irritation. Great choice for simplified routines.";
            case "All Skin Types" -> "Look for lightweight, fragrance-free formulas around 4–5% niacinamide for universally safe and effective daily wear.";
            case "Oily Skin" -> "Niacinamide helps control sebum production, so go for gel-based, matte-finish sunscreens that leave no white cast and reduce shine throughout the day.";
            case "Sensitive Skin" -> "Choose low-percentage niacinamide formulas (around 2–3%) paired with calming ingredients like Centella or panthenol to avoid overstimulation.";
            default -> "Pick a cream-textured niacinamide sunscreen with added moisturizers like hyaluronic acid or ceramides. It’ll brighten while reinforcing your moisture barrier.";
        };
    }

    @Override
    public String giveTips() {
        return """
                - Niacinamide (Vitamin B3) is known for balancing oil, reducing redness, and strengthening the skin barrier.
                - Using it in a sunscreen helps calm inflammation, brighten skin tone, and improve uneven texture over time.
                - Great for those struggling with acne, dullness, or enlarged pores.
                - Works best when applied after moisturizer, and reapplied throughout the day if you're in the sun for long.
                """;
    }
}
