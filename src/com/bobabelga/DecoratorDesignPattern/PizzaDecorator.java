package com.bobabelga.DecoratorDesignPattern;

public class PizzaDecorator implements Pizza{
    Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public double getPrice() {
        return pizza.getPrice();
    }

    @Override
    public String getDescription() {
        return pizza.getDescription();
    }
}
