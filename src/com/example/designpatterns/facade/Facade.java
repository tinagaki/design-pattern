package com.example.designpatterns.facade;

public class Facade {
    public void execute(){
       ClassA classA = new ClassA();
       classA.hogehoge();
        ClassB classB = new ClassB();
        classB.hogahoga();
        ClassC classC = new ClassC();
        classC.fugefuge();

    }
}
