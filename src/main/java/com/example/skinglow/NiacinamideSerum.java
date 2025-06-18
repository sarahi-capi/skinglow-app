package com.example.skinglow;

public class NiacinamideSerum extends Serum implements IGiveTips {
    public NiacinamideSerum(String name, String brand, String skinType, String presentation, String imagePath,
                            String productInfo, String howToUse, String benefits, float price, String url) {
        super(name, brand, skinType, "Niacinamide", presentation, imagePath, productInfo, howToUse, benefits, price, url);
    }

    @Override
    public String giveTips(String skinType) {
        return switch (skinType) {
            case "All Skin Types" -> "Choose a lightweight serum with ~5% niacinamide, and use it as a universal prep step before other actives. It helps reduce irritation and improves overall skin tone.";
            case "Oily Skin" -> "Niacinamide is your best friend for regulating sebum — consistent use can visibly reduce oiliness and the appearance of large pores without drying the skin.";
            case "Sensitive Skin" -> "Stick to low concentrations (2–3%) and pair with soothing ingredients like panthenol or Centella asiatica. It strengthens the skin barrier gradually without triggering redness.";
            default -> "Use niacinamide with ceramide-rich moisturizers to improve hydration retention and repair the barrier. It enhances the skin’s ability to hold onto moisture long-term.";
        };
    }

    @Override
    public String giveTips() {
        return """
                • Ideal daily serum (AM or PM) for balancing, brightening, and strengthening skin.
                • Start with 2–5% concentration; higher levels (10%+) can irritate sensitive skin.
                • Helps reduce excess oil, minimize pores, and improve skin texture.
                • Pairs well with zinc, hyaluronic acid, ceramides, and even retinol.
                • Apply after cleansing and before heavy creams or oils.
                """;
    }
}
