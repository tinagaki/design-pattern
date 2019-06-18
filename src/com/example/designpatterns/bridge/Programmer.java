package com.example.designpatterns.bridge;

public class Programmer extends Job {


    @Override
    public void Work() {
        makeProgram();
    }

    public void makeProgram() {
        System.out.println("make program");

    }

}
