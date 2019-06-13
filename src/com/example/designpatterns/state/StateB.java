package com.example.designpatterns.state;

public class StateB implements State {


    public StateB(final State state) {
        // なんか初期設定

    }

    @Override
    public State execute(final State state) {
        System.out.println("StateBの実行");
        return new StateC(this);
    }
}
