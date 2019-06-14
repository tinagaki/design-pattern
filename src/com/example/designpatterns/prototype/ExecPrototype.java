package com.example.designpatterns.prototype;

public class ExecPrototype {
    public static void main(String[] args) {
        Manager manager = new Manager();

        ClassA classA = new ClassA();
        ClassB classB = new ClassB();

        manager.register("AAAAA", classA);
        manager.register("BBBBB", classB);

        Prototype p1 = manager.create("AAAAA");
        p1.use("一個目");
        Prototype p4 = manager.create("AAAAA");
        p4.use("二個目");

        Prototype p2 = manager.create("BBBBB");
        p2.use("asdfg");
    }
}
