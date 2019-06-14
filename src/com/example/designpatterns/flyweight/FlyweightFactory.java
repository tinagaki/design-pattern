package com.example.designpatterns.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {

    Map<String, Flyweight> pool;

    FlyweightFactory() {
        this.pool = new HashMap<String, Flyweight>();
    }

    Flyweight get(String string) {
        Flyweight flyweight = this.pool.get(string);
        if (flyweight == null) {
            flyweight = new Flyweight(string);
            this.pool.put(string, flyweight);
            System.out.println("new されました。");
        }
        return flyweight;

    }
}
