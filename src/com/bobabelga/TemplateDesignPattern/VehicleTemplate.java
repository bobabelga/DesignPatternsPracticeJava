package com.bobabelga.TemplateDesignPattern;

public abstract class VehicleTemplate {

    public final void buildVehicle(){
        collectComponents();
        assembleComponents();
        installGearBox();
        startVehicle();
        System.out.println("Vehicle is on");
    }

    private void startVehicle() {
        System.out.println("Engine is powering up");
    }

    private void collectComponents() {
        System.out.println("Bring rear and front light, tires, chairs");
    }

    protected abstract void installGearBox();

    protected abstract void assembleComponents();

}
