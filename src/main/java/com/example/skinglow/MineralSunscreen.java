package com.example.skinglow;

public class MineralSunscreen extends Sunscreen implements IGiveTips {
    public MineralSunscreen(String name, String brand, String skinType, String presentation, String imagePath,
                            String productInfo, String howToUse, String benefits, float price, String url) {
        super(name, brand, skinType, "Mineral", presentation, imagePath, productInfo, howToUse, benefits, price, url);
    }

    @Override
    public String giveTips(String skinType) {
        return switch (skinType) {
            case "Normal Skin" -> "You can layer mineral sunscreen over a light moisturizer or serum with antioxidants (like Vitamin C) for added protection and glow throughout the day.";
            case "All Skin Types" -> "Use mineral sunscreen as your makeup primer — it often leaves a smooth, matte base that grips foundation and minimizes shine or texture.";
            case "Oily Skin" -> "Look for matte or oil-control mineral sunscreens. These can double as a mattifier, helping reduce shine during the day without clogging pores.";
            case "Sensitive Skin" -> "Avoid chemical filters and go purely mineral (zinc oxide-based). Choose fragrance-free, alcohol-free formulas with added calming agents like Centella or allantoin.";
            default -> "Pick a cream-based mineral sunscreen with emollients like squalane or ceramides to keep skin moisturized while protecting from UV rays. Apply over a hydrating serum.";
        };
    }

    @Override
    public String giveTips() {
        return """
                - Mineral sunscreens (also called physical sunscreens) use zinc oxide and/or titanium dioxide to reflect UV rays.
                - They provide broad-spectrum protection and are effective immediately after application — no need to wait.
                - Ideal for sensitive, acne-prone, or reactive skin because they are non-comedogenic and less irritating than some chemical filters.
                - Reapply every 2 hours, especially after sweating or swimming.
                - To prevent a white cast, look for tinted versions or those labeled "sheer" or "nano-particle."
                """;
    }
}