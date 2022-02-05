package com.bobabelga.CommandDesignPattern;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Television tv = new Television();
        RemoteControl remoteControl = new RemoteControl(2);
        Command tvOn = new TvOn(tv);
        Command tvOff = new TvOff(tv);
        remoteControl.addCommand(0,tvOn,tvOff);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose: 1 for On Tv, 2 for Off Tv");
        int choice = scanner.nextInt();

        if (choice == 1) remoteControl.onButtonPressed(0);
        else if (choice == 2) remoteControl.offButtonPressed(0);

    }
}
