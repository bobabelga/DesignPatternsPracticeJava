package com.bobabelga.TemplateDesignPattern;

public class Main {
    public static void main(String[] args) {
        VehicleTemplate car = new Car();
        car.buildVehicle();
        System.out.println("_____________________________________");
        VehicleTemplate truck = new Truck();
        truck.buildVehicle();
    }
}
