package com.example.designpatterns.proxy;

public class Proxy extends AbstractRead {
    private Read read;

    @Override
    public void read() {
        if (read == null) {
            this.read = new Read();

        }

        System.out.println("代理実行");
        read.read();
    }

    @Override
    public void close() {
        if (read == null) {
            this.read = new Read();

        }
        System.out.println("代理実行");
        read.close();
    }
}
