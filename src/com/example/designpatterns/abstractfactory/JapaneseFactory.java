package com.example.designpatterns.abstractfactory;

public class JapaneseFactory extends AbstractFactory {
    @Override
    public AbstractHuman getRace() {
        return new Japanese();

    }
}
