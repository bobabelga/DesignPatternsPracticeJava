package com.bobabelga.CommandDesignPattern;

public class TvOff implements Command{
    Television tv;
    TvOff(Television tv){
        this.tv = tv;
    }
    @Override
    public void execute() {
        tv.turnOff();
    }
}
