package com.bobabelga.ObserverDesignPattern;

public class Main {
    public static void main(String[] args) {
        // Boba has notified the first time because he is subscribed
        // Boba has not notified the second time because he is unsubscribed
        System.out.println("Result before Boba Unsubscribed : ");
        Course java = new Course("Java");
        Student boba = new Student("Boba");
        Student rahim = new Student("Rahim");
        Student ahmed = new Student("Ahmed");
        java.subscribe(boba);
        java.subscribe(rahim);
        java.subscribe(ahmed);
        java.setAvailability(true);
        System.out.println("Result After Boba Unsubscribed : ");
        java.unsubscribe(boba);
        java.setAvailability(true);
    }
}
