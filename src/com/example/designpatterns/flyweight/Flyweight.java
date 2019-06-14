package com.example.designpatterns.flyweight;

public class Flyweight {
    String type;
    Flyweight(String type){
        this.type = type;
    }
    void print (){
        System.out.println(this.type);
    }
}
