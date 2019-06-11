package com.example.designpatterns.observer;

import java.util.Random;

public class RandomGenerator extends Generator{
    private Random random = new Random();
    private int number;

    public int getNumber() {
        return number;
    }

    public void execute() {
        System.out.println("execute");
//        for (int i = 0; i < 20; i++) {
            number = random.nextInt(50);
            notifyObservers();
//        }
    }
}
