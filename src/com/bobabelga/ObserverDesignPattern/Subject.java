package com.bobabelga.ObserverDesignPattern;

public interface Subject {
    void subscribe(Observer observer);
    void unsubscribe(Observer observer);
    void notifyAllSubscribes();
}
