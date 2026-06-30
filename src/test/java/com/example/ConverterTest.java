package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class ConverterTest {

    @Test
    public void testMilesToKm() {
        assertEquals(1.60934, Converter.milesToKm(1), 0.0001);
    }

    @Test
    public void testKmToMiles() {
        assertEquals(1.0, Converter.kmToMiles(1.60934), 0.0001);
    }

    @Test
    public void testCelsiusToFahrenheit() {
        assertEquals(212.0, Converter.celsiusToFahrenheit(100), 0.0001);
    }

    @Test
    public void testFahrenheitToCelsius() {
        assertEquals(100.0, Converter.fahrenheitToCelsius(212), 0.0001);
    }
}