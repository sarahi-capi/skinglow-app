package com.example.skinglow;

public class HyaluronicAcidSerum extends Serum implements IGiveTips {
    public HyaluronicAcidSerum(String name, String brand, String skinType, String presentation, String imagePath,
                               String productInfo, String howToUse, String benefits, float price, String url) {
        super(name, brand, skinType, "Hyaluronic Acid", presentation, imagePath, productInfo, howToUse, benefits, price, url);
    }

    @Override
    public String giveTips(String skinType) {
        return switch (skinType) {
            case "Normal Skin" -> "Use hyaluronic acid as a daily hydrating base, especially in dry seasons or air-conditioned environments. It helps maintain balance without overloading your skin.";
            case "All Skin Types" -> "Combine with glycerin or panthenol for a hydration boost that supports any routine. Works well layered under sunscreen in the morning.";
            case "Oily Skin" -> "Use it as a light moisturizer substitute in summer — it hydrates without adding greasiness or clogging pores. Look for gel-based formulas.";
            case "Sensitive Skin" -> "Opt for fragrance-free and low-molecular-weight formulas. Pair with ceramides or Centella asiatica to calm and hydrate simultaneously.";
            default -> "Use the “H.A. sandwich” method: mist your face, apply hyaluronic acid serum, then a thick moisturizer or sleeping mask. This locks hydration in overnight.";
        };
    }

    @Override
    public String giveTips() {
        return """
                - Always apply on damp skin (not dry!) — it helps pull moisture into the skin.
                - Follow with a moisturizer or occlusive to seal in hydration, or it may evaporate and dry you out.
                - Can be used morning and night, even with other actives like retinol or vitamin C.
                - Layer under other serums or creams — hyaluronic acid works well in combination routines.
                - Works best in humid environments; in dry air, be sure to lock it in with a cream or oil.
                """;
    }
}
