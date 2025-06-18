package com.example.skinglow;

public class NiacinamideToner extends Toner implements IGiveTips {
    public NiacinamideToner(String name, String brand, String skinType, String presentation, String imagePath,
                            String productInfo, String howToUse, String benefits, float price, String url) {
        super(name, brand, skinType, "Niacinamide", presentation, imagePath, productInfo, howToUse, benefits, price, url);
    }

    @Override
    public String giveTips(String skinType) {
        return switch (skinType) {
            case "All Skin Types" -> "This toner is a great “starter brightening” product—gentle enough to use daily, even alongside actives like niacinamide or peptides.";
            case "Oily Skin" -> "Use rice water toner to refine texture and control excess shine. It subtly tightens pores and doesn’t leave a greasy finish.";
            case "Sensitive Skin" -> "Opt for a fragrance-free, alcohol-free formula. Rice water soothes inflammation and supports barrier recovery without irritation.";
            default -> "Layer the toner 2–3 times (“toner sandwich” method) to boost hydration. Follow with a richer essence or serum for best results.";
        };
    }

    @Override
    public String giveTips() {
        return """
                • Helps regulate oil production, minimize pores, and fade dark spots over time.
                • Strengthens the skin barrier — making it great for calming redness and boosting hydration.
                • Works well both morning and night; use after cleansing and before serums or moisturizers.
                • Avoid combining with pure Vitamin C (ascorbic acid) in the same step to reduce potential irritation.
                • Consistent use improves skin texture and overall tone.
                """;
    }
}
