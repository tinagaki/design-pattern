package com.example.designpatterns.chainofresponsibility;

public abstract class ChainofResponsibility {
    protected ChainofResponsibility next;
    protected String name;

    public ChainofResponsibility(final String name) {
        this.name = name;

    }
    public ChainofResponsibility setNext(ChainofResponsibility chainofResponsibility){
        this.next = chainofResponsibility;
        return chainofResponsibility;
    }
    public abstract void request(int req);
}
