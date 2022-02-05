package com.bobabelga.CommandDesignPattern;

public class RemoteControl {
    private Command[] commandOnList;
    private Command[] commandOffList;

    RemoteControl(int numOfDevices) {
        commandOnList = new Command[numOfDevices];
        commandOffList = new Command[numOfDevices];
    }
    public void addCommand(int slot,Command commandOn,Command commandOff){
        commandOnList[slot] = commandOn;
        commandOffList[slot] = commandOff;
    }
    public void onButtonPressed(int slot){
        commandOnList[slot].execute();
    }
    public void offButtonPressed(int slot){
        commandOffList[slot].execute();
    }

}
