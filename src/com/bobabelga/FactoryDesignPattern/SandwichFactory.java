package com.bobabelga.FactoryDesignPattern;

public class SandwichFactory {

    public static final int CHEESEBURGER = 1 ;
    public static final int CHICKENBURGER = 2 ;

    public static Sandwich createSandwich(int sandwichId){
        switch (sandwichId){
            case CHEESEBURGER: return new CheeseBurger();
            case CHICKENBURGER: return new ChickenBurger();
            default: return null;
        }
    }
}
