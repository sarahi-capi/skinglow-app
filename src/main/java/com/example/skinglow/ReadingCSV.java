package com.example.skinglow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ReadingCSV {

    public List<SkincareProducts> loadProductsFromCSV(String filepath) {

        List<SkincareProducts> skincareProductsList = new ArrayList<>(); // To store the products

        // Opening the CSV file from resources path
        try (BufferedReader br = new BufferedReader(new InputStreamReader(Objects.requireNonNull(getClass().getResourceAsStream(filepath))))) {

            String line;
            boolean firstLine = true; // To skip the header row

            while ((line = br.readLine()) != null) { // Read each line of the CSV
                if (firstLine) {
                    firstLine = false; // Skip the first row (header)
                    continue;
                }

                String[] text = line.split(",", -1); // Split by comma
                if (text.length == 12) { // If we have 11 columns (name, brand, skinType, mainComponent, presentation, productType, imagePath, productInfo, howToUse, benefits, price, url)

                    // Depending on the product type and main component, create a SkincareProducts object
                    switch (text[5]) {
                        case "Cleanser" -> {
                            switch (text[4]) {
                                case "Green Tea" ->
                                        skincareProductsList.add(new GreenTeaCleanser(text[0], text[1], text[2], text[4], text[6], text[7], text[8], text[9], Float.parseFloat(text[10]), text[11]));
                                case "Salicylic Acid" ->
                                        skincareProductsList.add(new SalicylicAcidCleanser(text[0], text[1], text[2], text[4], text[6], text[7], text[8], text[9], Float.parseFloat(text[10]), text[11]));
                                case "Tea Tree Oil" ->
                                        skincareProductsList.add(new TeaTreeOilCleanser(text[0], text[1], text[2], text[4], text[6], text[7], text[8], text[9], Float.parseFloat(text[10]), text[11]));
                                case "Centella Asiatica" ->
                                        skincareProductsList.add(new CentellaAsiaticaCleanser(text[0], text[1], text[2], text[4], text[6], text[7], text[8], text[9], Float.parseFloat(text[10]), text[11]));
                                default ->
                                        skincareProductsList.add(new RiceWaterCleanser(text[0], text[1], text[2], text[4], text[6], text[7], text[8], text[9], Float.parseFloat(text[10]), text[11]));
                            }
                        }
                        case "Toner" -> {
                            switch (text[4]) {
                                case "Centella Asiatica" ->
                                        skincareProductsList.add(new CentellaAsiaticaToner(text[0], text[1], text[2], text[4], text[6], text[7], text[8], text[9], Float.parseFloat(text[10]), text[11]));
                                case "Rice Water" ->
                                        skincareProductsList.add(new RiceWaterToner(text[0], text[1], text[2], text[4], text[6], text[7], text[8], text[9], Float.parseFloat(text[10]), text[11]));
                                case "Niacinamide" ->
                                        skincareProductsList.add(new NiacinamideToner(text[0], text[1], text[2], text[4], text[6], text[7], text[8], text[9], Float.parseFloat(text[10]), text[11]));
                                default ->
                                        skincareProductsList.add(new TeaTreeOilToner(text[0], text[1], text[2], text[4], text[6], text[7], text[8], text[9], Float.parseFloat(text[10]), text[11]));
                            }
                        }
                        case "Serum" -> {
                            switch (text[4]) {
                                case "Vitamin C" ->
                                        skincareProductsList.add(new VitaminCSerum(text[0], text[1], text[2], text[4], text[6], text[7], text[8], text[9], Float.parseFloat(text[10]), text[11]));
                                case "Retinol" ->
                                        skincareProductsList.add(new RetinolSerum(text[0], text[1], text[2], text[4], text[6], text[7], text[8], text[9], Float.parseFloat(text[10]), text[11]));
                                case "Hyaluronic Acid" ->
                                        skincareProductsList.add(new HyaluronicAcidSerum(text[0], text[1], text[2], text[4], text[6], text[7], text[8], text[9], Float.parseFloat(text[10]), text[11]));
                                case "Niacinamide" ->
                                        skincareProductsList.add(new NiacinamideSerum(text[0], text[1], text[2], text[4], text[6], text[7], text[8], text[9], Float.parseFloat(text[10]), text[11]));
                                case "Tea Tree" ->
                                        skincareProductsList.add(new TeaTreeSerum(text[0], text[1], text[2], text[4], text[6], text[7], text[8], text[9], Float.parseFloat(text[10]), text[11]));
                                default ->
                                        skincareProductsList.add(new PeptidesSerum(text[0], text[1], text[2], text[4], text[6], text[7], text[8], text[9], Float.parseFloat(text[10]), text[11]));
                            }
                        }
                        case "Moisturizer" -> {
                            switch (text[4]) {
                                case "Ceramide" ->
                                        skincareProductsList.add(new CeramideMoisturizer(text[0], text[1], text[2], text[4], text[6], text[7], text[8], text[9], Float.parseFloat(text[10]), text[11]));
                                case "Green Tea" ->
                                        skincareProductsList.add(new GreenTeaMoisturizer(text[0], text[1], text[2], text[4], text[6], text[7], text[8], text[9], Float.parseFloat(text[10]), text[11]));
                                case "Propolis" ->
                                        skincareProductsList.add(new PropolisMoisturizer(text[0], text[1], text[2], text[4], text[6], text[7], text[8], text[9], Float.parseFloat(text[10]), text[11]));
                                case "Centella Asiatica" ->
                                        skincareProductsList.add(new CentellaAsiaticaMoisturizer(text[0], text[1], text[2], text[4], text[6], text[7], text[8], text[9], Float.parseFloat(text[10]), text[11]));
                                default ->
                                        skincareProductsList.add(new SnailMucinMoisturizer(text[0], text[1], text[2], text[4], text[6], text[7], text[8], text[9], Float.parseFloat(text[10]), text[11]));
                            }
                        }
                        case "Sunscreen" -> {
                            switch (text[4]) {
                                case "Mineral" ->
                                        skincareProductsList.add(new MineralSunscreen(text[0], text[1], text[2], text[4], text[6], text[7], text[8], text[9], Float.parseFloat(text[10]), text[11]));
                                case "Chemical" ->
                                        skincareProductsList.add(new ChemicalSunscreen(text[0], text[1], text[2], text[4], text[6], text[7], text[8], text[9], Float.parseFloat(text[10]), text[11]));
                                case "Centella" ->
                                        skincareProductsList.add(new CentellaSunscreen(text[0], text[1], text[2], text[4], text[6], text[7], text[8], text[9], Float.parseFloat(text[10]), text[11]));
                                default ->
                                        skincareProductsList.add(new NiacinamideSunscreen(text[0], text[1], text[2], text[4], text[6], text[7], text[8], text[9], Float.parseFloat(text[10]), text[11]));
                            }
                        }
                    }
                }
            }

        } catch (IOException e) {
            // If something goes wrong (file not found, etc.)
            throw new RuntimeException(e);
        }

        return skincareProductsList;
    }

}
