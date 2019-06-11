package com.example.designpatterns.singleton;

public class Singleton {
    private static Singleton singleton = new Singleton();

    private Singleton(){
        System.out.println("インスタンスを作成しました。");
    }
    public static Singleton getSingleton(){
        return singleton;
    }

}
