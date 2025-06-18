package com.example.skinglow;

public class SnailMucinMoisturizer extends Moisturizer implements IGiveTips {
    public SnailMucinMoisturizer(String name, String brand, String skinType, String presentation, String imagePath,
                                 String productInfo, String howToUse, String benefits, float price, String url) {
        super(name, brand, skinType, "Snail Mucin", presentation, imagePath, productInfo, howToUse, benefits, price, url);
    }

    @Override
    public String giveTips(String skinType) {
        return switch (skinType) {
            case "All Skin Types" -> "Use it as your final moisturizing step at night to seal in all previous layers. Wake up with smoother, more supple skin — great for dull or tired complexions.";
            case "Oily Skin" -> "Snail mucin balances hydration without heaviness. Pick a gel-based snail cream to reduce oiliness while calming acne or post-breakout redness.";
            case "Sensitive Skin" -> "Snail mucin is naturally anti-inflammatory. It can soothe irritated or over-exfoliated skin, making it ideal during barrier recovery periods or after actives like AHA/BHA.";
            default -> "Layer it under a thick occlusive moisturizer or facial oil to trap hydration. Its humectant properties help keep moisture locked in all day.";
        };
    }

    @Override
    public String giveTips() {
        return """
                • Snail mucin is rich in glycoproteins, hyaluronic acid, zinc, and allantoin — making it excellent for hydration, repair, and elasticity.
                • Helps fade acne scars, calm irritation, and boost skin regeneration.
                • Use after your serum, especially at night, for deep moisture and skin recovery.
                • It’s best applied on slightly damp skin to enhance absorption and plumpness.
                • Compatible with most actives, and especially great in soothing or barrier-repair routines.
                """;
    }
}
