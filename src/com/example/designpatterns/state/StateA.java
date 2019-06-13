package com.example.designpatterns.state;

public class StateA implements State {

    public StateA(final State state) {
        // なんか初期設定
    }

    @Override
    public State execute(final State state) {
        System.out.println("StateAの実行");
        return new StateB(this);
    }
}
