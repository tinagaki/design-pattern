package com.example.designpatterns.prototype;

import java.util.HashMap;

public class Manager {
    private HashMap hashMap = new HashMap();

    public void register(String name, Prototype prototype) {
        hashMap.put(name, prototype);
    }

    public Prototype create(String protoname) {
        //※
        Prototype p = (Prototype) hashMap.get(protoname);
        return p.createClone();
    }
}
