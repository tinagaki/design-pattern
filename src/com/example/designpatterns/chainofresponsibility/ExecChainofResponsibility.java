package com.example.designpatterns.chainofresponsibility;

public class ExecChainofResponsibility {
    public static void main(String[] args) {
        ChainofResponsibility chainofResponsibility = new ClassA("a",false);
        ChainofResponsibility chainofResponsibility1 = new ClassA("b",true);
        ChainofResponsibility chainofResponsibility2 = new ClassB("c");

        chainofResponsibility.setNext(chainofResponsibility1).setNext(chainofResponsibility2);
        chainofResponsibility.request(2);

    }
}
