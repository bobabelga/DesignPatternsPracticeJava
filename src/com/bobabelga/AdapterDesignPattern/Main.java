package com.bobabelga.AdapterDesignPattern;

public class Main {
    public static void main(String[] args) {
        //Create BicycleAdapter Class for adapt Bicycle Class with Vehicle Class
        Vehicle car = new Car();
        car.accelerate();
        car.pushBreak();
        car.soundHorn();
        System.out.println();
        Vehicle bike = new BicycleAdapter(new Bicycle());
        bike.accelerate();
        bike.pushBreak();
        bike.soundHorn();
    }
}
