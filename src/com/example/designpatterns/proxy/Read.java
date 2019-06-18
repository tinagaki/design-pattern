package com.example.designpatterns.proxy;

public class Read extends AbstractRead {
    @Override
    public void read() {
        System.out.println("read するよ");
    }

    @Override
    public void close() {
        System.out.println("close するよ");
    }
}
