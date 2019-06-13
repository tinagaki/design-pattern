package com.example.designpatterns.builder;

public class ExecBuilder {
    public static void main(String[] args) {
        // これをしたくない
        HumanBuilder humanBuilder = new HumanBuilder("testtest",12,2);
        //こうしたい
        HumanBuilder humanBuilder1 = new HumanBuilder.Builder().age(20).name("aaa").sex(10).build();
    }
}
