package com.bobabelga.DecoratorDesignPattern;

public class Chicken extends PizzaDecorator {
    public Chicken(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 10;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Chicken";
    }
}
