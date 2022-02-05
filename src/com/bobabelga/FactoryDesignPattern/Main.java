package com.bobabelga.FactoryDesignPattern;

public class Main {
    public static void main(String[] args) {
        // Prepare Sandwich from Class SandwichFactory
        Sandwich sandwich = SandwichFactory.createSandwich(SandwichFactory.CHEESEBURGER);
        sandwich.prepare();
    }
}
