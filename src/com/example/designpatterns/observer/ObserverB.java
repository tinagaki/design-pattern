package com.example.designpatterns.observer;

public class ObserverB implements Observer{
    @Override
    public void create(final RandomGenerator generator) {
        System.out.println("ObserverB:" + generator.getNumber());

    }
}
