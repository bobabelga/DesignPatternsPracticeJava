package com.bobabelga.DecoratorDesignPattern;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Chicken(new Cheese(new BasicPizza()));
        System.out.println(pizza.getDescription());
        System.out.println("Price : "+ (int) pizza.getPrice() + " $");
    }
}
