package com.example.designpatterns.prototype;

public interface Prototype extends Cloneable{
    public abstract void use(String string);
    public abstract Prototype createClone();

}
