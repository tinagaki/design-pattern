package com.example.designpatterns.chainofresponsibility;

public class ClassB extends ChainofResponsibility {


    public ClassB(String name) {
        super(name);

    }

    @Override
    public void request(final int number) {
        if (number == 2) {
            // ここでこのクラスが実施できるかのチェックロジック　OKなら処理を継続して終わるようにする
            System.out.println(this.name + "チェックの結果実行できるので実行します");
            System.out.println("--- hogehoge ----");


        } else if (this.next != null) {
            //実施できない&次がまだ存在する場合はそっちにまかせる
            System.out.println(this.name + " 次の処理におまかせします。");

            next.request(number);

        } else {
            // 実施するものがいない場合はここで終わるようにする
            System.out.println(this.name + "実施できるやつがいないので終わります。");

        }
    }
}