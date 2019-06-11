package com.example.designpatterns.abstractfactory;


public class ExecAbstractFactory {
    public static void main(String[] args) {
        AbstractFactory ab = exec("usa");
        AbstractHuman human = ab.getRace();
        human.speak();

    }
    public static AbstractFactory exec(String env){
        if (env == "japan") {
            return new JapaneseFactory();
        } else {
            // (env == "usa")
            return new AmericanFactory();
        }

    }

}
