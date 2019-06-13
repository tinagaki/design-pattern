package com.example.designpatterns.state;

public interface State {
    State execute(State state);
}
