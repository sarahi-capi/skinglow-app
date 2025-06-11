package com.example.skinglow;

public class SalicylicAcidCleanser extends Cleanser implements IGiveTips {

    public SalicylicAcidCleanser(String name, String brand, String skinType, String presentation, String imagePath,
                                 String productInfo, String howToUse, String benefits, float price, String url) {
        super(name, brand, skinType, "Salicylic Acid", presentation, imagePath, productInfo, howToUse, benefits, price, url);
    }

    @Override
    public String giveTips(String skinType) {
        return switch (skinType) {
            case "Normal Skin" -> "Use 2–3 times per week at night to prevent breakouts and keep pores clear. Follow with a hydrating product.";
            case "All Skin Types" -> "Choose a low-concentration (0.5%–1%) formula. It offers gentle exfoliation without irritation, suitable for universal use.";
            case "Oily Skin" -> "You can use it daily (preferably at night). It helps control oil, reduce shine, and treat active acne over time.";
            case "Sensitive Skin" -> "Use only once a week to start. Look for a buffered, fragrance-free formula or one combined with calming ingredients like green tea or Centella.";
            default -> "Avoid overuse—limit to once or twice weekly. Follow with a rich moisturizer to avoid disrupting the skin barrier.";
        };
    }

    @Override
    public String giveTips() {
        return """
                - Penetrates deep into pores to dissolve excess oil and unclog dead skin — great for preventing breakouts.
                - Start using it 2–3 times a week, especially if you're new to BHA (beta hydroxy acid).
                - Avoid using it with other exfoliants (like retinol or AHAs) in the same routine to prevent over-exfoliation.
                - Always follow with moisturizer to maintain skin hydration.
                - Use sunscreen daily — salicylic acid can increase sun sensitivity.
                """;
    }
}
