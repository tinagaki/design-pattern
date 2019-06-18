package com.example.designpatterns.bridge;

public class Male extends Human {
    public Male(final Job job) {
        super(job);
        System.out.println("Male");

    }

    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }
}
