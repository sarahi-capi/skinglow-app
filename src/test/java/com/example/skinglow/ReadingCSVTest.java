package com.example.skinglow;

import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

// This class will test the ReadingCSV class by taking an instance of the products.csv file
// and checking if it correctly loads and creates SKincareProducts objects
public class ReadingCSVTest {

    @Test
    void testLoadProductsFromCSV() {
        ReadingCSV readTest = new ReadingCSV(); // We create a ReadingCSV object
        List<SkincareProducts> products = readTest.loadProductsFromCSV("/test_products.csv"); // This is the instance file

        // This will check if the list of products is not empty, if it's empty, a message will be displayed
        assertFalse(products.isEmpty(), "The list should not be empty");

        // Then, we take the first element of the list
        SkincareProducts product = products.getFirst();

        // Then, we will check two attributes of the object to be sure it is loading correctly.
        assertEquals("Green Tea Fresh Cleanser", product.getName());
        assertEquals("Isntree", product.getBrand());
    }
}
