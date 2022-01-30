package com.bobabelga.SingletonDesignPattern;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Single {
    private Integer[] numbers = {1, 2, 3, 4, 5, 6, 7};
    private List<Integer> list = Arrays.asList(numbers);
    private static Single instance;

    public static Single getInstance() {
        if (instance == null) {
            instance = new Single();
        }
        return instance;
    }

    private Single() {
        System.out.println("Object Created");
        Collections.shuffle(list);
        System.out.println(this.hashCode());
    }


    public void printData(){
        for (Integer i : list) {
            System.out.print(i+" ");
        }
    }
}
