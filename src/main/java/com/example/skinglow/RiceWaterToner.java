package com.example.skinglow;

public class RiceWaterToner extends Toner implements IGiveTips {
    public RiceWaterToner(String name, String brand, String skinType, String presentation, String imagePath,
                          String productInfo, String howToUse, String benefits, float price, String url) {
        super(name, brand, skinType, "Rice Water", presentation, imagePath, productInfo, howToUse, benefits, price, url);
    }

    @Override
    public String giveTips(String skinType) {
        return switch (skinType) {
            case "Normal Skin" -> "Rice water helps maintain balance and glow—use it before makeup for smoother application and a natural radiance.";
            case "All Skin Types" -> "This toner is a great “starter brightening” product—gentle enough to use daily, even alongside actives like niacinamide or peptides.";
            case "Oily Skin" -> "Use rice water toner to refine texture and control excess shine. It subtly tightens pores and doesn’t leave a greasy finish.";
            case "Sensitive Skin" -> "Opt for a fragrance-free, alcohol-free formula. Rice water soothes inflammation and supports barrier recovery without irritation.";
            default -> "Layer the toner 2–3 times (“toner sandwich” method) to boost hydration. Follow with a richer essence or serum for best results.";
        };
    }

    @Override
    public String giveTips() {
        return """
                - Naturally brightens and softens skin — helps fade dark spots and even out tone.
                - Rich in amino acids, antioxidants, and vitamins — supports overall skin barrier health.
                - Great for daily use, morning and night.
                - Pat gently into skin with hands or apply using a cotton pad for a refreshing finish.
                - Pairs well with niacinamide or hyaluronic acid for added glow and hydration.
                """;
    }
}
