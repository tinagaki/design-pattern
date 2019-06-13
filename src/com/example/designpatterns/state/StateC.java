package com.example.designpatterns.state;

public class StateC implements State {
    public StateC(final State state) {
        // なんか初期設定

    }

    @Override
    public State execute(final State state) {
        System.out.println("StateCの実行");
        return null;
    }
}
