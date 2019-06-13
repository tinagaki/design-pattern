package com.example.designpatterns.state;

public class ExecState {
    public static void main(String[] args) {
        State sts = new StateA(null);
        //	次の状態がnullになるまで
        while(sts != null)
        {
            //	実行する
            sts = sts.execute(sts);
        }
        // 処理をどんどん追加できるメリット
    }
}
