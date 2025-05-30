package com.example.skinglow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ReadingProducts {

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

                String[] fields = line.split(",", -1); // Split by comma
                if (fields.length == 7) { // If we have 6 columns (name, brand, skinType. mainComponent, presentation, productType, imagePath)

                    if (fields[5].equals("Cleanser")) {
                        switch (fields[4]) {
                            case "Green Tea" ->
                                    skincareProductsList.add(new GreenTeaCleanser(fields[0], fields[1], fields[2], fields[4], fields[6]));
                            case "Salicylic Acid" ->
                                    skincareProductsList.add(new SalicylicAcidCleanser(fields[0], fields[1], fields[2], fields[4], fields[6]));
                            case "Tea Tree" ->
                                    skincareProductsList.add(new TeaTreeOilCleanser(fields[0], fields[1], fields[2], fields[4], fields[6]));
                            case "Centella Asiatica" ->
                                    skincareProductsList.add(new CentellaAsiaticaCleanser(fields[0], fields[1], fields[2], fields[4], fields[6]));
                            default ->
                                    skincareProductsList.add(new RiceWaterCleanser(fields[0], fields[1], fields[2], fields[4], fields[6]));
                        }
                    }

                }
            }

        } catch (IOException e) {
            // If something goes wrong (file not found, etc.)
            e.printStackTrace(); // Print error in console
        }

        return skincareProductsList;
    }

}
