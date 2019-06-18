package com.example.designpatterns.bridge;

public abstract class Human {
    protected Job job;
    public Human(Job job){
        this.job = job;
    }
    public abstract void eat();
    public void working(){
        this.job.Work();
    }
    public abstract void sleep();


}
