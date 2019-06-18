package com.example.designpatterns.bridge;

public class Female extends Human {
    public Female(final Job job) {
        super(job);
        System.out.println("Female");

    }

    @Override
    public void eat() {

    }

    @Override
    public void sleep() {
    }
    // 特有の処理を書く
    public void birth(){

    }

}
