package com.example.skinglow;

public class RetinolSerum extends Serum implements IGiveTips {
    public RetinolSerum(String name, String brand, String skinType, String presentation, String imagePath,
                        String productInfo, String howToUse, String benefits, float price, String url) {
        super(name, brand, skinType, "Retinol", presentation, imagePath, productInfo, howToUse, benefits, price, url);
    }

    @Override
    public String giveTips(String skinType) {
        return switch (skinType) {
            case "Normal Skin" -> "You can gradually increase to every other night use. Combine with niacinamide or ceramide-rich moisturizers to keep your barrier healthy and boost results.";
            case "All Skin Types" -> "Introduce “retinol sandwiching”: apply a light moisturizer, then retinol, then another layer of moisturizer. This cushions your skin and reduces irritation.";
            case "Oily Skin" -> "Retinol can help regulate oil production and reduce breakouts. Use a lightweight, oil-free retinol serum, and avoid combining with other strong actives like AHAs at first.";
            case "Sensitive Skin" -> "Use encapsulated retinol or bakuchiol (a plant-based alternative) to reduce risk of irritation. Start with once a week, and always moisturize generously.";
            default -> "Mix retinol with a hydrating serum (like hyaluronic acid) or apply it after moisturizer to buffer its strength. Avoid exfoliating products on nights when you use retinol.";
        };
    }

    @Override
    public String giveTips() {
        return """
                - Use at night only, after cleansing and before moisturizing.
                - Start with low concentration (e.g., 0.25% or 0.3%) and apply 2–3 times a week, gradually increasing frequency as skin builds tolerance.
                - Apply a pea-sized amount to the entire face — avoid the eye area unless using a retinol formulated for that zone.
                - Always apply moisturizer after to reduce dryness and irritation.
                - Use sunscreen daily — retinol increases sun sensitivity.
                - Expect some mild dryness, flaking, or purging in the beginning — this is temporary.
                """;
    }
}
