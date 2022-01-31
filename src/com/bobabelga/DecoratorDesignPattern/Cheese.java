package com.bobabelga.DecoratorDesignPattern;

public class Cheese extends PizzaDecorator {
    public Cheese(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 5;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Cheese";
    }
}
