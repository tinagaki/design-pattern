package com.example.designpatterns.observer;

import java.util.Random;

public class ObserverA implements Observer {

    @Override
    public void create(final RandomGenerator generator) {
        System.out.println("ObserverA:" + generator.getNumber());

    }
}
