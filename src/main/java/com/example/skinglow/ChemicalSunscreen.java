package com.example.skinglow;

public class ChemicalSunscreen extends Sunscreen implements IGiveTips {
    public ChemicalSunscreen(String name, String brand, String skinType, String presentation, String imagePath,
                             String productInfo, String howToUse, String benefits, float price, String url) {
        super(name, brand, skinType, "Chemical", presentation, imagePath, productInfo, howToUse, benefits, price, url);
    }

    @Override
    public String giveTips(String skinType) {
        return switch (skinType) {
            case "All Skin Types" -> "Choose sunscreens with added skincare benefits like niacinamide, hyaluronic acid, or antioxidants to boost hydration and barrier support throughout the day.";
            case "Oily Skin" -> "Go for gel-based or fluid chemical sunscreens labeled “oil-free” or “matte finish.” They absorb quickly, control shine, and won’t clog pores.";
            case "Sensitive Skin" -> "Pick low-irritant formulas — avoid avobenzone or oxybenzone. Look for dermatologist-tested, fragrance-free sunscreens with filters like Tinosorb or Mexoryl, which are gentler.";
            default -> "Use creamy chemical sunscreens with emollients like glycerin or squalane. They double as moisturizers and help seal in hydration under makeup or alone.";
        };
    }

    @Override
    public String giveTips() {
        return """
                • Chemical sunscreens absorb UV rays and convert them into heat to protect the skin.
                • They’re lightweight, often invisible on the skin, and blend easily without leaving a white cast.
                • Must be applied 20–30 minutes before sun exposure to become effective.
                • Great for sports, swimming, or under makeup due to better water and sweat resistance.
                • Look for broad-spectrum protection (UVA + UVB) with SPF 30 or higher.
                """;
    }
}