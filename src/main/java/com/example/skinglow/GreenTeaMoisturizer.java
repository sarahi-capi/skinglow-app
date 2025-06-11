package com.example.skinglow;

public class GreenTeaMoisturizer extends Moisturizer implements IGiveTips {
    public GreenTeaMoisturizer(String name, String brand, String skinType, String presentation, String imagePath,
                               String productInfo, String howToUse, String benefits, float price, String url) {
        super(name, brand, skinType, "Green Tea", presentation, imagePath, productInfo, howToUse, benefits, price, url);
    }

    @Override
    public String giveTips(String skinType) {
        return switch (skinType) {
            case "Normal Skin" -> "Use green tea moisturizer in the morning routine to keep your skin refreshed and protected throughout the day — it helps shield against environmental stress.";
            case "All Skin Types" -> "Look for fragrance-free formulas with minimal ingredients to ensure compatibility. Green tea supports skin balance and barrier health, no matter your skin type.";
            case "Oily Skin" -> "Choose a gel-based green tea moisturizer to help control oil while hydrating. Its natural astringent properties help tighten pores and reduce breakouts.";
            case "Sensitive Skin" -> "Apply it after sun exposure or over-exfoliation — green tea can reduce redness and soothe inflammation without irritating fragile skin.";
            default -> "Layer green tea moisturizer on top of a hydrating serum or toner. It won’t be occlusive alone but works great when paired with ceramides or facial oils.";
        };
    }

    @Override
    public String giveTips() {
        return """
                - Green tea (especially Camellia Sinensis extract) is rich in antioxidants, notably EGCG, which fights free radicals and reduces inflammation.
                - Helps to calm irritation, reduce sebum production, and improve skin texture over time.
                - Best used in both AM and PM routines, especially when your skin feels overheated, reactive, or stressed.
                - Often combined with centella, panthenol, or hyaluronic acid for soothing hydration.
                - Ideal as a lightweight moisturizer or gel-cream for daily use.
                """;
    }
}