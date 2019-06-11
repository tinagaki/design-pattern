package com.example.designpatterns.singleton;

public class ExecSingleton {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getSingleton();
        Singleton instance2 = Singleton.getSingleton();

        if (instance1 == instance2) {
            System.out.println("same");
        } else {
            System.out.println("not same");
        }
    }
}
