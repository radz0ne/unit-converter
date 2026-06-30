package com.example;

public class App {
    public static void main(String[] args) {
        System.out.println("10 miles = " + Converter.milesToKm(10) + " km");
        System.out.println("100 km = " + Converter.kmToMiles(100) + " miles");
        System.out.println("100°C = " + Converter.celsiusToFahrenheit(100) + "°F");
        System.out.println("212°F = " + Converter.fahrenheitToCelsius(212) + "°C");
    }
}