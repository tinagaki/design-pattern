package com.example.designpatterns.proxy;

public class ExecProxy {
    public static void main(String[] args) {
        AbstractRead read = new Proxy();
        read.read();
        read.close();
    }
}
