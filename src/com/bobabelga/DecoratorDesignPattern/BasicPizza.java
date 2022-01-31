package com.bobabelga.DecoratorDesignPattern;

public class BasicPizza implements Pizza{
    @Override
    public double getPrice() {
        return 50;
    }

    @Override
    public String getDescription() {
        return "Basic Pizza ";
    }
}
