package com.bobabelga;

import com.bobabelga.FactoryDesignPattern.Sandwich;
import com.bobabelga.FactoryDesignPattern.SandwichFactory;
import com.bobabelga.ObserverDesignPattern.Course;
import com.bobabelga.ObserverDesignPattern.Student;
import com.bobabelga.SingletonDesignPattern.Single;

public class Main {

    public static void main(String[] args) {

        // ** Start Singleton Design Pattern Example **
        // Create two object from Single Class and the result was =>  Just one object Created and printed data once
         Single single1 = Single.getInstance();
        single1.printData();
        Single single2 = Single.getInstance();
        single2.printData();

        System.out.println("\n");
        // ** End Singleton Design Pattern Example **


        // ** Start Observer Design Pattern Example **
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
        // ** End Observer Design Pattern Example **


        // ** Start Factory Design Pattern Example **
        // Prepare Sandwich from Class SandwichFactory

        System.out.println();
        Sandwich sandwich = SandwichFactory.createSandwich(SandwichFactory.CHEESEBURGER);
        sandwich.prepare();

        // ** End Factory Design Pattern Example **

    }
}
