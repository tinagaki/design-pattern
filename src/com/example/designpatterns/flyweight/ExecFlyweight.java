package com.example.designpatterns.flyweight;

import java.util.ArrayList;
import java.util.List;

public class ExecFlyweight {
    public static void main(String[] args) {
        FlyweightFactory flyweightFactory = new FlyweightFactory();

        List<Flyweight> flyweights = new ArrayList<Flyweight>();
        flyweights.add(flyweightFactory.get("AA"));
        flyweights.add(flyweightFactory.get("AA"));
        flyweights.add(flyweightFactory.get("AA"));
        flyweights.add(flyweightFactory.get("AA"));
        flyweights.add(flyweightFactory.get("AA"));
        flyweights.add(flyweightFactory.get("AA"));
        flyweights.add(flyweightFactory.get("BB"));
        flyweights.add(flyweightFactory.get("AA"));


        for(Flyweight flyweight  : flyweights){
            flyweight.print();
        }
    }
}
