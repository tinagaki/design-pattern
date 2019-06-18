package com.example.designpatterns.bridge;

public class ExecBridge {
    public static void main(String[] args) {
        System.out.println("Female Designer");
        Human female = new Female(new Designer());
        female.working();

        System.out.println("Male Programmer");

        Human male = new Male(new Programmer());
        male.working();
    }
}

