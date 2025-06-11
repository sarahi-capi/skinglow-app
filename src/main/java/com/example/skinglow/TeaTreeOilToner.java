package com.example.skinglow;

public class TeaTreeOilToner extends Toner implements IGiveTips {
    public TeaTreeOilToner(String name, String brand, String skinType, String presentation, String imagePath,
                           String productInfo, String howToUse, String benefits, float price, String url) {
        super(name, brand, skinType, "Tea Tree Oil", presentation, imagePath, productInfo, howToUse, benefits, price, url);
    }

    @Override
    public String giveTips(String skinType) {
        return switch (skinType) {
            case "Normal Skin" -> "Use it a few times a week to prevent occasional breakouts and maintain a clear complexion—don’t overdo it.";
            case "All Skin Types" -> "Choose a formula that’s diluted and balanced with soothing ingredients (like aloe or centella) to prevent dryness.";
            case "Oily Skin" -> "Apply with a cotton pad to help refine pores and control excess oil—especially helpful in T-zone areas.";
            case "Sensitive Skin" -> "Use only if the formula is labeled as gentle or alcohol-free; patch test first. Use 2–3x a week max to avoid irritation.";
            default -> "Look for versions with added hydrators (like glycerin or panthenol) and use sparingly—follow with a rich moisturizer.";
        };
    }

    @Override
    public String giveTips() {
        return """
                - Great for reducing redness, inflammation, and controlling oil.
                - Naturally antibacterial and antifungal — helps prevent acne breakouts.
                - Avoid contact with eyes and broken skin; use a patch test before regular use.
                - Don’t combine with strong exfoliants (like AHA/BHA) to avoid irritation.
                - Always follow with moisturizer to prevent over-drying.
                """;
    }
}
