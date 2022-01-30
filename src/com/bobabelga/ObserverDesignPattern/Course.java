package com.bobabelga.ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Course implements Subject{
    private String name;
    private String availability;
    private List<Observer> observerList;

    public Course(String name){
        this.name = name;
        observerList = new ArrayList<>();
    }

    public void setAvailability (boolean available){
        availability = this.name + (available ? " Available" : " Not Available");
        notifyAllSubscribes();
    }

    @Override
    public void subscribe(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyAllSubscribes() {
        for(Observer observer:observerList){
            observer.update(availability);
        }
    }
}
