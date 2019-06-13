package com.example.designpatterns.adapter;

public class ExecAdapter {
    public static void main(String[] args) {
        Adapter adapter = new Adapter();
        int price = adapter.getPrice();
        System.out.println(price);
    }
}
