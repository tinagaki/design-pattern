package com.example.designpatterns.observer;

public class ExecObserver {
    public static void main(String[] args) {
        RandomGenerator generator = new RandomGenerator();
        ObserverA observerA = new ObserverA();
        ObserverB observerB = new ObserverB();
        generator.add(observerA);
        generator.add(observerB);
        generator.execute();

    }
}
