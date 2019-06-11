package com.example.designpatterns.observer;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class Generator {
    private ArrayList observers = new ArrayList();
    public void add(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers() {
        Iterator iterator = observers.iterator();
        while (iterator.hasNext()) {
            Observer obserber = (Observer)iterator.next();
            obserber.create((RandomGenerator) this);
        }
    }

    public abstract int getNumber();
    //必須内容
    public abstract void execute();


}
