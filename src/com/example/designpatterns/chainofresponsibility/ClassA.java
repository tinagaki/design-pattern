package com.example.designpatterns.chainofresponsibility;

public class ClassA extends ChainofResponsibility {

    private final Boolean canC = true;
    private final Boolean checkAFlg;

    public ClassA(final String name, Boolean checkAFlg) {
        super(name);
        this.checkAFlg = checkAFlg;
    }

    @Override
    public void request(final int number) {
        if (number == 1 && canC == checkAFlg) {
            // ここでこのクラスが実施できるかのチェックロジック　OKなら処理を継続して終わるようにする
            System.out.println(this.name + " チェックの結果実行できるので実行します");
            System.out.println("--- hugahuga ----");


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
