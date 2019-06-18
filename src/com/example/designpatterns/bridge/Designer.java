package com.example.designpatterns.bridge;

public class Designer extends Job {

    @Override
    public void Work() {
        makeDesign();
    }

    public void makeDesign(){
        System.out.println("make Design");

    }
}
