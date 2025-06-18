package com.example.skinglow;

public class Serum extends SkincareProducts {
    public Serum(String name, String brand, String skinType, String mainComponents, String presentation, String imagePath,
                 String productInfo, String howToUse, String benefits, float price, String url) {
        super(name, brand, skinType, mainComponents, presentation, "Serum", imagePath, productInfo, howToUse, benefits, price, url);
    }

    @Override
    public String howToUse() {
        return """
           • Apply after toner, before moisturizer
           
            1. Dispense 1–2 drops of serum onto your fingertips
            2. Gently press or pat it into your face and neck
            3. Do not rub—let it absorb naturally

           • If layering serums: apply the thinnest one first, wait 30 seconds, then follow with thicker ones.
           """;
    }

    @Override
    public String whenToUse() {
        return """
            • Step: Step 3 in your skincare routine (after toner).
            • Purpose: Delivers concentrated active ingredients to target specific concerns (hydration, wrinkles, acne, etc.).
            • Frequency: Once or twice daily, depending on serum strength and skin type.
           """;
    }

    @Override
    public String morningRoutine() {
        return """
            Use a lightweight serum with antioxidants (like Vitamin C) to brighten and protect your skin from free radicals.
                • Pat gently onto clean, toned skin before moisturizer.
           """;
    }

    @Override
    public String nightRoutine() {
        return """
            Use a richer serum at night with repairing or hydrating ingredients (like hyaluronic acid, peptides, or retinol):

            1. Apply after toner
            2. Focus on areas with specific concerns
            3. Let it fully absorb before moisturizing

           • Retinol serums are best used at night and followed with sunscreen during the day.
           """;
    }
}
