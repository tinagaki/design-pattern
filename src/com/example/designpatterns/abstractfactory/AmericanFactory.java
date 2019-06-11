package com.example.designpatterns.abstractfactory;

public class AmericanFactory extends AbstractFactory{

    @Override
    public AbstractHuman getRace() {
        return new American();
    }
}
