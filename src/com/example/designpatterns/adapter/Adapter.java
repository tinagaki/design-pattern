package com.example.designpatterns.adapter;

public class Adapter extends OldClassA implements AdapterInterface {
    @Override
    public int getPrice() {
        return getCost();
    }
}
