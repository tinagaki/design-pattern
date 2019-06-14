package com.example.designpatterns.prototype;

public class ClassA implements Prototype {
    @Override
    public void use(String string) {
        System.out.println("ClassB use "+string);
    }

    @Override
    public Prototype createClone() {
        Prototype p = null;
        try {
            p = (Prototype) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}
