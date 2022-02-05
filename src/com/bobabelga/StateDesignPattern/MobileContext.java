package com.bobabelga.StateDesignPattern;

public class MobileContext {
    MobileAlertState currentState;
    public MobileContext(){
        currentState = new Ringing();
    }
    public void setState(MobileAlertState state) {
        currentState = state;
    }
    public void alert(){
        currentState.alert();
    }
}
