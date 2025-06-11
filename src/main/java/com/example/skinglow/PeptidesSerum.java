package com.example.skinglow;

public class PeptidesSerum extends Serum implements IGiveTips {
    public PeptidesSerum(String name, String brand, String skinType, String presentation, String imagePath,
                         String productInfo, String howToUse, String benefits, float price, String url) {
        super(name, brand, skinType, "Peptides", presentation, imagePath, productInfo, howToUse, benefits, price, url);
    }

    @Override
    public String giveTips(String skinType) {
        return switch (skinType) {
            case "Normal Skin" -> "Use peptides to maintain your skin’s firmness over time. It’s a great preventive step — you’ll thank yourself later!";
            case "All Skin Types" -> "Peptides are gentle and universally beneficial — apply on damp skin and seal with moisturizer for max absorption.";
            case "Oily Skin" -> "Look for a lightweight peptide serum (gel or water-based). Helps firm skin without clogging pores or adding shine.";
            case "Sensitive Skin" -> "Peptides are non-irritating and barrier-friendly — great for calming and rebuilding after flare-ups or using strong treatments.";
            default -> "Pair peptides with a rich moisturizer or ceramide cream. They help restore resilience and reduce rough texture over time.";
        };
    }

    @Override
    public String giveTips() {
        return """
                - Peptides help support collagen production, improve elasticity, and reduce fine lines — ideal for anti-aging routines.
                - Best applied after toner and before moisturizer, morning and/or night.
                - Combine with hydrating ingredients (like hyaluronic acid) for plump, bouncy skin.
                - Safe to layer with most actives, including retinol, vitamin C, and niacinamide.
                - Great for maintaining skin barrier health and soothing stressed skin.
                """;
    }
}