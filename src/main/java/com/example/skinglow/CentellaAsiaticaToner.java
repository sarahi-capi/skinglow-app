package com.example.skinglow;

public class CentellaAsiaticaToner extends Toner implements IGiveTips {

    public CentellaAsiaticaToner(String name, String brand, String skinType, String presentation, String imagePath,
                                 String productInfo, String howToUse, String benefits, float price, String url) {
        super(name, brand, skinType, "Centella Asiatica", presentation, imagePath, productInfo, howToUse, benefits, price, url);
    }

    @Override
    public String giveTips(String skinType) {
        return switch (skinType) {
            case "All Skin Types" -> "This toner is a safe choice year-round, especially if you frequently switch products. It stabilizes your barrier without interfering with your actives.";
            case "Oily Skin" -> "Look for a lightweight, water-based Centella toner—especially those combined with ingredients like niacinamide or green tea to also help control sebum.";
            case "Sensitive Skin" -> "Centella is one of the best toners for calming sensitivity. Use it as a soothing layer morning and night, especially before applying actives like retinol or vitamin C.";
            default -> "Go for a Centella toner that’s enriched with hyaluronic acid or panthenol. You can layer it (the “toner sandwich” method) to increase hydration without clogging.";
        };
    }

    @Override
    public String giveTips() {
        return """
                • Also known as Cica, it’s rich in compounds like asiaticoside that calm and repair the skin barrier.
                • Excellent for reducing redness, irritation, and post-acne marks.
                • Ideal after exfoliating or when your skin feels inflamed or tight.
                • Use with hands instead of cotton pads to avoid friction and maximize absorption.
                • Layer 1–2 times if your skin needs extra hydration or comfort.
                """;
    }
}
