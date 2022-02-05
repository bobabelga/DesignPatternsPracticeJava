package com.bobabelga.CommandDesignPattern;

public class TvOn implements Command{
    Television tv;
    TvOn(Television tv){
        this.tv = tv;
    }
    @Override
    public void execute() {
        tv.turnOn();
    }
}
